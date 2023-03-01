<%@ page import="br.ada.americanas.servlet.Operacao" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: vinic
  Date: 24/02/2023
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Historico de operações</title>
</head>
<body>
<h1 align="center">Operações realizadas foram:</h1>
<c:forEach items="${historico_operacoes}" var="operacao">
    <h3 align="center"><c:out value="${operacao}" /></h3>
</c:forEach>

</body>
</html>
