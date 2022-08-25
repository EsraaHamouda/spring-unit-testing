package com.exercise.unittesting.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {


    @Test
    void test_multi_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[] {1,2,3,4});
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_one_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[] {1});
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_negative_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[] {-1,-2,-3});
        int expectedResult = -6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_mix_negative_positive_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[] {-9,-3,1,2,3,4});
        int expectedResult = -2;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_null_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        assertThrows(NullPointerException.class, ()->someBusiness.calculateSum(null));
    }

}