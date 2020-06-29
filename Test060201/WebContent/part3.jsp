<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<footer>
	푸터입니다. <br>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hello = request.getParameter("hello");
	%>
	<%=id %> : ${param.id} <br>
	<%=name %> : ${param.name}<br>
	<%=hello %> : ${param.hello}<br>
	
</footer>