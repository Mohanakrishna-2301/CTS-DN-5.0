package com.exercise.service;

import com.exercise.model.User;
import com.exercise.repository.UserRepository;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
    @Autowired
    private UserRepository repository;

    public User saveUser(User user)
    {
        return repository.save(user);
    }

    public User getUser(Long id)
    {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
    }

    public User getUserById(Long id)
    {
        throw new NoSuchElementException("User not found");
    }
}