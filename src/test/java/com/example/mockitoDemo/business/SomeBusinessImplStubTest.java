package com.example.mockitoDemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SomeBusinessImplStubTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
        int res = business.findTheGreatestFromAllData();
        assertEquals(25,res);

    }
    @Test
    void findTheGreatestFromAllData_basicScenario1(){
        DataServiceStub1 dataServiceStub1 = new DataServiceStub1();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub1);
        int res = business.findTheGreatestFromAllData();
        assertEquals(251,res);

    }
}
class DataServiceStub implements DataService{
    @Override
    public int[] retreiveAllData(){
        return new int[]{12,25,5};
    }
}

class DataServiceStub1 implements DataService{
    @Override
    public int[] retreiveAllData(){
        return new int[]{2,251,5};
    }
}