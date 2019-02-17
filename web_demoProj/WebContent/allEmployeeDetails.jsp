<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="java.util.ArrayList"%>
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
<marquee>You are viewing Employee Record(s)</marquee>
<form  method="get">
<div align="center" >
<h4 align="center">Employee Records</h4>
<table border ="1" width="500" align="center">
<tr bgcolor="00FF7F"> <th>Employee_ID</th>
    <th><b>Employee Name</b></th>
    <th><b>Employee Salary</b></th>
    <th><b>Employee SSN</b></th>
    <th><b>Employee Address</b></th>
    </tr>
<!-- Scriptslets tags are used to write a JavaCode in JSP -->
<% 
ArrayList<Employee> al = (ArrayList)request.getAttribute("allemployee");
for(Employee e:al){

%>
 <tr>
 <td ><%=e.getEmpId() %></td>
 
 <td><%=e.getEmpName()%></td>
 
  <td><%=e.getEmpSal() %></td>
  
  <td><%=e.getEmpSSN() %></td>
  
  <td><%=e.getEmpAddress() %></td>
  </tr>
  <%} %>
  </table>
  <br>
  <br>
  <a href ="getAllEmployees.jsp" >Back</a>
</div>
</form>
</body>
</html>