package org.gradle.demo;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IndexServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        Locale enGB = new Locale("en", "GB");

        ResourceBundle messages = ResourceBundle.getBundle("org.gradle.demo.index", enGB);

        request.setAttribute("messages", messages);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
