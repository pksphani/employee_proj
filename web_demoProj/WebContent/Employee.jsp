<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body >
<marquee>You are accessing Employee Record(s)</marquee>
<form action="empservlet" method="get">
<div  >
<h4>Employee Details</h4>
<label>Employee Name </label>
<input type="text"  name="ename"/>
<br><br>
<label>Employee SSN </label>
<input type="text"  name="essn"/>
<br><br>
<label>Employee Address  </label>
<input type="text" name="eaddress"/>
<br><br><br>
<label>Employee Salary  </label>
<input type="text" name="esal"/>
<br><br><br>

<button>Submit</button>
</div>
</form>
</body>
</html>