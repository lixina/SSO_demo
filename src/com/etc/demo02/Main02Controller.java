package com.etc.demo02;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.Util.Utils;

@WebServlet("demo2")
public class Main02Controller {
	
	public void doCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// ������ҳǰУ��cookie
		boolean result = Utils.checkCookie(request);
		if(result){
			// ������ҳ
			response.sendRedirect("main02.jsp");
		}else{
			// ���ص�¼
			response.sendRedirect("login.jsp");
		}
	}
}
