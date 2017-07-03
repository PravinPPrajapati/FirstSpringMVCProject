<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${headerMessage}</h2>
	<h3>Congratulations Student! Your Form has been submitted successfully.</h3>
	
	Your Info is as below :- </br>
	Student Name : ${studentObj.studentName} </br>
	Student Hobby : ${studentObj.studentHobby} </br>
	Student Mobile : ${studentObj.studentMobile} </br>
	Student DOB : ${studentObj.studentDOB} </br>
	Student Skills : ${studentObj.studentSkills} </br>
	<h3>Student Address : </h3>
		Country :${studentObj.studentAddress.country} 
		, City :${studentObj.studentAddress.city} 
		, Street :${studentObj.studentAddress.street} 
		, Pin-code :${studentObj.studentAddress.pincode} 
		<br>
</body>
</html>