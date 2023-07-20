package com.java.practice.collectionsstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCounting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,1,2,4,6);
        System.out.println(arrayList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().mapToLong(integerLongEntry ->
                integerLongEntry.getKey()).sum());
//        System.out.printf(integerHashMap.toString());
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        System.out.println(hashSet.add(1));

    }
}
