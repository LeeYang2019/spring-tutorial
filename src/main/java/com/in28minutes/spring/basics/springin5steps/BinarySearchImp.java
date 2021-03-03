package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* illustration of tight coupling -> loose coupling when an interface is used
* */
@Component
public class BinarySearchImp {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImp(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numToSearchFor) {

        // bubble sort algorithm -> tightly coupled to this code
        // quick sort algorithm -> what if I want to use quick sort instead?
        // one solution is to abstract the sorting algorithm out into its own class so
        // it is not implemented here

        // one such solution
        // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        // int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

        // but what about using quickSort ? How would I dynamically determine which algorithm to use?

        // a better and more dynamic solution is to use an interface
        // "interfaces make applications loosely coupled"
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // return the result
        return 3;
    }
}
