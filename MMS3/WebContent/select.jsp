<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty login}"><a href="loginui.bo">로그인</a></c:if>
	<c:if test="${not empty login}"><a href="logout.bo">로그아웃</a></c:if>
	
	<a href="${empty login? 'loginui.bo' : 'logout.bo'}">${empty login? '로그인' : '로그아웃'}</a>
	
	<a href="insertui.bo">회원 가입</a>
	
	<h1>회원 목록</h1>
	
	<c:forEach items="${list}" var="dto">
	<a href="selectById.bo?id=${dto.id}">${dto.id} : ${dto.name}</a>
	<br>
	</c:forEach>
</body>
</html>