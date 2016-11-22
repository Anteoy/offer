/**
 * 拦截器： 检查session内用户是否存在
 */
package com.dazhuangzhou.interceptor;

import com.dazhuangzhou.util.Constants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * @author dazhuang.zhou
 *	自定义拦截器示例：验证用户登录信息是否过期
 */
public class InterceptorDemo extends AbstractInterceptor {

	private static final long serialVersionUID = -1129412004481368538L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session = invocation.getInvocationContext().getSession();
		session.put(Constants.USER_KEY, "YES");
		System.out.println("验证sturts的自定义拦截器：");
		if(session.containsKey(Constants.USER_KEY)){
			System.out.println("\t用户已经登录，action继续往下走");
			return invocation.invoke();
		}else{
			System.out.println("\t用户登录信息过期，回到loginAcion");
			return Action.LOGIN;
		}
	}
	
}
