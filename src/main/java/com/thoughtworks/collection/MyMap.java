package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(i -> i * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<>();
        for (Integer i:array){
            resultList.add(letterList.get(i-1));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<>();
        for (Integer i:array){
            Integer a = i % 26;
            Integer b = i / 26;
            if (b > 0 && a >0){
                resultList.add(letterList.get(b - 1) + letterList.get(a - 1));
            }
            else if (b> 0 && a==0){
                resultList.add(letterList.get(b - 2) + "z");
            }
            else {
                resultList.add(letterList.get(a - 1));
            }
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultList = new ArrayList<Integer>();
        resultList = array.stream().sorted().collect(Collectors.toList());
        Collections.reverse(resultList);
        return resultList;
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
