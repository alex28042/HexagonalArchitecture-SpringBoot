package com.example.App.Users.Application;

import com.example.App.Users.Domain.UserRepository;
import com.example.App.Users.Domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users save(Users user) {
        return userRepository.save(user);
    }

    // other methods
}