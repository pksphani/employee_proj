package com.demo.servelet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;

public class GetEmployeeServlet extends HttpServlet{

	EmployeeService empSer = null;
	Employee emp =null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		empSer =new EmployeeService();
		System.out.println("inside Get method");
		int empId =Integer.parseInt(req.getParameter("eid"));
		try {
		emp=	empSer.getEmployee(empId);
		req.setAttribute("employee", emp);
		
if (emp!=null) {
	    	
	req.getRequestDispatcher("employeeDetails.jsp").forward(req, resp);	
		}else {
			req.getRequestDispatcher("failureNoemp.jsp").forward(req, resp);
		}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}
}
