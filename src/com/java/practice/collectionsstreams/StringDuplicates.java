package com.java.practice.collectionsstreams;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDuplicates {
    public static void main(String[] args) {
//        String name="saammplestring";
//        Map<Character, Long> res=name.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
//        Map<String,Long> result=Stream.of(name.split("")).collect(Collectors.toList()).stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
////        System.out.printf(result.toString());
//        System.out.printf(res.toString());
//        char[] chars=name.toCharArray();
//        Map<Character,Integer> val=new HashMap<>();
//        for (char c:chars) {
//            if(val.containsKey(c)){
//                val.put(c,val.get(c)+1);
//            }
//            else {
//                val.put(c,1);
//            }
//        }
//        for (char c: val.keySet()
//             ) {
//            if(val.get(c)>1){
//                System.out.println(c+" : "+val.get(c));
//            };
//        }
        StringBuilder stringbuilder=new StringBuilder("helloh");
        int len=stringbuilder.length()-1;
        for (int i=0;i<len;i++){
            char value=stringbuilder.charAt(i);
            stringbuilder.setCharAt(i, stringbuilder.charAt(len));
            stringbuilder.setCharAt(len,value);
            len--;
        }
        System.out.println(stringbuilder);
        int val1=10,val2=20;
        val1=val1+val2;
        val2=val1-val2;
        val1=val1-val2;
        System.out.println(val1+" "+val2);
        String s = "  abc  def\t";

        s = s.strip();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yy");
        System.out.println(new Date().getDate());
    }
}
