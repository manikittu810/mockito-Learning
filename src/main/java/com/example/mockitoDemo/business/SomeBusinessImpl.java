package com.example.mockitoDemo.business;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retreiveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value : data){
            if(value>greatestValue){
                greatestValue=value;
            }
        }
    return greatestValue;
    }
}
interface DataService{
    int [] retreiveAllData();
}
