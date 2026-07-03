package com.exercise;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class Exercise6 
{
    @Test
    void testInteractionOrder() 
    {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();
        mockApi.saveData("Java");
        mockApi.deleteData();

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).getData();
        order.verify(mockApi).saveData("Java");
        order.verify(mockApi).deleteData();
    }
}
