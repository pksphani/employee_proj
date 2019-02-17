<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.demo.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body >
<marquee>You are accessing Employee Record(s)</marquee>
<form  method="get">
<div  >
<h4>Employee Details</h4>
<!-- Scriptslets tags are used to write a JavaCode in JSP -->
<% 
Employee emp = (Employee)request.getAttribute("employee");

%>
 Employee Id:<%=emp.getEmpId() %>
 <br>
 Employee Name:<%=emp.getEmpName()%>
 <br>
  Employee Salary:<%=emp.getEmpSal() %>
  <br>
  Employee SSN:<%=emp.getEmpSSN() %>
  <br>
  Employee Address:<%=emp.getEmpAddress() %>
</div>
</form>
</body>
</html>