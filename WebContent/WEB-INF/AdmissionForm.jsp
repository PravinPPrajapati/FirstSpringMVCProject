<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${MainMessage}</h1>
	<h1>Student Admission Form</h1>
	
	<C:errors path="studentObj.*" /> <br>
	
	<form action="submitAdmissionForm.html" method="post">
		Name : <input type="text" name="studentName" /> <br>
		Hobby : <input type="text" name="studentHobby" /> <br>
		Mobile : <input type="text" name="studentMobile" /> <br>
		DOB : <input type="text" name="studentDOB" /> <br>
		Skills : <select name="studentSkills"  multiple > 
					<option >Core Java</option>
					<option >Spring</option>
					<option >AOP</option>
				</select> <br>
		<h3>Student Address :- <br> </h3> 
		<br> Country :<input type="text" name="studentAddress.country" />
		<br> City :<input type="text" name="studentAddress.city" />
		<br> Street :<input type="text" name="studentAddress.street" />
		<br> Pin-code :<input type="text" name="studentAddress.pincode" /> <br>
		
		<input type="submit" value="Submit Student Form">
		
	</form>
</body>
</html>