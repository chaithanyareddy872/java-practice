package com.java.practice;

import java.util.Arrays;

public class AddingTwoSotedArrays {

    public static double sumofsortedarray(){
        int[] sum1={1,2};
        int[] sum2={3,4};
        int totallen=sum1.length+sum2.length;
        int[] sortedarray=new int[totallen];
        int indexofsum1=0,indexofsum2=0;
        for (int i = 0; i < totallen ; i++) {
            if(sum1.length<=indexofsum1 && sum2.length>indexofsum2){
                for (int j = i; j <totallen ; j++) {
                    sortedarray[j]=sum2[indexofsum2];
                    indexofsum2++;
                }
                break;
            }
            if(sum1.length>indexofsum1 && sum2.length<=indexofsum2){
                for (int j = i; j <totallen ; j++) {
                    sortedarray[j]=sum1[indexofsum1];
                    indexofsum1++;
                }
                break;
            }
            if(sum1[indexofsum1]<=sum2[indexofsum2]){
                sortedarray[i]=sum1[indexofsum1];
                indexofsum1++;
                continue;
            }
            if(sum2[indexofsum2]<sum1[indexofsum1]){
                sortedarray[i]=sum2[indexofsum2];
                indexofsum2++;
            }

        }
       Arrays.stream(sortedarray).forEach(System.out::println);
        if(totallen%2!=0){
            return sortedarray[totallen/2];
        }
        else {
            float meadian=sortedarray[(totallen / 2) - 1] + sortedarray[totallen / 2];
            System.out.println(meadian);
            return meadian/2;
        }

    }
    public static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totallen=nums1.length+nums2.length;
        int[] sortedarray=new int[totallen];
        int indexofsum1=0,indexofsum2=0;
        for (int i = 0; i < totallen ; i++) {
            if(nums1.length<=indexofsum1 && nums2.length>indexofsum2){
                for (int j = i; j <totallen ; j++) {
                    sortedarray[j]=nums2[indexofsum2];
                    indexofsum2++;
                }
                break;
            }
            if(nums1.length>indexofsum1 && nums2.length<=indexofsum2){
                for (int j = i; j <totallen ; j++) {
                    sortedarray[j]=nums1[indexofsum1];
                    indexofsum1++;
                }
                break;
            }
            if(nums1[indexofsum1]<=nums2[indexofsum2]){
                sortedarray[i]=nums1[indexofsum1];
                indexofsum1++;
                continue;
            }
            if(nums2[indexofsum2]<nums1[indexofsum1]){
                sortedarray[i]=nums2[indexofsum2];
                indexofsum2++;
            }

        }
        Arrays.stream(sortedarray).forEach(System.out::println);
        if(totallen%2!=0){
            return sortedarray[totallen/2];
        }
        else {
            float meadian=sortedarray[(totallen / 2) - 1] + sortedarray[totallen / 2];
            return meadian/2;
        }
    }

    public static int reverse(int x) {

        int duplicate=x;
        int rev=0;
        int rem=0;
        while(duplicate%10==0){
            duplicate=duplicate/10;
        }
            if(-32767 > duplicate || duplicate > 32767){
                return 0;
            }
        while(duplicate!=0){
            rev=duplicate%10+rev*10;
            duplicate=duplicate/10;
        }

        return rev;

    }



    public static void main(String[] args) {
//        System.out.println( AddingTwoSotedArrays.sumofsortedarray());
//        System.out.println( AddingTwoSotedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
        System.out.println(AddingTwoSotedArrays.reverse(90000));
    }

}
