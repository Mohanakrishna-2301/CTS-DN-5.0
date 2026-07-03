package com.exercise;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise4 
{
    @Test
    void testVoidMethod() 
    {
        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).deleteData();

        MyService service = new MyService(mockApi);

        service.delete();

        verify(mockApi).deleteData();
    }
}
