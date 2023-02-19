<%--
  Created by IntelliJ IDEA.
  User: vinic
  Date: 19/02/2023
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculadora</title>
</head>
<body>
<div align="center">
    <form action="calcular" method="post">
        <p>Informe o primero número: <input type="number" name="first" required></p>
        <p>Informe o segundo número: <input type="number" name="second" required></p>
        <p><input type="submit" value="Calcular"></p>
    </form>
</div>
</body>
</html>
