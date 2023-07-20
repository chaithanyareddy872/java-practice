//package com.java.practice;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class PrimeParisLeetcode {
//
//public int calculatePairs(int[] nums){
//    int numberval=0;
//    for (int i = 0; i < nums.length-1; i++) {
//        for (int j = i+1; j < nums.length; j++) {
//            boolean b =false;
//            b=(prime(nums[i],nums[j]));
//            if (b ==true){
//                numberval+=1;
//            }
//        }
//    }
//    return numberval;
//}
//
//private Boolean prime(int num2,int num3){
//    boolean val=false;
//    Set<Integer> checkval=new HashSet<>();
//    checkval.add(1);
//    checkval.add(0);
//    checkval.add(2);
//    if(checkval.contains(num2) && checkval.contains(num3) ) return true;
//
//    for (int i = 2; (i <=num2/2) || (num2==2) ; i++) {
//        if (((num2%i)==0)&&(num3%i)==0)
//        {
//            val= false;
//        }
//        else return false;
//    }
//    return val;
//}
//
//    public static void main(String[] args) {
//    int[] values={2,5,1,4};
//        System.out.println(new PrimeParisLeetcode().calculatePairs(values));
//    }
//}
