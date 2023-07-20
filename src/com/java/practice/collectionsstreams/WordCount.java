package com.java.practice.collectionsstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        String str="hi hello what you are you doing";
//        System.out.println(Stream.of(str.split(" ")).distinct().count());
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(3);
        int max=0;
        int secondmax=0;
        for (int i = 0; i < arrayList.size() ; i++) {
            if(arrayList.get(i)>max){
                secondmax=max;
                max=arrayList.get(i);
            }
            else if(arrayList.get(i)>secondmax){
                secondmax=arrayList.get(i);
            }

        }
        System.out.println(secondmax);

        int[][] val= new int[3][3];
        int value=1;
        for (int i = 0; i < val.length ; i++) {
            for (int j = 0; j < val.length; j++) {
                val[i][j]=value;
                value++;
            }

        }
        Arrays.stream(val).map(values->{ System.out.println(values);
            return null;
        });
//        for (int i = 0; i <val.length ; i++) {
//            for (int j = 0; j <val.length ; j++) {
//                if(i==j || j>i)
//                {
//                    System.out.println(val[i][j]);
//                }
//            }
//        }

    }
}
