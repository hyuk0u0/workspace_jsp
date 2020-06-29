<%@page import="kr.co.domain.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="${empty login ? 'loginui.do' : 'logout.do'}">
	${empty login ? '로그인' : '로그아웃'}
	</a>
	
	<a href="insertui.do">회원 등록</a><br>
	
	
	
	<c:forEach items="${list}" var="dto" >
	<a href="selectById.do?id=${dto.id}">${dto.id} : ${dto.name}</a>
	<br>
	
	
	</c:forEach>
</body>
</html>