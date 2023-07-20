package com.java.leetcode;

import java.util.Arrays;

public class AddingTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return ;
        if( n!=0 && m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        int[] res=new int[m+n];
        int len1=0,len2=0;
        for(int i=0;i<m+n;i++){
            if(len1<m && len2<n){
                if(nums1[len1]<=nums2[len2]){
                    res[i]=nums1[len1];
                    len1++;
                    continue;
                }
                else {
                    res[i]=nums2[len2];
                    len2++;
                    continue;
                }
            }
            if(len2<n && len1>=m ){
                res[i]=nums2[len2];
                len2++;
            }
            else if(len1<m && len2>=n){
                res[i]=nums1[len1];
                len1++;
            }
        }
        for (int i = 0; i <m+n ; i++) {
            nums1[i]=res[i];
        }


//        m=m-1;
//        n=n-1;
//        for (int i = 0; i <= n; i++) {
//            nums1[m-i]=nums2[n-i];
//        }
//        nums1=Arrays.stream(nums1).sorted().toArray();
//        Arrays.stream(nums1).forEach(System.out::println);
        return;
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0},3,new int[]{2,5,6},3);
    }

}
