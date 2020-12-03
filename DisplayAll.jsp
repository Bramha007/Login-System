<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student Details</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<style type="text/css">
	table{
	 	table-layout: fixed;
  		width: 50%;
  		}  
</style>
</head>
<body>
	<h1>Details of All Students</h1>
	<%
		FileReader fr = new FileReader("C:\\Users\\Roshan\\eclipse-workspace\\LTIWeb Based Project\\students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while ((line = br.readLine()) != null) {
			ArrayList<String> data = new ArrayList<String>(Arrays.asList(line.toString().split(", ")));
	%>
	<table border="1">
		<tr><td><strong>Student ID</strong></td><td><%= data.get(0) %></td></tr>
		<tr><td><strong>Student Name</strong></td><td><%= data.get(1) %></td></tr>
		<tr><td><strong>Gender</strong></td><td><%= data.get(2) %></td></tr>
		<tr><td><strong>Date Of Birth</strong></td><td><%= data.get(3) %></td></tr>
		<tr><td><strong>City</strong></td><td><%= data.get(4) %></td></tr>
		<tr><td><strong>State</strong></td><td><%= data.get(5) %></td></tr>
		<tr><td><strong>E-mail Id</strong></td><td><%= data.get(6) %></td></tr>
		<tr><td><strong>Qualification</strong></td><td><%= data.get(7) %></td></tr>
		<tr><td><strong>Stream</strong></td><td><%= data.get(8) %></td></tr>
	</table><br>
	<%
	}
	br.close();
	%>
	<a class="btn btn-primary" href="index.html">Home Page</a>
	
</body>
</html>