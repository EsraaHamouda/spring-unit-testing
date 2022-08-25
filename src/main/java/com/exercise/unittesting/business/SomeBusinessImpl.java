package com.exercise.unittesting.business;

import com.exercise.unittesting.service.ISomeDataService;

public class SomeBusinessImpl {


    private ISomeDataService iSomeDataService;
    public int calculateSum(int[] input){
        int result = 0;
        for(int i : input){

            result += i;
        }
        return result;
    }
    public int calculateSumUsingDataService(){
        int result = 0;
        for(int i : iSomeDataService.retrieveBusinessData()){

            result += i;
        }
        return result;
    }

    public void setISomeDataService(ISomeDataService iSomeDataService) {
        this.iSomeDataService = iSomeDataService;
    }
}
