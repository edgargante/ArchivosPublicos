<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Práctica 5</title>
</head>
<body>

   <html:form action="/login" focus="userName">
    Username : <html:text property="userName" />
        <br>
    Password : <html:password property="password" />
        <br>
        <html:submit value="login" />
    </html:form>
 
 
</body>
</html>