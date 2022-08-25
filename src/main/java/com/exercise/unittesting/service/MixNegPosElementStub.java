package com.exercise.unittesting.service;

public class MixNegPosElementStub implements ISomeDataService {
    @Override
    public int[] retrieveBusinessData() {
        return new int[]{-1, -2, 9};
    }
}
