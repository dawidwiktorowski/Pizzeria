package com.dawidwiktorowski.Pizzeria.domain.item;

import com.dawidwiktorowski.Pizzeria.domain.common.BaseDAO;
import com.dawidwiktorowski.Pizzeria.item.Item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO extends BaseDAO  {

    public List<Item> findAll() {
        final String query = """
                SELECT
                id, price, name, shortDescription, description, imgUrl
                FROM
                item
                """;
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Item> allItems = new ArrayList<>();
            while (resultSet.next()) {
                Item item = mapRow(resultSet);
                allItems.add(item);
            }
            return allItems;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Item mapRow(ResultSet set) throws SQLException {
        long itemId = set.getInt("id");
        Double price = set.getDouble("price");
        String name = set.getString("name");
        String shortDescription = set.getString("shortDescription");
        String description = set.getString("description");
        String imgUrl = set.getString("imgUrl");
        return new Item(itemId, price, name, shortDescription, description, imgUrl);
    }
}
