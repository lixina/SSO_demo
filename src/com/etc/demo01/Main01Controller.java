package com.etc.demo01;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.Util.Utils;

@WebServlet("demo1")
public class Main01Controller {
	
	public void doCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 进入首页前校验cookie
		boolean result = Utils.checkCookie(request);
		if(result){
			// 进入首页
			response.sendRedirect("main01.jsp");
		}else{
			// 返回登录
			response.sendRedirect("login.jsp");
		}
	}
}
