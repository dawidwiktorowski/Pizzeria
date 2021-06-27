package com.dawidwiktorowski.Pizzeria.domain.user;

import com.dawidwiktorowski.Pizzeria.domain.common.BaseDAO;

import java.sql.*;

public class UserDAO extends BaseDAO {
    public void save(User user) {
        saveUser(user);
        saveUserRole(user);
    }

    private void saveUser(User user) {
        final String query = """
                        INSERT INTO
                            user (username, email, password, registration_date)
                        VALUES
                            (?, ?, ?, ?)
                        """;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setObject(4, user.getRegistrationDate());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveUserRole(User user) {
        final String query = """
                        INSERT INTO
                            user_role (username)
                        VALUES
                            (?)
                        """;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getUsername());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}