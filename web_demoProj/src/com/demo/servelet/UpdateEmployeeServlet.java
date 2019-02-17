package com.demo.servelet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;

public class UpdateEmployeeServlet extends HttpServlet{

	EmployeeService empSer = null;
	Employee emp =null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		empSer =new EmployeeService();
		System.out.println("inside Get method");
		int empId =Integer.parseInt(req.getParameter("eid"));
		int sal =Integer.parseInt(req.getParameter("esal"));
		try {
		String out =empSer.updateEmp(empId, sal);
		System.out.println(out);
		
if (out.equalsIgnoreCase("employee salary updated")) {
	    	
	req.getRequestDispatcher("Success.jsp").forward(req, resp);	
		}else {
			req.getRequestDispatcher("failureNoemupdated.jsp").forward(req, resp);
		}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}
}
