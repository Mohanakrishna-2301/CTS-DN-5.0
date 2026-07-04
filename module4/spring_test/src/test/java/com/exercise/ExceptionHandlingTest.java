package com.exercise;

import com.exercise.model.User;
import com.exercise.service.UserService;
import com.exercise.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExceptionHandlingTest 
{
    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testUserFound()
    {
        User user = new User(1L,"Alan");

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        User result = service.getUser(1L);

        assertEquals("Alan",result.getName());
    }

    @Test
    void testUserNotFound()
    {
        when(repository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> service.getUser(1L));
    }
}