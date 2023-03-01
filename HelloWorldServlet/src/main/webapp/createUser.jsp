<%--
  Created by IntelliJ IDEA.
  User: vinic
  Date: 19/02/2023
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Cadastrar Cliente</title>
</head>
<body>
<div align="center">
  <form action="atividade-servlet" method="post">
    <p>Informe o Nome do cliente: <input type="text" name="nome" required></p>
    <p>Informe o CPF do cliente: <input type="text" name="cpf" required></p>
    <p><input type="submit" value="Cadastrar"></p>
    <a href="historicoClientes.jsp">Historico</a>
  </form>
</div>
</body>
</html>
