package com.example.App.Users.Application;

import com.example.App.Users.Application.UserService;
import com.example.App.Users.Domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Users create(@RequestBody Users user) {
        return userService.save(user);
    }

    @GetMapping("/{email}")
    public Users findByEmail(@PathVariable String email) { return userService.findByEmail(email); }

}