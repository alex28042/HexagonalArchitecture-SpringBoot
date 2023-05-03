package com.example.App.Users.Application;

import com.example.App.Users.Application.UserService;
import com.example.App.Users.Domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Users create(@RequestBody Users user) {
        return userService.save(user);
    }

    // other methods
}