package com.java.practice;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(8);
        integerArrayList.add(4);
        integerArrayList.add(3);
        sort(integerArrayList);
    }
    public static void sort(ArrayList<Integer> integerArrayList){
        int swappele;
        int j;
        for (int i = 1; i < integerArrayList.size(); i++) {
            j=i;
            while (j>0){
                if(integerArrayList.get(j)<integerArrayList.get(j-1)){
                    swappele=integerArrayList.get(j);
                    integerArrayList.set(j,integerArrayList.get(j-1));
                    integerArrayList.set(j-1,swappele);
                }
                j--;
            }
        }
        integerArrayList.stream().forEach(System.out::println);
    }
}
