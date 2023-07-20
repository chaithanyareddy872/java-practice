package com.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class CountingDeleted {
    public static int countofchar(int i,String s){
        int count=0;
        char ch=s.charAt(i);
        while(i!=s.length()-1 ){
            if(s.charAt(i+1)==ch) count++;
            else break;
            i++;
        }
        return count;
    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        int totalcount=0;
        for (int i = 0; i < s.length(); i++) {
            int bcount=0;
            bcount=countofchar( i, s);
            totalcount+=bcount;
            i+=bcount;
        }
        return totalcount;
    }
    public static String isValid(String s) {
        // Write your code here
        Map<Character,Integer> mapval=new HashMap();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(mapval.containsKey(s.charAt(i))){
                mapval.put(s.charAt(i), mapval.get(s.charAt(i))+1);
            }
            else mapval.put(s.charAt(i),1);
        }
//        List<Integer> valuesofset=mapval.values().stream().collect(Collectors.toList());
//
//        for (int i=0;i< mapval.size();i++){
//            if(count%)
//        }
        int onecount=0;
//        List<Integer> valuesset=mapval.values().stream().map().collect(Collectors.toList());
        Set<Integer> valuess=new HashSet<>();
        for(Map.Entry<Character,Integer> val: mapval.entrySet()){
            if(val.getValue()==1 && onecount==0){
                onecount +=1;
            }
            else valuess.add(val.getValue());
        }
        int[] val= valuess.stream().mapToInt(value->value).toArray();
        if(val[0]>2) return "NO";
        else if ((val[0]==1) || (val[1]==1)
                || val[0]==val[1]+1
                || val[1]==val[0]+1 ) return "YES";
        else return "NO";

//        count=mapval.values().stream().findFirst().get();
//        for(Map.Entry<Character,Integer> val: mapval.entrySet()){
//            if(val.getValue()==count+1 || val.getValue()==1) diff +=1;
//            else if (val.getValue()>count+1 || val.getValue()<count) {
//                diff=2;
//                break;
//            }
//        }
//        return (diff)>1?"NO":"YES";
    }

    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
    }
}
