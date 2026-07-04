package com.exercise;

import com.exercise.model.User;
import com.exercise.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserIntegrationTest 
{
    @Autowired
    private UserRepository repository;

    @Test
    void testSaveAndFetchUser()
    {
        User user = new User(1L,"Alan");

        repository.save(user);

        User saved = repository.findById(1L).orElse(null);

        assertNotNull(saved);

        assertEquals("Alan",saved.getName());
    }
}