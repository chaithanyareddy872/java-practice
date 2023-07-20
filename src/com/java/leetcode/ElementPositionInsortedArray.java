package com.java.leetcode;

public class ElementPositionInsortedArray {
    public static int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1,mid=nums.length/2;
        if(nums[nums.length-1]<target) return nums.length;
        while(start>end){
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                end=mid;
                mid=(start+end)/2;
            }
            else {
                start=mid;
                mid=(start+end)/2;
            }
        }
        return start+1;
    }

    public static void main(String[] args) {
        int[] val={1,2,4,5,6};
        System.out.println(searchInsert(val,3));
    }
}
