<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="./index.css" type="text/css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<div class="container">
	<section id="content">
	<h1>ASE Assignment 2</h1>
    <s:form action="login">  
		<s:textfield id="username" placeholder="User Name" theme="simple" name="loginBean.userName"/>  
		<s:password id="password" placeholder="Password" theme="simple" name="loginBean.password"/>  
		<s:submit theme="simple" class="submit" value="Sign in"/>  
	</s:form>
	</section><!-- content -->
</div><!-- container -->

</body>
</html>  