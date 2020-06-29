<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/codingBooster.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>코딩 부스터</title>
	<style type="text/css">
		blockquote {
			background: #f9f9f9;
			border-left: 10px solid #cccccc;
			margin: 1.5em 10px;
			padding: 0.5em 10px;
			quotes: "\201C""\201D""\2018""\2019";
		}
		blockquote:before {
			color: #cccccc;
			content: open-quote;
			font-size: 3em;
			line-height: 0.1em;
			margin-left: 0.8em;
			margin-right: 0.25em;
			vertical-align: -0.4em;
		}
		blockquote:after {
			color: #cccccc;
			content: close-quote;
			font-size: 3em;
			line-height: 0.1em;
			margin-left: 0.25em;
			vertical-align: -0.4em;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">코딩 부스터</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.jsp">소개<span class="sr-only"></span></a></li>
					<li><a href="instructor.jsp">강사진</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false">강의<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="lecture.jsp?lectureName=C">C언어</a></li>
							<li><a href="lecture.jsp?lectureName=Java">Java</a></li>
							<li><a href="lecture.jsp?lectureName=Android">안드로이드</a></li>
						</ul>
					</li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="내용을 입력하세요.">
					</div>
					<button type="submit" class="btn btn-default">검색</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="loginForm.jsp">로그인</a></li>
							<li><a href="registerForm.jsp">회원가입</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">
							<span class="glphicon glyphicon-tags"></span>
							&nbsp;&nbsp;박성혁 강사
						</h3>
					</div>
					<div class="panel-body">
						<div class="media">
							<div class="media-left">
								<a href="#">
									<img class="media-object" alt="개발자 이미지" src="images/show.jpg.jpeg">
								</a>
							</div>
							<div class="media-body">
								<h4 class="media-heading">박성혁</h4><br>
									코딩 부스터의 대표 강사입니다.
							</div>
						</div>
					</div>
					<table class="table">
						<thead>
							<tr>
								<th>강사명</th>
								<th>강의 번호</th>
								<th>강의 제목</th>
								<th>강의 날짜</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>박성혁</td>
								<td>1</td>
								<td><a href="lecture.jsp?lectureName=C">C언어 기초 프로그래밍 강의</a></td>
								<td>2020-06-01</td>
							</tr>
							<tr>
								<td>박성혁</td>
								<td>2</td>
								<td><a href="lecture.jsp?lectureName=Java">Java 기초 프로그래밍 강의</a></td>
								<td>2020-06-15</td>
							</tr>
							<tr>
								<td>박성혁</td>
								<td>3</td>
								<td><a href="lecture.jsp?lectureName=Android">Android 스튜디오 활용 강의</a></td>
								<td>2020-06-25</td>
							</tr>
						</tbody>
					</table>
					<div class="panel-footer">
						<blockquote>Do And Forget!</blockquote>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<footer style="background-color: #000000; color: #ffffff">
		<div class="container">
			<br>
			<div class="row">
				<div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2020</h5><h5>박성혁(Sunghyuk Park)</h5></div>
				<div class="col-sm-4"><h4>대표자 소개</h4><p>저는 코딩 부스터의 대표 박성혁입니다. 한국교원대학교에서 공부를 하고 있으며 웹 개발에 관심이 많습니다.</p></div>
				<div class="col-sm-2"><h4 style="text-align: center;">내비게이션</h4>
					<div class="list-group">
						<a href="index.jsp" class="list-group-item">소개</a>
						<a href="instructor.jsp" class="list-group-item">강사진</a>
						<a href="lecture.jsp" class="list-group-item">강의</a>
					</div>
				</div>
				<div class="col-sm-2"><h4 style="text-align: center;">SNS</h4>
					<div class="list-group">
						<a href="https://www.naver.com" class="list-group-item">페이스북</a>
						<a href="https://www.google.com" class="list-group-item">유튜브</a>
						<a href="https://www.daum.net" class="list-group-item">네이버 TV</a>
					</div>
				</div>
				<div class="col-sm-2"><h4 style="text-align: center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by 박성혁</h4></div>
			</div>
		</div>
	</footer>
</body>
</html>