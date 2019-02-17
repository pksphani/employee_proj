package com.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.demo.pojo.Employee;
import com.demo.utils.ConnectionUtils;

public class Employee_Dao {
	final static Logger logger = Logger.getLogger(Employee_Dao.class);
	public String insertEmp(Employee e) throws SQLException {
		Statement st = null;
		Connection conn = null;
		conn = ConnectionUtils.getConnection();
		String out = null;

		if (conn != null) {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select max(emp_id) from employee");
			while (rs.next()) {
				int empId = rs.getInt(1);
				empId++;
				e.setEmpId(empId);

			}

			String sql = "insert into employee values(" + e.getEmpId() + ",'" + e.getEmpName() + "'," + e.getEmpSal()
					+ "," + e.getEmpSSN() + ",'" + e.getEmpAddress() + "')";
			System.out.println(sql);
			int res = st.executeUpdate(sql);
			if (res > 0) {
				out = "Insert successful";
				logger.debug("Successfully Inserted");
			} else {
				out = "Insert unsuccessful";
			}
			conn.close();
		} else {
			out = "Connection failed";
			logger.fatal("coonnection failed");
		}

		return out;

	}

	public ArrayList<Employee> getEmployees() throws SQLException {
		ArrayList<Employee> al = new ArrayList<Employee>();
		// Demo_Employee de = new Demo_Employee();
		Statement st = null;
		Connection conn = null;
		conn = ConnectionUtils.getConnection();
		if (conn != null) {
			st = conn.createStatement();
			// String sql = "insert into employee
			// values("+e.getEmpId()+",'"+e.getEmpName()+"',"+e.getEmpSal()+","+e.getEmpSSN()+",'"+e.getEmpAddress()+"')";
			ResultSet rs = st.executeQuery("select emp_id, emp_name,emp_sal,emp_ssn, emp_address from employee");

			while (rs.next()) {

				Employee de = new Employee();// ask can they have same reference
				//System.out.println("de" + de);
				de.setEmpId(rs.getInt("emp_id"));
				de.setEmpName(rs.getString("emp_name"));
				de.setEmpSal(rs.getInt("emp_sal"));
				
				de.setEmpSSN(rs.getLong("emp_ssn"));
				de.setEmpAddress(rs.getString("emp_address"));

				// System.out.println("emp_id:"+ emp_id +
				// "\temp_name:"+emp_name+"emp_sal"+emp_sal+
				// "emp_ssn:"+emp_ssn+"emp_address"+emp_address);
				System.out.println(de.getEmpId());
				al.add(de);
			}

		} else {
			System.out.println("Connection failed");
		} // is this correct
		conn.close();
		return al;

	}

	
	public Employee getEmployee(int empId) throws SQLException{
		Employee de =null;
		Statement st = null;
		Connection conn =null;
		conn= ConnectionUtils.getConnection();
		if (conn != null){
			st  =conn.createStatement();
			//String sql = "insert into employee values("+e.getEmpId()+",'"+e.getEmpName()+"',"+e.getEmpSal()+","+e.getEmpSSN()+",'"+e.getEmpAddress()+"')";
			ResultSet rs =	st.executeQuery("select emp_id, emp_name,emp_sal,emp_ssn, emp_address from employee where emp_id ="+empId+"");
		    
		    while (rs.next()) {
		    
		    	de = new Employee();//ask can they have same reference
		    	System.out.println("de"+de);
		    	de.setEmpId(rs.getInt("emp_id"));
				de.setEmpName(rs.getString("emp_name"));
				de.setEmpSal(rs.getInt("emp_sal"));;
				de.setEmpSSN(rs.getLong("emp_ssn"));
				de.setEmpAddress(rs.getString("emp_address")); 
				
				//System.out.println("emp_id:"+ emp_id + "\temp_name:"+emp_name+"emp_sal"+emp_sal+ "emp_ssn:"+emp_ssn+"emp_address"+emp_address);
				System.out.println(de.getEmpId()); 
		    }	
		   
		
		}else
		{System.out.println("Connection failed");}//is this correct
		conn.close();
		return de;

		}

	
	public String updateEmpSal(Employee e) throws SQLException {

		Statement st = null;
		Connection conn = null;
		conn = ConnectionUtils.getConnection();
		int res = 0;
		String out = null;
		if (conn != null) {
			st = conn.createStatement();
			String sql = "update employee set emp_sal =" + e.getEmpSal() + " where emp_id=" + e.getEmpId() + "";
			System.out.println(sql);
			res = st.executeUpdate(sql);
			if (res > 0) {
				out = "Employee salary updated";
			} else {
				out = "Employee salary not updated";
			}

		}
		conn.close();
		return out;
	}
	
	public String updateEmp(int eId, int sal) throws SQLException {

		Statement st = null;
		Connection conn = null;
		conn = ConnectionUtils.getConnection();
		int res = 0;
		String out = null;
		if (conn != null) {
			st = conn.createStatement();
			String sql = "update employee set emp_sal =" + sal+ " where emp_id=" + eId + "";
			System.out.println(sql);
			res = st.executeUpdate(sql);
			
			System.out.println(res);
			if (res > 0) {
				out = "Employee salary updated";
			} else {
				out = "Employee salary not updated";
			}

		}
		conn.close();
		return out;
	}



	public String deleteEmp(Employee e) throws SQLException {
		String out = null;
		Statement st = null;
		Connection conn = null;
		conn = ConnectionUtils.getConnection();
		int res = 0;
		if (conn != null) {
			st = conn.createStatement();
			String sql = "delete from employee where emp_id =" + e.getEmpId() + "";
			System.out.println(sql);
			res = st.executeUpdate(sql);
			if (res > 0) {
				out = "Employee  deleted";
			} else {
				out = "Employee not deleted";
			}

		}
		conn.close();
		return out;
	}

}
