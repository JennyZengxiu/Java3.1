package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();
        int temp = 0;
        boolean flag = true;
        if (left > right){
            temp = left;
            left = right;
            right = temp;
            flag = false;
        }
        for (int i = left; i <= right ; i++) {
            resultList.add(i);
        }
        if (!flag){
            Collections.reverse(resultList);
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();
        int temp = 0;
        boolean flag = true;
        if (left > right){
            temp = left;
            left = right;
            right = temp;
            flag = false;
        }
        for (int i = left; i <= right ; i++) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
            if (!flag) {
                Collections.reverse(resultList);
            }
        }
            return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                resultList.add(array[i]);
            }
        }
            return resultList;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                    resultList.add(firstArray[i]);
                }
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>();
        List<Integer> firstList = Arrays.asList(firstArray);
        List<Integer> secondList = Arrays.asList(secondArray);
        resultList.addAll(firstList);
        for (Integer i:secondList) {
            if(!firstList.contains(i)){
                resultList.add(i);
            }
        }
        return resultList;
    }
}
