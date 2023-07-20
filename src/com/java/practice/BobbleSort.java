package com.java.practice;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {
        int[] intarray={3,2,5,6,7};
        sort(intarray);
    }
    public static void sort(int[] arrayint){
        int max;
        for (int j = 0; j < arrayint.length; j++) {
            for (int i = 1; i < arrayint.length ; i++) {
                if(arrayint[i] < arrayint[i-1]){
                    max=arrayint[i-1];
                    arrayint[i-1]=arrayint[i];
                    arrayint[i]=max;
                }
            }
        }
        Arrays.stream(arrayint).forEach(System.out::println);

    }
}
