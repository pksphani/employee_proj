package com.demo.servelet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;

public class GetAllEmployeesServlet extends HttpServlet {

	EmployeeService empSer = null;
	Employee emp = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		empSer = new EmployeeService();
		ArrayList<Employee> al = new ArrayList<Employee>();
		System.out.println("inside Get method");
		// int empId =Integer.parseInt(req.getParameter("eid"));

		try {
			al = empSer.getEmployees();
		
		req.setAttribute("allemployee", al);
		for (Employee e : al) {
			System.out.println(e.getEmpId());
			
		}

		if (!al.isEmpty()) {

			req.getRequestDispatcher("allEmployeeDetails.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("failureNoallemp.jsp").forward(req, resp);
		}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
