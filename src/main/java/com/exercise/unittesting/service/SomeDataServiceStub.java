package com.exercise.unittesting.service;

import com.exercise.unittesting.business.SomeBusinessImpl;

public class SomeDataServiceStub implements ISomeDataService {
    @Override
    public int[] retrieveBusinessData() {
        return new int[]{1,2,3};
    }
}
