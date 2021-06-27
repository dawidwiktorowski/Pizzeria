package com.dawidwiktorowski.Pizzeria.domain.api;

import com.dawidwiktorowski.Pizzeria.domain.item.ItemDAO;
import com.dawidwiktorowski.Pizzeria.item.Item;

import java.util.List;
import java.util.stream.Collectors;

public class ItemService {
    private final ItemDAO itemDAO = new ItemDAO();

    public List<ItemBasicInfo> findAll() {
        return itemDAO.findAll()
                .stream().map(ItemMapper::map)
                .collect(Collectors.toList());
    }

    private static class ItemMapper {
        static ItemBasicInfo map(Item d) {
            return new ItemBasicInfo(
                    d.getId(),
                    d.getPrice(),
                    d.getName(),
                    d.getShortDescription(),
                    d.getDescription(),
                    d.getImgUrl()
            );
        }
    }
}
