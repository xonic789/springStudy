<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
   <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
   <script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
      <div class="row">
         <div class="col-md-12">
         
         <!-- nav -->
            <nav class="navbar navbar-inverse">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" href="${pageContext.request.contextPath }/index.bit">
                    <div>비트교육센터 </div>
                  </a>
                </div>
                <p class="navbar-text">
                <a href="${pageContext.request.contextPath }/emp/list.bit" class="navbar-link" >E M P</a>
                <a href="${pageContext.request.contextPath }/dept/list.bit" class="navbar-link" >DEPT</a>
                <a href="${pageContext.request.contextPath }/login/login.bit" class="navbar-link" >LOGIN</a>
                </p>
              </div>
            </nav>
         <!-- nav -->
         </div>
      </div>

      <div class="row">
         <div class="col-md-12" id="content">
         <div class="page-header">
         <h1>INSERT PAGE<small>DEPT TABLE</small></h1>
         </div>
         <form class="form-horizontal" action="insert.bit" method="post">
		  <div class="form-group">
		    <label for="dname" class="col-sm-2 control-label">dname</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="dname" id="dname" placeholder="이름">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">location</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="loc" id="loc" placeholder="지역">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">입 력</button>
		    </div>
		  </div>
		</form>
         </div>
      </div>
      
      <div class="row" id="footer">
         <div class="col-md-12">
             <address><strong>비트캠프</strong>  서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
         Copyright &copy; 비트캠프 All rights reserved.
         </div>
      </div>
   </div>
   
</body>
</html>