package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resultList = new ArrayList<Integer>();
        List <Integer[]> temp = Arrays.stream(array).collect(Collectors.toList());
        for (Integer[] i :temp){
            resultList.addAll(Arrays.stream(i).collect(Collectors.toList()));
        }
        return resultList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resultList = new ArrayList<Integer>();
        List <Integer[]> temp = Arrays.stream(array).collect(Collectors.toList());
        for (Integer[] i :temp){
            resultList.addAll(Arrays.stream(i).collect(Collectors.toList()));
        }
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
