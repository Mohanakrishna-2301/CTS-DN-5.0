package com.exercise;

import com.exercise.model.User;
import com.exercise.repository.UserRepository;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest 
{
    @Autowired
    private UserRepository repository;

    @Test
    void testFindByName() 
    {
        repository.save(new User(1L, "Alan"));
        repository.save(new User(2L, "Bob"));
        repository.save(new User(3L, "Alan"));

        List<User> users = repository.findByName("Alan");

        // Assert
        assertEquals(2, users.size());

        assertEquals("Alan",users.get(0).getName());

        assertEquals("Alan",users.get(1).getName());
    }
}