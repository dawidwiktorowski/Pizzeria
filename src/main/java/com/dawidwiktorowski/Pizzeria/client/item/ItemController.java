package com.dawidwiktorowski.Pizzeria.client.item;

import com.dawidwiktorowski.Pizzeria.domain.api.ItemBasicInfo;
import com.dawidwiktorowski.Pizzeria.domain.api.ItemService;
import com.dawidwiktorowski.Pizzeria.item.Item;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/danie")
public class ItemController extends HttpServlet {
    private ItemService itemService = new ItemService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ItemBasicInfo> items = itemService.findAll();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/WEB-INF/views/order.jsp").forward(request, response);
    }


}
