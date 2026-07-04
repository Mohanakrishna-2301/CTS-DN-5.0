package com.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.exercise.model.User;
import com.exercise.repository.UserRepository;
import com.exercise.service.UserService;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest 
{
    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    @Test
    void testGetUser() 
    {
        User user=new User();
        user.setId(1L);
        user.setName("John");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        User result = service.getUser(1L);

        assertEquals("John",result.getName());
    }
}
