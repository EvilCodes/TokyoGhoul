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
	<jsp:include page="header.jsp"></jsp:include>
	<div class="content register-wrap">

		<div class="panel panel-primary register">
			<div class="panel-heading">
				<h3 class="panel-title text-center">用户注册</h3>
			</div>
			<div class="panel-body">
				<form class="form-horizontal">
					<div class="form-group">
						<label for="inputText1" class="col-xs-3 control-label">账号：</label>
						<div class="col-xs-9">
							<input type="text" class="form-control" id="inputText1"
								placeholder="请输入账号">
						</div>
					</div>
					<div class="form-group">
						<label for="password1" class="col-xs-3 control-label">密码：</label>
						<div class="col-xs-9">
							<input type="password" class="form-control" id="password1"
								placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<label for="password2" class="col-xs-3 control-label">密码确认：</label>
						<div class="col-xs-9">
							<input type="password" class="form-control" id="password2"
								placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="col-xs-3 control-label">电子邮件：</label>
						<div class="col-xs-9">
							<input type="email" class="form-control" id="email"
								placeholder="请输入电子邮箱">
						</div>
					</div>
					<div class="form-group">
						<label for="inputText3" class="col-xs-3 control-label">验证码：</label>
						<div class="col-xs-9">
							<div class="row">
								<div class="col-xs-6">
									<input type="text" name="kaptcha" class=" form-control" id="inputText3"placeholder="请输入验证码">
								</div>	
								<div class="col-xs-6">
									<img id="kaptchaImage" src="<%=basePath %>servlet/kaptcha" alt="">
								
								</div>
							</div>
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-default">注册</button>


						</div>
					</div>
				</form>
			</div>
			<div class="panel-footer">Panel footer</div>
		</div>

	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

<script>


	$(function(){
		$('#kaptchaImage').click(function(){
		
			$(this).attr('src','<%=basePath%>servlet/kaptcha?'+Math.floor(Math.random()));
			
		});
	
	});


</script>
