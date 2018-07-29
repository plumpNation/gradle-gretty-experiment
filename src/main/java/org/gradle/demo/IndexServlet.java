package org.gradle.demo;

import java.io.IOException;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IndexServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {
    // @TODO: Find out what this means exactly
    private static final long serialVersionUID = 1L;

    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        Locale locale = this.parseLocale(request);

        ResourceBundle messages = ResourceBundle.getBundle("org.gradle.demo.index", locale);

        request.setAttribute("messages", messages);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private Locale parseLocale(HttpServletRequest request) {
        String[] array = {"en_GB", "en_US"};
        List <String> validLangs = Arrays.asList(array);

        // @TODO try to understand how reading the body interferes with `request.getParameter()`.
        String lang = request.getParameter("lang");

        if (lang == null || !validLangs.contains(lang)) lang = "en_US";

        String[] parts = lang.split("_");

        String language = parts[0];
        String region = parts[1];

        return new Locale(language, region);
    }
}
