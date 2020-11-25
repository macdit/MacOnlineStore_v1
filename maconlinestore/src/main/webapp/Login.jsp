<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	// Get parameter from the form - login.html
	String uName = request.getParameter("userName");
	String pass = request.getParameter("pwd");
	
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		try {
			//Step 1 - Load the driver
			Class.forName ("org.postgresql.Driver");
			// Step 2 - Create connection
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/macstore", "postgres", "admin");
			System.out.println("Connection Established");
			
		} catch (SQLException e){
			e.printStackTrace();
		}
			
			
			// Step 3 - Create statement object
			statement = connection.createStatement();
			// Step 4 - execute statement - select
			//resultSet = statement.executeQuery("SELECT * FROM users where userid= ");
			resultSet = statement.executeQuery("SELECT * FROM users where u_username='"+uName+"' AND u_password='"+pass+"'");
			if(resultSet.next()) {
				out.print("You have entered valid username & password");
			} else {
				out.println("The username or password that you have entered is invalid");
				%>
			    <%@ include file = "login.html"%>
			    <%
			}
		
			
			try {
				// Step 4 - close the connection
				connection.close();
				if (resultSet != null)
					resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			
		
	
%>
</body>
</html>