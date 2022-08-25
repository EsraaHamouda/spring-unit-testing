package com.exercise.unittesting.service;

public class emptyElementStub implements ISomeDataService {
    @Override
    public int[] retrieveBusinessData() {
        return new int[]{};
    }
}
