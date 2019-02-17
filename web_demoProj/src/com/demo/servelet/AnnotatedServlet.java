package com.demo.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.calc.PhaniCalProj;
@WebServlet(value="/annotatedtest",loadOnStartup=0)
public class AnnotatedServlet extends HttpServlet {
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	//super.init();
	System.out.println("inside init annotation");
}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("Inside annotation do Get Method");
		
		PhaniCalProj p = new PhaniCalProj();
		
		System.out.println(p.sum(1, 5));
	}
	
	
}
