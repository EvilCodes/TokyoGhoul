<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title</title>
		<jsp:include page="link.jsp"></jsp:include>
	</head>
	<body>
	 	<jsp:include page="header.jsp"></jsp:include>
	 	 <div class="content login-wrap">
	 	 
	 	 
	 	 
	 	 <div class="panel panel-primary login">
				<div class="panel-heading">
					<h3 class="panel-title text-center">用户登录</h3>
				</div>
				<div class="panel-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="inputText1" class="col-xs-3 control-label">账号：</label>
							<div class="col-xs-9">
								<input type="text" class="form-control" id="inputText1" placeholder="请输入账号">
							</div>
						</div>
						<div class="form-group">
							<label for="password1" class="col-xs-3 control-label">密码：</label>
							<div class="col-xs-9">
								<input type="password" class="form-control" id="password1" placeholder="请输入密码">
							</div>
						</div>

						<div class="form-group">
							<div class="col-xs-offset-3 col-sm-9">
								<div class="checkbox">
									<label>
         								 <input type="checkbox"> 记住我
       								 </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<div class="row">

									<div class="col-xs-4">
										<button type="submit" class="btn btn-default">登录</button>
									</div>
									<div class="col-xs-4">
										<button type="submit" class="btn btn-default">注册</button>
									</div>
									<div class="col-xs-4">
										<button type="submit" class="btn btn-default">忘记密码</button>

									</div>

								</div>
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
