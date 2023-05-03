package com.example.App.Users.Application;

import com.example.App.Users.Domain.UserRepository;
import com.example.App.Users.Domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users save(Users user) {
        Users existingUser = userRepository.findByEmail(user.getEmail());

        if (Objects.equals(existingUser.getEmail(), user.getEmail()))
            throw new RuntimeException("Email user exists");

        return userRepository.save(user);
    }

    // other methods
}