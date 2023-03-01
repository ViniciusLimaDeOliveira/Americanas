<%--
  Created by IntelliJ IDEA.
  User: vinic
  Date: 27/02/2023
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Historico de Clientes</title>
</head>
<body>
<h1 align="center">Clientes são:</h1>
<c:forEach items="${historico_clientes}" var="cliente">
    <h3 align="center"><c:out value="${cliente}" /></h3>
</c:forEach>
</body>
</html>
