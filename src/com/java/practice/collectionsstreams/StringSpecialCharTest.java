package com.java.practice.collectionsstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSpecialCharTest {
    public static void main(String[] args) {
        String samplestring="hell@o";
        int count=0;
        for (int i = 0; i < samplestring.length(); i++) {
            if(!Character.isDigit(samplestring.charAt(i)) && ! Character.isAlphabetic(samplestring.charAt(i))){
                count++;
            }
        }
//        System.out.printf("total number of special characters count is: "+count);

        String stringone="abcd";
        String stringtwo="dabc";
        //abcdabcd
        if((stringone.length()==stringtwo.length()) && ((stringone+stringone).indexOf(stringtwo) !=-1)){
            System.out.printf("string is  rotative");
        }
        else {
            System.out.printf("string is not rotative");
        }
//        char[] arr=stringone.toCharArray();
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.printf(arr[0]+"");
//        }
//        System.out.printf();
//        Set characterSet= new HashSet<>(List.of(arr));
//        characterSet.stream().forEach(System.out::println);
//        for (int i = 0; i <stringone.length() ; i++) {
//            char[] arr=stringone.toCharArray();
//
//        }


    }
}





