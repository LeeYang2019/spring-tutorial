package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// working with beans
	// 1. define what the beans are using @component
	// 2. define the dependencies of the beans using @autowired
	// 3. define where the beans are located => no need since we are already in @springbootapplication

	public static void main(String[] args) {
		//BinarySearchImp binarySearch = new BinarySearchImp(new QuickSortAlgorithm());
		//let spring manage this by giving the applicationContext the class

		// Application context will maintain all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);
		int result = binarySearch.binarySearch(new int[] {2,3,12}, 6);
		System.out.println(result);
		// com.in28minutes.spring.basics.springin5steps.QuickSortAlgorithm@3f2049b6 since @component is set on it
		// 3
	}

}
