package com.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class Exercise7 
{
    @Test
    void testVoidException() 
    {
        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete Failed"))
                .when(mockApi)
                .deleteData();

        assertThrows(RuntimeException.class, () -> {
            mockApi.deleteData();
        });
    }
}