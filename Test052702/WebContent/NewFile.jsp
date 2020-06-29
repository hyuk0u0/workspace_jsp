<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String hello = (String) application.getAttribute("hello");
		List<StringBuffer> list = (List<StringBuffer>) application.getAttribute("list");
		Integer count = (Integer) application.getAttribute("count");
		out.print(hello);
		out.print("<br>");
		for(int i = 0; i < list.size(); i++) {
			out.print(list.get(i));
			out.print("<br>");
		}
		out.print(count);
		
		
	%>
</body>
</html>