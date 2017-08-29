<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of users</h2>
			</caption>
			<tr>
				<th>EmpNo</th>
				<th>DeptNo</th>
				<th>DOJ</th>
				<th>DOB</th>
				<th>Salary</th>
				<th>SalGrade</th>
			</tr>
			<c:forEach items="${requestScope.listEmps}" var="emps">
				<tr>
					<td>${emps.empNo}</td>
					<td>${emps.deptNo}</td>
					<td>${emps.doj}</td>
					<td>${emps.dob}</td>
					<td>${emps.salary}</td>
					<td>${emps.salGrade}</td>
				</tr>
			</c:forEach>
		</table>
		
	</div>
</body>
</html>