<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
    errorPage="error.jsp" 
%>
<%--* we can use page directive multiple times for importing packages --%>
<%@ page import="java.util.ArrayList" %>

<%--* include directive is used to use other JSP file in the current JSP --%>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>

    <%
        int k = 2/0;
    %>

</body>
</html>

