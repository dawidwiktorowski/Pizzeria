package com.dawidwiktorowski.Pizzeria.domain.api;


import com.dawidwiktorowski.Pizzeria.domain.user.User;
import com.dawidwiktorowski.Pizzeria.domain.user.UserDAO;

import java.time.LocalDateTime;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void register(UserRegistration userRegistration){
        User userToSave = UserMapper.map(userRegistration);
        userDAO.save(userToSave);
    }
    private static class UserMapper{
        static User map(UserRegistration userRegistration){
            return new User(
                userRegistration.getFirstName(),
                userRegistration.getLastName(),
                userRegistration.getEmail(),
                userRegistration.getPassword(),
                        LocalDateTime.now()
            );

        }
    }
}
