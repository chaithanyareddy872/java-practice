package com.java.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] integerarray={5,3,8,1,9};
        sort(integerarray);
    }
    public static void sort(int[] arrayList){
        for (int i = 0; i < arrayList.length ; i++) {
            int min= arrayList[i];
            for (int j = i+1; j < arrayList.length; j++) {
                if (arrayList[j]< arrayList[i]){
                    min= arrayList[i];
                    arrayList[i] = arrayList[j];
                    arrayList[j]=min;
                }
            }
        }
        Arrays.stream(arrayList).forEach(System.out::println);
    }
}
