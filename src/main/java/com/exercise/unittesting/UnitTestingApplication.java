package com.exercise.unittesting;

import com.exercise.unittesting.business.SomeBusinessImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingApplication.class, args);

		SomeBusinessImpl someBusiness = new SomeBusinessImpl();
		int res = someBusiness.calculateSum(new int[]{1, 2, 3});
		System.out.println(res);
	}

}
