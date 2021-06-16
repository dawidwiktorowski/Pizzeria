package com.dawidwiktorowski.Pizzeria.domain.user;

import com.dawidwiktorowski.Pizzeria.domain.common.BaseDAO;

import java.sql.*;

public class UserDAO extends BaseDAO {
    public void save (User user){
        saveUser(user);
        saveUserRole(user);
    }


    private void saveUser(User user) {
        final String query = """
                INSERT INTO
                user (firsName,lastName, email, password, registration_date)
                VALUES
                (?,?,?,?)
                       """;
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setObject(5, user.getRegistrationDate());
            statement.executeUpdate();
            ResultSet generatedKEYS = statement.getGeneratedKeys();
            if(generatedKEYS.next()){
                user.setId(generatedKEYS.getInt(1));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void saveUserRole(User user) {
    final String query = """
            INSERT INTO
            user_role (firstName)
            VALUES
            (?)
            """;
    try (Connection connection = getConnection();
    PreparedStatement statement = connection.prepareStatement(query)){
        statement.setString(1, user.getFirstName());
        statement.executeUpdate();
    }catch (SQLException e){
        throw new RuntimeException(e);
    }
    }
}
