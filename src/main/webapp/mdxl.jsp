<!DOCTYPE html>
<head>
    <script src="js/jquery-3.1.0.js" type="text/javascript" ></script>
    <script type="text/javascript">
        jQuery(function($){
            //方法1 不使用闭包
//            var list = $("li");
//            for(var i=0; i<list.length; i++){
//                $(list[i]).attr("index",i+1);
//            }
//            $("li").click(function () {
//                alert($(this).attr("index"));
//            })
            //方法2 错误写法使用闭包
//            function A(){
//                var list = $("li");
//
//                for(var i = 0, l = list.length; i < l; i++){
//                    $(list[i]).onclick = ((function(j){
//                        return function(){
//                            alert(j);
//                        }
//                    })(i+1))
//                }};
//            A();
            //方法2 使用闭包(正确写法)
            function A(){
                var list = $("li");

                for(var i = 0, l = list.length; i < l; i++){
                    $(list[i]).click((function(j){
                        return function(){
                            alert(j);
                        }
                    })(i+1))
                }};
            A();



            $("#test").css("color","blue");
//全选
            $("#btn1").click(function(){
                $("input[name='checkbox']").attr("checked","true");
            })
//取消全选
            $("#btn2").click(function(){
                $("input[name='checkbox']").removeAttr("checked");
            })
//选中所有基数
            $("#btn3").click(function(){
                $("input[name='checkbox']:even").attr("checked","true");
            })
//选中所有偶数
            $("#btn6").click(function(){
                $("input[name='checkbox']:odd").attr("checked","true");
            })
//反选
            $("#btn4").click(function(){
                $("input[name='checkbox']").each(function(){
                    if($(this).attr("checked"))
                    {
                        $(this).removeAttr("checked");
                    }
                    else
                    {
                        $(this).attr("checked","true");
                    }
                })
            })
//或许选择项的值
            var aa="";
            $("#btn5").click(function(){
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                })
                document.write(aa);
            })
        })
    </script>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <input type="text" id="a"/>
    <form id="form1" runat="server">
        <div>
            <input type="button" id="btn1" value="全选">
            <input type="button" id="btn2" value="取消全选">
            <input type="button" id="btn3" value="选中所有奇数">
            <input type="button" id="btn6" value="选中所有偶数">
            <input type="button" id="btn4" value="反选">
            <input type="button" id="btn5" value="获得选中的所有值">
            <br>
            <input type="checkbox" name="checkbox" value="checkbox1">
            checkbox1
            <input type="checkbox" name="checkbox" value="checkbox2">
            checkbox2
            <input type="checkbox" name="checkbox" value="checkbox3">
            checkbox3
            <input type="checkbox" name="checkbox" value="checkbox4">
            checkbox4
            <input type="checkbox" name="checkbox" value="checkbox5">
            checkbox5
            <input type="checkbox" name="checkbox" value="checkbox6">
            checkbox6
            <input type="checkbox" name="checkbox" value="checkbox7">
            checkbox7
            <input type="checkbox" name="checkbox" value="checkbox8">
            checkbox8
        </div>
        <div id = 'test'>测试</div>
        <ul id="t">
            <li>这是第一条</li>
            <li>这是第二条</li>
            <li>这是第三条</li>
        </ul>
    </form>

    <div class="class-a">
        <div class="class-b" id="div-c">
            <span class="span-a"></span>
        </div>
        <div class="class-c" id="class-b">
            <span class="span-a span-b"></span>
        </div>

    </div>
    <br>
    <div>
            什么是语义话的html？
        <br>http://blog.csdn.net/xujie_0311/article/details/42403695
        随着 CSS 的深入人心，结构、表现与行为的逐渐分离，HTML 语义化成了炙手可热的卖点。说简单一点就是1、语义化的html只用来搭建网页的结构，去掉css后，网页结构不会变；2、看到内容的时候想到用什么标签去描述，能用<p>就不用<div>
    </div>
        CSS Sprites简介
        编辑
        加速的关键，不是降低质量，而是减少个数。传统切图讲究精细，图片规格越小越好，重量越小越好，其实规格大小无所谓，计算机统一都按byte计算。客户端每显示一张图片都会向服务器发送请求。所以，图片越多请求次数越多，造成延迟的可能性也就越大。
        CSS Sprites原理
        编辑
        CSS Sprites其实就是把网页中一些背景图片整合到一张图片文件中，再利用CSS的“background-image”，“background- repeat”，“background-position”的组合进行背景定位，background-position可以用数字精确的定位出背景图片的位置。
        CSS Sprites优缺点
        编辑
        优点
        1.利用CSS Sprites能很好地减少网页的http请求，从而大大的提高页面的性能，这也是CSS Sprites最大的优点，也是其被广泛传播和应用的主要原因；
        2.CSS Sprites能减少图片的字节，曾经比较过多次3张图片合并成1张图片的字节总是小于这3张图片的字节总和。
        3.解决了网页设计师在图片命名上的困扰，只需对一张集合的图片上命名就可以了，不需要对每一个小元素进行命名，从而提高了网页的制作效率。
        4.更换风格方便，只需要在一张或少张图片上修改图片的颜色或样式，整个网页的风格就可以改变。维护起来更加方便。
        缺点
        诚然CSS Sprites是如此的强大，但是也存在一些不可忽视的缺点，如下：
        1.在图片合并的时候，你要把多张图片有序的合理的合并成一张图片，还要留好足够的空间，防止板块内出现不必要的背景；这些还好，最痛苦的是在宽屏，高分辨率的屏幕下的自适应页面，你的图片如果不够宽，很容易出现背景断裂；
        2.CSS Sprites在开发的时候比较麻烦，你要通过photoshop或其他工具测量计算每一个背景单元的精确位置，这是针线活，没什么难度，但是很繁琐；幸好腾讯的鬼哥用ADOBE AIR开发了一个CSS Sprites 样式生成工具，虽然还有一些使用上的不灵活，但是已经比photoshop测量来的方便多了，而且样式直接生成，复制，拷贝就OK！
        3.CSS Sprites在维护的时候比较麻烦，如果页面背景有少许改动，一般就要改这张合并的图片，无需改的地方最好不要动，这样避免改动更多的css，如果在原来的地方放不下，又只能（最好）往下加图片，这样图片的字节就增加了，还要改动css。
        4.CSS Sprites非常值得学习和应用，特别是页面有一堆icon（图标）。总之很多时候大家要权衡一下利弊，再决定是不是应用CSS Sprites。

    <script>
        $(function () {
            var count = $(".span-a");
            alert("[class为span-a]的元素的个数为："+count.length);

            //获取到class同时包含span-a 和span-b的元素
            var aa = $(".span-a.span-b")
            $(".span-a").append("<h1>sdfsdf</h1>")
        })


    </script>

</body>
</html>