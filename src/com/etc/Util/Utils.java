package com.etc.Util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Utils {
	// ��¼У��
	public static boolean doLogin(String username, String password) {
		if(username.equals("user") && password.equals("123456")){
			return true;
		}else{
			return false;
		}
	}
	// cookieУ�� �Ƿ����ã���¼֮ǰУ��/��������
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
