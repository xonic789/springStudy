<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css"/>
	<style type="text/css">
	
	</style>
	<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="../js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$('table tr>td').first().siblings().wrap($('table tr>td>a'));
	</script>
</head>
<body>

	<div class="container">
  	 <div id="header" class="row">
  	 	<div class="com-md-12">
  	 		<h1>비트교육센터</h1>
  	 	</div>
  	 </div>
  	 <div id="menu" class="row">
  	 	<div class="com-md-12 text-uppercase bg-info text-center">
  	 		<a href="/spring02/index.bit">home</a>
  	 		<a href="/spring02/emp/list.bit">emp</a>
  	 		<a href="/spring02/dept/list.bit">dept</a>
  	 		<a href="/spring02/login.bit">login</a>
  	 </div>
  	 <div id="content" class="row">
  	 	<div class="com-md-12">
  	 		<table class="table">
  	 			<thead>
  	 				<tr class="row">
  	 					<th>사번</th>
  	 					<th>제목</th>
  	 					<th>이름</th>
  	 					<th>날짜</th>
  	 					<th>금액</th>
  	 				</tr>
  	 			</thead>
  	 			<c:forEach items="${alist }" var="bean">
  	 				<tr class="row">
  	 					<td><a href="/spring02/emp/detail.bit?idx=${bean.sabun }">${bean.sabun }</a></td>
  	 					<td>${bean.sub }</a></td>
  	 					<td>${bean.name }</a></td>
  	 					<td>${bean.nalja }</a></td>
  	 					<td>${bean.pay }</a></td>
  	 				</tr>
  	 			</c:forEach>
  	 		</table>
  	 		<a href="add.bit" class="btn btn-primary text-center" role="btn">입 력</a>
  	 	</div>
  	 </div>
  	 <div id="footer" class="row">
  	 	<div class="com-md-12">
  	 		<address>
			  <strong>비트캠프</strong><br>
			  서울 서초구 강남대로 459 (서초동,백암빌딩)<br>
			 Copyright &copy 비트캠프 All rights reserved<br>
			  <abbr title="Phone">P:</abbr> (123) 456-7890
			</address>
			
			<address>
			  <strong>Full Name</strong><br>
			  <a href="mailto:#">first.last@example.com</a>
			</address>
  	 	</div>
  	 </div>
	</div>
</body>
</html>
