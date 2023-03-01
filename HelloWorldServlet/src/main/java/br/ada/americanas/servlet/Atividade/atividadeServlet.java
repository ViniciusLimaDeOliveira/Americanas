package br.ada.americanas.servlet.Atividade;

import br.ada.americanas.servlet.Atividade.obj.Cliente;
import br.ada.americanas.servlet.Operacao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "atividadeServlet", value = "/atividade-servlet")

public class atividadeServlet extends HttpServlet {
    private List<Cliente> clientes = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        Cliente  cliente = new Cliente(nome,cpf);
        List<Cliente> clientes = recuperaClientes(request);
        clientes.add(cliente);
        request.setAttribute("historico_clientes", clientes);
        request.getRequestDispatcher("/historicoClientes.jsp").forward(request, response);

        //PrintWriter writer = response.getWriter();
        //writer.println("<html><body> <h1>Cliente | nome: {"+nome+"} | cpf: {"+cpf+"}| foi cadastrado com sucesso.</h1></body></html>");
    }

    private List<Cliente> recuperaClientes(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        List<Cliente> clienteList = (List<Cliente>) session.getAttribute("historico_clientes");
        if (clienteList == null) {
            clienteList = new ArrayList<>();
            session.setAttribute("historico_clientes", clienteList);
        }
        return clienteList;
    }
}
