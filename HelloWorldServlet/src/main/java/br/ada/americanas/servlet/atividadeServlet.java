package br.ada.americanas.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "atividadeServlet", value = "/atividade-servlet")

public class atividadeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        PrintWriter writer = response.getWriter();
        writer.println("<html><body> <h1>Cliente | nome: {"+nome+"} | cpf: {"+cpf+"}| foi cadastrado com sucesso.</h1></body></html>");
    }
}
