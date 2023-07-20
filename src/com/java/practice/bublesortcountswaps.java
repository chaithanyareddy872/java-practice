package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bublesortcountswaps {
    public static long countInversions(List<Integer> arr) {
        // Write your code here
        int count=0;
        int i= 0;
        while (i<arr.size()-1){
            if(arr.get(i+1)<arr.get(i)){
                int temp=arr.get(i);
                arr.set(i, arr.get(i+1));
                arr.set(i+1, temp);
                count +=1;
                i=0;
            }
            else  i +=1;
        }
        arr.stream().forEach(System.out::println);
        return count;
    }
    public static int makeAnagram(String a, String b) {
        // Write your code here
        Map<Character,Long> firstMap=new HashMap<>();
        firstMap= Stream.of(a.split("")).map(val->val.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        char[] val=b.toCharArray();
        Long count=0L;
        for(char c:val){
            if(firstMap.containsKey(c)){
                if(firstMap.get(c)==1) firstMap.remove(c);
                else firstMap.put(c,firstMap.get(c)-1);
            }
            count++;
        }
        for (Map.Entry<Character,Long> c : firstMap.entrySet()) {
            count +=c.getValue();
        }
        return Math.toIntExact(count);
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(1);
//        countInversions(list);
        System.out.println(makeAnagram("cde","abc"));
    }
}

