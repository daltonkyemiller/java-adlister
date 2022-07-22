package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("password-confirm");

        boolean fieldsAreEmpty = username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty();
        boolean passwordsDontMatch = !password.equals(confirmPassword);
        boolean usernameLengthIncorrect = username.length() < 3 || username.length() > 20;
        RequestDispatcher rq = request.getRequestDispatcher("/WEB-INF/register.jsp");

        if (fieldsAreEmpty) {
            request.setAttribute("error", "All fields are required");
            rq.forward(request, response);
            return;
        }
        if (passwordsDontMatch) {
            request.setAttribute("error", "Passwords do not match");
            rq.forward(request, response);
            return;
        }
        if (usernameLengthIncorrect) {
            request.setAttribute("error", "Username must be between 3 and 20 characters");
            rq.forward(request, response);
            return;
        }

        User newUser = new User(username, email, password);
        try {
            DaoFactory.getUsersDao().insert(newUser);
        } catch (Exception e) {
            request.setAttribute("error", "User with that username or email already exists");
            rq.forward(request, response);
            return;
        }
        request.getSession().setAttribute("user", username);
        response.sendRedirect("/profile");
        
    }
}
