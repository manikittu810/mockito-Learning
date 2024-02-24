package com.example.mockitoDemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessImplMockTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){

       DataService dataServiceMock = mock(DataService.class);

       when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{1,25,5});

        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);

        assertEquals(25, business.findTheGreatestFromAllData());

    }

    @Test
    void findTheGreatestFromAllData_basicScenario2(){

        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{5,25,35});

        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);

        assertEquals(35, business.findTheGreatestFromAllData());

    }

}
