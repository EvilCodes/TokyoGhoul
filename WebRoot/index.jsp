<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<jsp:include page="link.jsp"></jsp:include>
  </head>
  
  <body>
    <jsp:include page="header.jsp"></jsp:include>
    
    <jsp:include page="jumbotron.jsp"></jsp:include>
    
    <div class="content">
			
	</div>
    <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
