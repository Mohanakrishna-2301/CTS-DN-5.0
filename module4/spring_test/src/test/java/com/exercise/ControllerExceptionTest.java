package com.exercise;

import com.exercise.exception.GlobalExceptionHandler;
import com.exercise.service.UserService;
import com.exercise.controller.UserController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import java.util.NoSuchElementException;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
@Import(GlobalExceptionHandler.class)
class ControllerExceptionTest 
{
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService service;

    @Test
    void testUserNotFound() throws Exception 
    {
        when(service.getUserById(100L))
                .thenThrow(new NoSuchElementException("User not found"));

        mockMvc.perform(get("/users/100"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("User not found"));
    }
}