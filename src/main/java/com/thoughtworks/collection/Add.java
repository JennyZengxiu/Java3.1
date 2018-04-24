package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0 , temp = 0;
        if (leftBorder > rightBorder){
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder ; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0 , temp = 0;
        if (leftBorder > rightBorder){
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder ; i++) {
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i:arrayList){
            if (i % 2 != 0){
                i = i * 3 + 2;
            }
            resultList.add(i);
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer i:arrayList) {
            if (i % 2 != 0) {
                sum += i * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        int median = 0;
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i :arrayList){
            if(i % 2 ==0 ){
                resultList.add(i);
            }
        }
        median = arrayList.get(arrayList.size()/2);
        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int average = 0;
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i :arrayList){
            if(i % 2 ==0 ){
                average += i;
                resultList.add(i);
            }
        }
        average /= resultList.size();
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i :arrayList) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
        }
        return resultList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i :arrayList) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        List<Integer> subResult = new ArrayList<Integer>();
        for (Integer i :arrayList) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
            else {
                subResult.add(i);
            }
        }
        Collections.sort(resultList);
        Collections.sort(subResult);
        Collections.reverse(subResult);
        resultList.addAll(subResult);
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i <  arrayList.size() - 1 ;i++){
            Integer result = ( arrayList.get(i) + arrayList.get(i + 1)) * 3;
            resultList.add(result);
        }
        return resultList;
    }
}
