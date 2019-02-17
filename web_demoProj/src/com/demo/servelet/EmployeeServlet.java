package com.demo.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;

public class EmployeeServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		getServletConfig().getServletContext();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(req, resp);
		Employee emp = new Employee();
		EmployeeService empSer = new EmployeeService();
		String result=null;
		
		System.out.println("inside Get method");
		String ename =req.getParameter("ename");
		int esal = Integer.parseInt(req.getParameter("esal"));
		int essn = Integer.parseInt(req.getParameter("essn"));
		String eaddress = req.getParameter("eaddress");
			
		emp.setEmpName(ename);
		emp.setEmpSSN(essn);
		emp.setEmpSal(esal);
		emp.setEmpAddress(eaddress);
		//emp.setEmpId(456);
	
	    result= empSer.insertEmp(emp);	
	    if (result!=null) {
	    	
			req.getRequestDispatcher("Success.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("Failure.jsp").forward(req, resp);
		}
	}
	
}
