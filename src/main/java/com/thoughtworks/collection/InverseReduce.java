package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> resultList = new ArrayList<Integer>();
        Integer num = new Integer(number);
        while (num-2 > 0){
            resultList.add(num-2);
            num -= 2;
        }
        return resultList;
    }
}
