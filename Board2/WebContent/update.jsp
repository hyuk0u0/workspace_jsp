<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 수정</h1>
	<form action="update.do" method="post">
	NUM : <input name="num" value="${dto.num}" readonly><br>
	Title : <input name="title" value="${dto.title}"><br>
	Writer : <input name="writer" value="${dto.writer}"><br>
	Content :<br> 
	<textarea rows="20" cols="30" name="content">${dto.content}</textarea><br>
	<input type="submit" value="수정">
	</form>
</body>
</html>