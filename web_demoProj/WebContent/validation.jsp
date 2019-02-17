<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validations</title>

<script type="text/javascript">

function validate(){
	
	var ename = document.getElementById("en").value;
	var eadd = document.getElementById("ea").value;
	
	if (ename ==''){
	
	alert('Enter Name');
	}
	
}


</script>
</head>
<body >
<marquee>You are accessing Employee Record(s)</marquee>
<form  method="get">
<div align="center" >
<h4>Employee Details</h4>
<label>Employee Name </label>
<input type="text"  name="ename" id ="en">

<br><br>
<label>Employee Address </label>
<input type="text"  name="eaddress" id ="ea">
<br><br>
<select>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>

<input type="button"  value="Submit" onclick="validate()"/>
<br><br>
<div >
<table border="2" bgcolor="green" style="color:white">test
<tr><th>empid</th>
<th>emp name</th>
<th>em address</th> </tr>

<tr><td> 1</td>
<td>22</td>
<td>33</td>
</tr>
<tr><td> 1</td>
<td>22</td>
<td>33</td>
</tr>
<tr><td> 1</td>
<td>22</td>
<td>33</td>
</tr>
<tr><td> 1</td>
<td>22</td>
<td>33</td>
</tr>

</table>
</div>
</div>
</form>
</body>
</html>