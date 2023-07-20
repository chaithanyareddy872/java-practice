package com.java.practice;

public class CountOfNonMatchLeetcode {
    public static int removeElement(int[] nums, int val) {
        int pointer=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val)  {
                    nums[pointer]=nums[i];
                    pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] val={3,3};
        System.out.println(removeElement(val,3));
    }
}
