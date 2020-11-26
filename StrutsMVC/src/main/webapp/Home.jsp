<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<link rel="stylesheet" href="./index.css" type="text/css">
</head>
<body>  
<div class="container">
<section id="content">
<h1>Successful Login</h1>
<h2>Welcome <s:property value="loginBean.userName"/>  </h2>
</section>
</div>


</body>
</html>  