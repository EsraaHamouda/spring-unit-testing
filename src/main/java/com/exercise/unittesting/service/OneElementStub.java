package com.exercise.unittesting.service;

public class OneElementStub implements ISomeDataService {
    @Override
    public int[] retrieveBusinessData() {
        return new int[]{1};
    }
}
