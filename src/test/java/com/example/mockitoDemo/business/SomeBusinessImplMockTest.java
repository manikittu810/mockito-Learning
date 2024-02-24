package com.example.mockitoDemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl business;
    @Test
    void findTheGreatestFromAllData_basicScenario(){
       when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{1,25,5});
        assertEquals(25, business.findTheGreatestFromAllData());

    }

    @Test
    void findTheGreatestFromAllData_basicScenario2(){
        when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{5,25,35});
        assertEquals(35, business.findTheGreatestFromAllData());
    }
    void findTheGreatestFromAllData_basicScenario3(){
        when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findTheGreatestFromAllData());
    }

}
