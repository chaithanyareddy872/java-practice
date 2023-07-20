package com.java.practice;

public class SqurtLeetCode {
    public int sqrt(int val){
        int count=0;
        while (val%2==0){
            count+=1;
            val=val/2;
        }
        return count;
    }

    public static void main(String[] args) {
        SqurtLeetCode squrtLeetCode=new SqurtLeetCode();
        System.out.println(squrtLeetCode.sqrt(16));
    }
}
