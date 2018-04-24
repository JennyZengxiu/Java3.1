package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().mapToInt((x) ->x).summaryStatistics().getMax();
    }

    public double getMinimum() {
        return arrayList.stream().mapToInt((x) ->x).summaryStatistics().getMin();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt((x) ->x).summaryStatistics().getAverage();
    }

    public double getOrderedMedian() {
        int n = arrayList.size();
        return n % 2 == 0 ? (double) (arrayList.get(n / 2) + arrayList.get(n / 2 - 1))/2 : arrayList.get(n / 2);
    }

    public int getFirstEven() {
        return arrayList.stream().filter(i -> i % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        return arrayList.indexOf(arrayList.stream().filter(i -> i % 2 == 0).findFirst().get());
    }

    public boolean isEqual(List<Integer> arrayList) {
        return arrayList.containsAll(this.arrayList);
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (Integer i:arrayList){
            singleLink.addTailPointer(i);
        }
        int n = arrayList.size();
        return n % 2 == 0 ? (double) (arrayList.get(n / 2) + arrayList.get(n / 2 - 1))/2 : (double)arrayList.get(n / 2);
    }

    public int getLastOdd() {
        List<Integer> temp = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        return temp.get(temp.size()-1);
    }

    public int getIndexOfLastOdd() {
        List<Integer> temp = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        return arrayList.indexOf(temp.get(temp.size()-1));
    }
}

