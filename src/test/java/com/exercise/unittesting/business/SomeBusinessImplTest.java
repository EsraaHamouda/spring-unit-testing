package com.exercise.unittesting.business;

import com.exercise.unittesting.service.MixNegPosElementStub;
import com.exercise.unittesting.service.NegElementStub;
import com.exercise.unittesting.service.OneElementStub;
import com.exercise.unittesting.service.SomeDataServiceStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {


    /**
     * typicallly we should introduce a service layer to be called from the business layer
     * so, we created here ISomeDataService (lets imagine we do some db query to retireve the array that will be summed)
     * we updating the extisting testcase with the mentioned combinations
     * so here the probelm as the interface contians one function to retrieve the data
     * so 1 option to add if - else statement in that function
     * or create different impl per test case
     * that led to big number of interface implementation and in case you added any functions in the interface you have
     * to iterate over all those implementation to add the newer one
     * and this is not a good practise
     * the solution is using mocking
     * */
    @Test
    void test_multi_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setISomeDataService(new SomeDataServiceStub());
        int actualResult = someBusiness.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_one_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setISomeDataService(new OneElementStub());
        int actualResult = someBusiness.calculateSumUsingDataService();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_negative_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setISomeDataService(new NegElementStub());
        int actualResult = someBusiness.calculateSumUsingDataService();
        int expectedResult = -6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_mix_negative_positive_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setISomeDataService(new MixNegPosElementStub());
        int actualResult = someBusiness.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_null_value_arr(){

        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        // not setting stub to business class
        assertThrows(NullPointerException.class, ()->someBusiness.calculateSumUsingDataService());
    }

}