package com.etc.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.Util.Utils;

@WebServlet("doLogin")
public class LoginController extends HttpServlet{
	
	public void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");
		// 根据username获取参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gotoUrl = request.getParameter("gotoUrl");
		// 登录
		boolean result = Utils.doLogin(username, password);
		System.out.println(username + password + result);
		
		if(result){
			// 将信息保存到cookie
			Cookie cookie = new Cookie("loginCookie", "success");
			// 设置cookie路径（访问路径顶层）
			cookie.setPath("/");

			response.addCookie(cookie);
			
			// 进入首页
			response.sendRedirect(gotoUrl);
		}else{
			// 进入错误页面
			response.sendError(404);
		}
	}
}
