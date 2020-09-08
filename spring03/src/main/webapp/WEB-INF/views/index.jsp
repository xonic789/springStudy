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
            <img class="img-circle" alt="" src="Imgs/nature.jpg"/>
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