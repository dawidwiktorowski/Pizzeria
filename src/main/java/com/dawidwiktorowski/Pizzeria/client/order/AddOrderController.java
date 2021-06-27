package com.dawidwiktorowski.Pizzeria.client.order;

import com.dawidwiktorowski.Pizzeria.domain.api.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/zamowienie/dodaj")
@ServletSecurity(
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "GET", rolesAllowed = "USER"),
                @HttpMethodConstraint(value = "POST", rolesAllowed = "USER")
        }
)
public class AddOrderController extends HttpServlet {
    private OrderService orderService = new OrderService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<OrderBasicInfo> order = orderService.findAll();
        request.setAttribute("order", order);
        request.getRequestDispatcher("/WEB-INF/views/orderSummary.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderSaveRequest saveRequest = createSaveRequest(request);
        orderService.add(saveRequest);
        response.sendRedirect(request.getContextPath());
    }

    private OrderSaveRequest createSaveRequest(HttpServletRequest request) {
        String loggedInUsername = request.getUserPrincipal().getName();
        return new OrderSaveRequest(
                Long.valueOf(request.getParameter("id")),
                Double.valueOf(request.getParameter("price")),
                request.getParameter("name"),
                request.getParameter("address"),
                request.getParameter("telephone"),
                Long.valueOf(request.getParameter("goodsId")),
                Long.valueOf(request.getParameter("condition"))


        );
    }
}