package com.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exercise.model.User;
import com.exercise.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user)
    {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) 
    {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}