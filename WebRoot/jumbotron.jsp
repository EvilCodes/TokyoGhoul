<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<jsp:include page="link.jsp"></jsp:include>
	</head>
	<body>
		<div class="container">
		<div class="jumbotron">
  			<h1>你好，金木研！</h1>
  			<p>今天你吃東西了嗎？</p>
  			<p><a class="btn btn-primary btn-lg" href="#" role="button">步伐。。。</a></p>
		</div>
		</div>
	</body>
</html>
