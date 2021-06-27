package com.dawidwiktorowski.Pizzeria.domain.api;
import com.dawidwiktorowski.Pizzeria.domain.user.User;
import com.dawidwiktorowski.Pizzeria.domain.user.UserDAO;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public class UserService {
   private UserDAO userDAO = new UserDAO();

    public void register(UserRegistration userRegistration) {
        User userToSave = UserMapper.map(userRegistration);
        try{
            hashPasswordWithSha256(userToSave);
            userDAO.save(userToSave);
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }

    }

    private void hashPasswordWithSha256(User user)  throws NoSuchAlgorithmException{
        String sha256Password = DigestUtils.sha256Hex(user.getPassword());
        user.setPassword(sha256Password);
    }

    private static class UserMapper {
        static User map(UserRegistration userRegistration) {
            return new User(
                    userRegistration.getUsername(),
                    userRegistration.getEmail(),
                    userRegistration.getPassword(),
                    LocalDateTime.now()
            );
        }
    }
}