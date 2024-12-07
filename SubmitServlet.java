package com.mycompany.project_tech;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Confirmation</title></head>");
        out.println("<body>");
        out.println("<h1>Merci pour votre message, " + name + " !</h1>");
        out.println("<p>Nous avons bien reçu votre message :</p>");
        out.println("<p><strong>Email :</strong> " + email + "</p>");
        out.println("<p><strong>Message :</strong> " + message + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
