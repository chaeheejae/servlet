<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method</title>
</head>
<body>

<%
	String nickName = request.getParameter("nickName");
	
	String animal = request.getParameter("animal");
	
	String fruit = request.getParameter("fruit");
	
	String[] foodArray = request.getParameterValues("food");
	
	
	String foodString = "";
	for(int i = 0; i < foodArray.length; i++) {
	 	foodString += foodArray[i] + " ";
	}
%>

<h4><%= nickName %></h4>
<h4><%= animal %></h4>
<h4><%= fruit %></h4>
<h4><%= foodString %></h4>
</body>
</html>