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
		// ����username��ȡ����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gotoUrl = request.getParameter("gotoUrl");
		// ��¼
		boolean result = Utils.doLogin(username, password);
		System.out.println(username + password + result);
		
		if(result){
			// ����Ϣ���浽cookie
			Cookie cookie = new Cookie("loginCookie", "success");
			// ����cookie·��������·�����㣩
			cookie.setPath("/");

			response.addCookie(cookie);
			
			// ������ҳ
			response.sendRedirect(gotoUrl);
		}else{
			// �������ҳ��
			response.sendError(404);
		}
	}
}
