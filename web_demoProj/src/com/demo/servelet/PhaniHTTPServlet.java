package com.demo.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PhaniHTTPServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("inside Get method");
		String ename =req.getParameter("ename");
		String esal = req.getParameter("esal");
		String essn = req.getParameter("essn");
		String eaddress = req.getParameter("eaddress");
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(essn);
		System.out.println(eaddress);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		System.out.println("inside Post method");
		String ename =req.getParameter("ename");
		String esal = req.getParameter("esal");
		System.out.println(ename);
		System.out.println(esal);
	}

}
