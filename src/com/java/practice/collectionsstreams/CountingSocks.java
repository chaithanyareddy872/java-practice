package com.java.practice.collectionsstreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingSocks {

    public  int countingsocks(List<Integer> arr){
        Map<Integer,Long> countmap=new HashMap<>();

        countmap=arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Integer, Long> entryset:countmap.entrySet()){
            if(entryset.getValue()%2==0);
        }
        return Math.toIntExact(((countmap.entrySet().stream().filter(entryset -> entryset.getValue() >= 2 || entryset.getValue()==1).map(entryset -> {
            return entryset.getValue() / 2;
        }).reduce(0L, (val1, val2) -> {
            return val1 + val2;
        }))));
    }
    public static int countingValleys(int steps,String path) {
        // Write your code here
        Stack<Character> stack=new Stack<>();
        steps=0;
        char[] chars=path.toCharArray();
        if(chars.length==0) return 0;
        for (int i=0;i<chars.length;i++) {

            if(stack.isEmpty()) {
               stack.push(chars[i]);
                if(chars[i]=='U' || chars[i]=='D') steps+=1;
            }

            else if((chars[i]=='D' && stack.peek()=='U') ||
                    (stack.peek()=='D' && chars[i]=='U')){
                stack.pop();
            }
            else {
                stack.push(chars[i]);
            }
        }
        return steps-1;

    }
    public static void main(String[] args) {
        String s="UDUUUDUDDD";
        System.out.println(countingValleys(8,s));
        List<Integer> arr=new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(5);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(5);
//        6 5 2 3 5 2 2 1 1 5 1 3 3 3 5
//        System.out.println(new CountingSocks().countingsocks(arr));
//        System.out.println(3/2);
    }
}
