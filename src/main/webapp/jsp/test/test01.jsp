<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01</title>
</head>
<body>

<%-- 평균구하기 --%>
<% 
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for(int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	double average = (sum / scores.length);
%>

<h2>점수평균은 <%=average %> 입니다.</h2>

<%-- 채점결과 --%>
<% 
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	sum = 0;
	for(String result : scoreList) {
		if(result.equals("O")) {
			sum += 100 / scoreList.size();
		}
	}
%>

<h2>채점결과는 <%=sum %>점 입니다.</h2>

<%-- 1부터n까지 합계 --%>
<%!
	int sum = 0;
	public int sumAll(int number) {
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
%>
 
	<h2>1부터 50까지의 합은 <%=sumAll(50) %></h2>


<%-- 나이 구하기 --%>
<%
	String birthDay = "20010820";
	String yearString = birthDay.substring(0,4);
	int year = Integer.parseInt(yearString);
	
	int age = (2023 - year + 1);
%>
<h2>20010820의 나이는 <%= age %>살 입니다.</h2>



















</body>
</html>