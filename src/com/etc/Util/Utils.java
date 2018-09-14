package com.etc.Util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Utils {
	// 登录校验
	public static boolean doLogin(String username, String password) {
		if(username.equals("user") && password.equals("123456")){
			return true;
		}else{
			return false;
		}
	}
	// cookie校验 是否有用（登录之前校验/拦截器）
	public static Boolean checkCookie(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null && !cookies.equals("")){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("loginCookie") 
						&& cookie.getValue().equals("success")){
					return true;
				}
			}
		}
			return false;
	}
}
