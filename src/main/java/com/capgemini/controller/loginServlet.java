package com.capgemini.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.model.Login;
import com.capgemini.service.LoginService;
import com.capgemini.service.LoginServiceImpl;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		
		//Bind input with POJO
		Login login=new Login();
		login.setUserName(userName);
		login.setUserPwd(userPwd);
		
		
		LoginService loginService=new LoginServiceImpl();
		boolean value= loginService.isValidUser(login);
		
		if(value)
			response.sendRedirect("pages/success.html");
		else
			response.sendRedirect("home.html");
		
	}

}
