package com.demo.servelet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PhaniGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside Service method");
		String ename =request.getParameter("ename");
		String esal = request.getParameter("esal");
		System.out.println(ename);
		System.out.println(esal);
	}

}
