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
		<div class="footer">
			<div class="container">
				<div class="row footer-menu">
					<div class="col-xs-6 footer-left">
						<p><img src="img/logo.png" alt=""></p>	
						<p>本网站所列开源项目的中文版文档全部由Bootstrap中文网成员翻译整理，并全部遵循 CC BY 3.0协议发布。</p>
					</div>
					<div class="col-xs-6 footer-right">
						<div class="row">
							<ul class="col-xs-3" >
								<li>关于</li>
								<li>关于我们</li>
								<li>广告合作</li>
								<li>友情链接</li>
								<li>招聘</li>
							</ul>
							<ul class="col-xs-3">
								<li>联系方式</li>
								<li>新浪微博</li>
								<li>电子邮件</li>
							</ul>
							<ul class="col-xs-3">
								<li>旗下网站</li>
								<li>Laravel中文网</li>
								<li>Ghost中国</li>
							</ul>
							<ul class="col-xs-3">
								<li>赞助商</li>
								<li>又拍云</li>
							</ul>
						</div>
					</div>
				</div>
			<div class="row">
				<div class="col-xs-12 footer-beian">
					<p class=" text-center">京ICP备11008151号&nbsp;|&nbsp;京公网安备11010802014853</p>
				</div>
				
			</div>
			
			</div>
		</div>
	</body>
</html>
