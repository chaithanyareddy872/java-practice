package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowList {
    public static int maxsubsum(List<Integer> list,int k){
        int maxsum=0;
        int start=0,end=0;
        int sum=0;
        if(list.size()<k) return -1;
        for (int i = 0; i <k ; i++) {
            maxsum=maxsum+list.get(i);
            end=i;
        }
        sum=maxsum;
        end+=1;
       while(end<list.size()){
           sum=sum-list.get(start)+list.get(end);
           if(sum>maxsum) {
               maxsum=sum;
           }
           start++;
           end++;
       }
       return maxsum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(List.of(4, 8, 9, 20, 13, 10, 3, 12, 11,3,12,51,23,45,22,1,5,15,1,0,34));
        System.out.println(maxsubsum(list1,3));
    }
}
