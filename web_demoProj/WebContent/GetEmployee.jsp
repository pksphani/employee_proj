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
<form action="getempservlet" method="get">
<div  >
<h4>Employee Details</h4>
<label>Employee Id </label>
<input type="text"  name="eid"/>
<br><br>
<button>Submit</button>
</div>
</form>
</body>
</html>