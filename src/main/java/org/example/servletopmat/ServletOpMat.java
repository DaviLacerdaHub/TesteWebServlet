package org.example.servletopmat;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletOpMat", value = "/operacoes-mat")
public class ServletOpMat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numStr = req.getParameter("numero1");
        String numStr2 = req.getParameter("numero2");

        double numero1 = Double.parseDouble(numStr);
        double numero2 = Double.parseDouble(numStr2);

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double mult = numero1 * numero2;
        double div = numero1 / numero2;


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Resultado das quatro operações matemáticas básicas</h1>");out.println("<h2>Soma:</h2>");
        out.println("<p>" + numero1 + " + " + numero2 + " = " + soma + "</p>");
        out.println("<h2>Subtração:</h2>");
        out.println("<p>" + numero1 + " - " + numero2 + " = " + subtracao + "</p>");
        out.println("<h2>Multiplicação:</h2>");
        out.println("<p>" + numero1 + " * " + numero2 + " = " + mult+ "</p>");out.println("<h2>Divisão:</h2>");
        out.println("<p>" + numero1 + " / " + numero2 + " = " + div + "</p>");
        out.println("</body></html>");
    }
}

