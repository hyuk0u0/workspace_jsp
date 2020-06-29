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

	<h1>게시글 목록</h1>
	<a href="insertui.do">글쓰기</a>
	<table border="1">
		<thead>
			<tr>
				<th>num</th>
				<th>title</th>
				<th>writer</th>
				<th>writeday</th>
				<th>readcnt</th>
				<th>repRoot</th>
				<th>repStep</th>
				<th>repIndent</th>
			</tr>
		</thead>
			<c:forEach items="${list}" var="dto">
				<tr>
				<td>${dto.num}</td>
				<td>${dto.title}</td>
				<td>${dto.writer}</td>
				<td>${dto.writeday}</td>
				<td>${dto.readcnt}</td>
				<td>${dto.repRoot}</td>
				<td>${dto.repStep}</td>
				<td>${dto.repIndent}</td><br>
				</tr>
			</c:forEach>
		<tbody>
		
		</tbody>
	</table>

</body>
</html>