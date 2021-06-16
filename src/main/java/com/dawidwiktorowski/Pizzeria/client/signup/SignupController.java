package com.dawidwiktorowski.Pizzeria.client.signup;

import com.dawidwiktorowski.Pizzeria.domain.api.UserRegistration;
import com.dawidwiktorowski.Pizzeria.domain.api.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet
public class SignupController extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserRegistration userRegistration = getUserData(request);
        userService.register(userRegistration);
        response.sendRedirect(request.getContextPath());
    }

    private UserRegistration getUserData(HttpServletRequest request) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        return new UserRegistration(firstName, lastName, email, password);
    }
}
