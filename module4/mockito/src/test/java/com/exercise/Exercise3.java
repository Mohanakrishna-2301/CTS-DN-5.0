package com.exercise;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class Exercise3
{
    @Test
    void testArgumentMatching() 
    {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.save("Hello");

        verify(mockApi).saveData(anyString());
    }
}