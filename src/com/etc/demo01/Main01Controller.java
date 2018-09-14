package com.etc.demo01;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.Util.Utils;

@WebServlet("demo1")
public class Main01Controller {
	
	public void doCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// ������ҳǰУ��cookie
		boolean result = Utils.checkCookie(request);
		if(result){
			// ������ҳ
			response.sendRedirect("main01.jsp");
		}else{
			// ���ص�¼
			response.sendRedirect("login.jsp");
		}
	}
}
