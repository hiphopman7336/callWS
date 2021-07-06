<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="static/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link rel="stylesheet" href="static/bootstrap/4.5.3/css/bootstrap.min.css"/>

<link rel="stylesheet" href="static/fontawesome/5.15.1/css/all.css"/>
<link rel="stylesheet" href="static/css/style.css">

<script src="static/jquery/2.1.4/jquery.min.js"></script>
<script src="static/jquery/3.5.1/jquery.min.js"></script>
<script src="static/jquery/popper/popper.min.js"></script>
<script src="static/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>Delete Log : /usr/share/tomcat/</title>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FilenameFilter"%>
<%@ page import="java.util.Arrays"%>

</head>
<body> <br><br>

	<form action="servTestCallws" method="POST">
		Test Call WS : <br>1.RBM_QueryBA_PS stub<br>2.RBM_QueryBA_PS xml<br>&emsp;
		<div class="form-inline">
			<input type="text" class="form-control" name="num" placeholder="Press number">
			<button type="submit" class="btn btn-info" name="num">Submit</button>
		</div>
	</form>
	<br><br>
	WS RESPONSE<br>
	SR : <%= request.getAttribute("sr") %><br>
	Result : <%= request.getAttribute("res") %><br><br>
	
	Request : <%= request.getAttribute("req") %><br>

</body>
</html>