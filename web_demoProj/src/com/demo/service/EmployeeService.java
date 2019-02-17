package com.demo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.demo.dao.Employee_Dao;
import com.demo.pojo.Employee;

public class EmployeeService {
	
	Employee_Dao empDao = new Employee_Dao();

	public String insertEmp(Employee  e) {
		String result = null;
		try {
			result= empDao.insertEmp(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return result;
		
		}
		return result;}
	
	public ArrayList<Employee> getEmployees() throws SQLException{
		
			
		
		return empDao.getEmployees();}
	public String updateEmpSal(Employee e) {
		try {
			empDao.updateEmpSal(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;}
	
	public String updateEmp(int eId, int sal) throws SQLException {
		String out =empDao.updateEmp(eId,sal);
		return out;
		
	}
	
	public String deleteEmp(Employee e){
		
		try {
			empDao.deleteEmp(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;}
	
	public Employee getEmployee(int empId) throws SQLException{
		
		
		return empDao.getEmployee(empId);
	}
}
