package com.exercise.unittesting.business;

public class SomeBusinessImpl {


    public int calculateSum(int[] input){
        int result = 0;
        for(int i : input){

            result += i;
        }
        return result;
    }
}
