package com.dawidwiktorowski.Pizzeria.domain.api;

import com.dawidwiktorowski.Pizzeria.order.Order;
import com.dawidwiktorowski.Pizzeria.domain.order.OrderDAO;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    private final OrderDAO orderDAO = new OrderDAO();
    private final OrderMapper orderMapper = new OrderMapper();

    public void add(OrderSaveRequest orderSaveRequest) {
        Order orderToSave = orderMapper.map(orderSaveRequest);
        orderDAO.save(orderToSave);
    }
    public List<OrderBasicInfo> findAll() {
        return orderDAO.findAll()
                .stream().map(OrderService.OrderMapper::map)
                .collect(Collectors.toList());
    }

    private static class OrderMapper {
        static OrderBasicInfo map(Order d) {
            return new OrderBasicInfo(
                    d.getId(),
                    d.getPrice(),
                    d.getName(),
                    d.getAddress(),
                    d.getTelephone(),
                    d.getGoodsId(),
                    d.getCondition()
            );
        }
            Order map(OrderSaveRequest ds) {
                return new Order(
                        ds.getId(),
                        ds.getPrice(),
                        ds.getName(),
                        ds.getAddress(),
                        ds.getTelephone(),
                        ds.getGoodsId(),
                        ds.getCondition()

                );

        }
    }
}
