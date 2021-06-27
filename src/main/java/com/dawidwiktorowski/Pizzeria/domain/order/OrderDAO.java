package com.dawidwiktorowski.Pizzeria.domain.order;

import com.dawidwiktorowski.Pizzeria.config.DataSourceProvider;
import com.dawidwiktorowski.Pizzeria.domain.common.BaseDAO;
import com.dawidwiktorowski.Pizzeria.item.Item;
import com.dawidwiktorowski.Pizzeria.order.Order;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends BaseDAO {


    public List<Order> findAll() {
        final String query = """
                SELECT
                id, name, price, address, telephone
                FROM
                orderr
                """;
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Order> allOrder = new ArrayList<>();
            while (resultSet.next()) {
                Order order = mapRow(resultSet);
                allOrder.add(order);
            }
            return allOrder;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Order order) {

        final String query = """
                INSERT INTO
                    orderr (id, price, name, address, telephone)
                VALUES
                    (?, ?, ?, ?, ?)
                """;

        final String sale = """
                INSERT INTO
                    sale (id, id_tow, quantity)
                VALUES
                    (?, ?, ?);
                 """;
        final String stockLevel = """
                UPDATE
                    stock_level 
                    set
                    conditionn = conditionn - 1
                WHERE
                    name = ?;
                 """;


        Connection connection = getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement updateSale = connection.prepareStatement(sale, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement updateStockLevel = connection.prepareStatement(stockLevel, Statement.RETURN_GENERATED_KEYS)) {
            connection.setAutoCommit(false);
            statement.setLong(1, order.getId());
            statement.setDouble(2, order.getPrice());
            statement.setString(3, order.getName());
            statement.setString(4, order.getAddress());
            statement.setString(5, order.getTelephone());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                order.setId(generatedKeys.getLong(1));
            }

            updateSale.setLong(1, order.getId());
            updateSale.setLong(2, order.getGoodsId());
            updateSale.setLong(3, order.getCondition());
            updateSale.executeUpdate();
            ResultSet generatedKeys1 = updateSale.getGeneratedKeys();
            if (generatedKeys.next()) {
                order.setGoodsId(generatedKeys1.getLong(1));
            }
            updateStockLevel.setString(1, order.getName());
            updateStockLevel.executeUpdate();
            ResultSet generatedKeys2 = updateSale.getGeneratedKeys();
            if (generatedKeys.next()) {
                order.setGoodsId(generatedKeys2.getLong(1));
            }

            connection.commit();
        } catch (SQLException en) {
            try {
                System.err.print("Transaction is being rolled back");
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throw new RuntimeException("ROOLBACK");
        }
    }

    public static Order mapRow(ResultSet set) throws SQLException {
        long id = set.getLong("id");
        Double price = set.getDouble("price");
        String name = set.getString("name");
        String address = set.getString("address");
        String telephone = set.getString("telephone");
        return new Order(id, price, name, address, telephone);
    }

    public static Order mapRow1(ResultSet set) throws SQLException {
        long id = set.getLong("id");
        Double price = set.getDouble("price");
        String name = set.getString("name");
        String address = set.getString("address");
        String telephone = set.getString("telephone");
        long goodsId = set.getInt("quantity");
        long condition = set.getInt("conditionn");
        return new Order(id, price, name, address, telephone, goodsId, condition);
    }
}
