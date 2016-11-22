
package com.dazhuangzhou.util;

import java.util.Locale;

public class Constants {

	public static final String MSG_SUCCESS = "{success:true,msg:'success'}";
	public static final String MSG_FAILURE = "{success:false,msg:'failure'}";
	public static final String MSG_DONE = "{success:true,msg:'err_done'}";
	public static final String USER_FULL_INFO_KEY = "USER_FULL_INFO_KEY";
	
	//域名
	public static final String DOMAIN = "dazhuangzhou.com";
	public static final String SMTP_HOST = "smtp.exmail.qq.com";
	public static final String TITLE = "星瑜丽：密码找回";
	public static final String CONTENT = "%s,您好!<br />您的管理密码是：%s<br />请您妥善保管您的管理密码！祝您工作愉快";
	public static final String SENDER = "xyl_manager@dazhuangzhou.com";
	public static final String SENDER_NAME = "xyl_manager@dazhuangzhou.com";
	public static final String SENDER_PWD = "dazhuangzhou";
	
	//验证码
	public static final String VALIDATE_KEY = "VALIDATE_KEY";
	
	public static final String VALIDATE_KEY_1 = "VALIDATE_KEY_1";
	
	public static final String USER_KEY = "managerVO";
	
	public static final String ADMIN_KEY = "managerVO";
	
    public static final String USER_ROLE_MENU_KEY = "USER_ROLE_MENU_KEY";
    
    public static final String USER_ROLE_FIRST_LEVEL_MENU_KEY = "USER_ROLE_FIRST_LEVEL_MENU_KEY";
    
    public static final String USER_ROLE_ALL_MENU_KEY = "USER_ROLE_ALL_MENU_KEY";
    
	public static final String EMPTY_STRING = "";
	
	public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
	/*******************************登录***************************************/

	public static final String MSG_ERROR_USERNAME_PASSWORD="MSG_ERROR_USERNAME_PASSWORD";
	public static final String MSG_ERROR_USERNAME_PASSWORD_NULL="MSG_ERROR_USERNAME_PASSWORD_NULL";
	public static final String MSG_ERROR_RANDCODE="MSG_ERROR_RANDCODE";
    
	/*******************************注册***************************************/
	public static final String  MSG_ERROR_USERNAME_EXIST="MSG_ERROR_USERNAME_EXIST";
	public static final String  MSG_ERROR_USERNAME_EMPTY="MSG_ERROR_USERNAME_EMPTY";
	public static final String  MSG_ERROR_RANDCODE_WRONG = "MSG_ERROR_RANDCODE_WRONG";
	public static final String  MSG_ERROR_REGISTER_WRONG = "MSG_ERROR_REGISTER_WRONG";
	public static final String  MSG_ERROR_USERNAME_REGISTER="MSG_ERROR_USERNAME_REGISTER";
	
	/******************************语言**************************************/
	public static final String I18N_LOCALE = "WW_TRANS_I18N_LOCALE";
	public static final Locale US = Locale.US;
	public static final Locale CHINA = Locale.CHINA;
}
