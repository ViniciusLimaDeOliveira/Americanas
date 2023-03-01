<%--
  Created by IntelliJ IDEA.
  User: vinic
  Date: 27/02/2023
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculadora</title>
</head>
<body>
<div align="center">
    <form action="calcularH" method="post">
        <p>Informe o primero número: <input type="number" name="first" required></p>
        <p>Operacao:
            <select name="operator">
                <option value="+">Soma</option>
                <option value="-">Subtração</option>
                <option value="*">Multiplicação</option>
                <option value="/">Divisão</option>
            </select>
        </p>
        <p>Informe o segundo número: <input type="number" name="second" required></p>
        <p><input type="submit" value="Calcular"></p>
    </form>
</div>
</body>
</html>
</html>