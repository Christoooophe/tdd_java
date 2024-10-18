package org.example.Bdd.Exercice.Exercice1.Service;

import org.example.Bdd.Exercice.Exercice1.Exceptions.AlreadyExistException;
import org.example.Bdd.Exercice.Exercice1.Exceptions.WrongPasswordException;
import org.example.Bdd.Exercice.Exercice1.Model.User;
import org.example.Bdd.Exercice.Exercice1.Repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(User user) {
        List<User> userFound = userRepository.findByName(user.getUsername());
        if (userFound.isEmpty()) {
            userRepository.add(user);
            return "Register successful";
        }
        else {
            throw new AlreadyExistException();
        }
    }

    public String login(User user) {
        List<User> userFound = userRepository.findByName(user.getUsername());
        if (!userFound.isEmpty() && !userFound.stream().filter(u -> u.getUsername().equals(user.getUsername())).toList().isEmpty()) {
            if (userFound.get(0).getPassword().equals(user.getPassword())) {
                return "Connection Successful";
            }
            // mauvais mot de passe
            throw new WrongPasswordException("Wrong password");
        }
        return "wrong username or password";
    }
}
