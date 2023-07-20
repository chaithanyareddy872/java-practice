package com.java.practice.collectionsstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloudThunders {
    public static int jumpingOnClouds(List<Integer> c) {
        int steps=0;
        for(int i=0;i<c.size()-1;i++){
            if(i!=c.size()-2 && c.get(i+2)==0){
                steps+=1;
                i=i+1;
            }
            else steps+=1;
        }

        return steps;
        // Write your code here

    }

    public static void main(String[] args) {
        List<Integer> arr= new ArrayList();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        System.out.println(jumpingOnClouds(arr));
    }
}
