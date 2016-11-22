package offer;

import org.junit.Before;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.SortingParams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 16-10-3.
 */
public class RedisTest {
    JedisPool pool;
    Jedis jedis;
    @Before
    public void setUp() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

        pool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379,5000,"123");

        jedis = pool.getResource();
    }

    /**
     * Redis存储字符串
     * CRUD
     */
    @org.junit.Test
    public void testString(){
        //-----添加数据----------
        jedis.set("name","zhangsan");//添加键值对name:zhangsan
        System.out.println(jedis.get("name"));//执行结果：zhangsan

        //-----修改数据----------
        jedis.set("name", "lisi");
        System.out.println(jedis.get("name"));//执行结果：lisi

        //-----追加数据-----------
        jedis.append("name","哥哥");
        System.out.println(jedis.get("name"));//执行结果:lisi哥哥

        //-----删除数据-----------
        jedis.del("name");
        System.out.println(jedis.get("name"));//执行结果：null

        //批量增加数据
        jedis.mset("name","zhangsan","age","21");
        System.out.println(jedis.mget("name","age"));//执行结果：[zhangsan,21]
    }


    /**
     * Redis存储List
     */
    @org.junit.Test
    public void testList() {
        //开始前，先清除List中的所有元素
        jedis.del("Database");
        System.out.println(jedis.lrange("Database", 0, -1));

        //-----向key值为Database的List中添加数据-----------
        //rpush()表示往右边添加，lpush()表示往左边添加
        jedis.rpush("Database", "MySql");
        jedis.rpush("Database", "Oracle");
        jedis.rpush("Database", "SQL Server");
        jedis.rpush("Database", "DB2");
        jedis.rpush("Database", "Access");

        //-----从key值为Database的List中取数据-----------
        //第一个是key，第二个是起始位置，第三个是结束位置。如果第二个参数是-1，表示取出所有
        System.out.println(jedis.lrange("Database", 0, -1));
        //获取列表中指定下标的值
        System.out.println(jedis.lindex("Database", 0));

        //-----修改List中指定下标的元素的值-----------
        jedis.lset("Database", 3, "Sybase");
        System.out.println(jedis.lrange("Database", 0, -1));

        //-----删除List中的元素-----------
        //删除列表中指定值的元素，第二个参数为元素的个数，第三个参数为元素的值
        jedis.lrem("Database", 1, "Sybase");
        System.out.println(jedis.lrange("Database", 0, -1));
        //删除区间以外的数据
        jedis.ltrim("Database", 0, 2);
        System.out.println(jedis.lrange("Database", 0, -1));

        //-----其他操作-----------
        //获取数组的长度
        System.out.println(jedis.llen("Database"));
        //为数组排序
        System.out.println(jedis.sort("Database",new SortingParams().alpha()));
    }

    /**
     * Redis存储Set
     * CRUD
     */
    @org.junit.Test
    public void testSet(){
        //-----往Set中添加数据-----------
        jedis.sadd("language","Java");
        jedis.sadd("language","C语言");
        jedis.sadd("language","C++");
        jedis.sadd("language","JavaScript");

        //-----获取Set中的元素-----------
        //获取所有的元素
        System.out.println(jedis.smembers("language"));

        //-----删除Set中的某个元素-----------
        jedis.srem("language","Java");
        System.out.println(jedis.smembers("language"));

        //-----其他操作-----------
        //判断某个元素是否在集合内
        System.out.println(jedis.sismember("language", "Java"));
        //返回集合中元素的个数
        System.out.println(jedis.scard("language"));
    }

    /**
     * Redis存储SortedSet
     * CRUD
     */
    @org.junit.Test
    public void testSortedSet(){
        //-----往SortedSet中添加数据-----------
        //第二个参数是元素的权重，权重大的排在后面
        jedis.zadd("course",1000,"C语言");
        jedis.zadd("course",1001,"数据结构");
        jedis.zadd("course",1004,"计算机网络");
        jedis.zadd("course",1002,"数据库");


        //-----获取SortedSet中的元素-----------
        //获取所有的元素
        System.out.println(jedis.zrange("course", 0, -1));

        //-----删除SortedSet中的某个元素-----------
        //删除指定元素
        jedis.zrem("course","数据结构");
        System.out.println(jedis.zrange("course",0,-1));

        //-----其他操作-----------
        //返回集合中元素的个数
        System.out.println(jedis.zcard("course"));
        //返回某个范围内元素的个数
        System.out.println(jedis.zcount("course", 1000.5,1002.5));
        //获取某个元素的权重
        System.out.println(jedis.zscore("course", "数据库"));
    }

    /**
     * Redis存储Hash
     * CRUD
     */
    @org.junit.Test
    public void testHash(){
        //-----存HashMap-----------
        Map<String,String> user=new HashMap<String,String>();
        user.put("name","zhangsan");
        user.put("password","123456");
        user.put("age", "21");
        jedis.hmset("user",user);

        //-----从HashMap中取元素-----------
        //取HashMap中某一个key的值
        List<String> userName = jedis.hmget("user", "name");
        System.out.println(userName);
        //取HashMap所有的key
        System.out.println(jedis.hkeys("user"));
        //取HashMap所有的value
        System.out.println(jedis.hvals("user"));
        //迭代取出HashMap中所有的键值对
        Iterator<String> it = jedis.hkeys("user").iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.print(key+":"+jedis.hmget("user", key)+";");
        }
        System.out.println();

        //-----删除HashMap中的某个键值-----------
        jedis.hdel("user", "age");
        System.out.println(jedis.hkeys("user"));

        //-----其他操作-----------
        //获取HashMap中键值对的个数
        System.out.println(jedis.hlen("user"));
        //某个key值的HashMap是否存在
        System.out.println(jedis.exists("user"));
    }
}
