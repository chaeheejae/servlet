<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get method</title>
</head>
<body>

	<%
		//이름과 생년월일을 전달받고
		//이름과 나이를 보여주는 패키지
		String name = request.getParameter("name"); //jsp에서는 어디서든 request를 사용할 수 있다.
		String birthday = request.getParameter("birthday"); //jsp에서는 어디서든 request를 사용할 수 있다.
		
		int year = Integer.parseInt(birthday.substring(0,4));
		int age = 2023 - year + 1;
	
	%>
	
	<table border="1">
		<tr>
			<th>이름</th>
			<td><%=name %></td>
		</tr>
		
		<tr>
			<th>나이</th>
			<td><%=age %></td>
		</tr>
	</table>
	
	
	
	
	


</body>
</html>