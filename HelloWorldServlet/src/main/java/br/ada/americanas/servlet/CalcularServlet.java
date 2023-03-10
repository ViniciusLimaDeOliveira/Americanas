package br.ada.americanas.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CalcularServlet", value = "/calcular")
public class CalcularServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BigDecimal first = new BigDecimal(request.getParameter("first"));
        BigDecimal second = new BigDecimal(request.getParameter("second"));
        String operator = request.getParameter("operator");

        Operacao operacao = OperacaoFactory.create(operator);
        BigDecimal result = operacao.execute(first, second);
        request.setAttribute("first",first);
        request.setAttribute("second",second);
        request.setAttribute("op",operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/resultCalc2.jsp").forward(request, response);
        //PrintWriter writer = response.getWriter();
        //writer.println("<html><body>O resultado da soma foi: " + calculo + "</body></html>");
    }


}
