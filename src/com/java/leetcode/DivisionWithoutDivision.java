package com.java.leetcode;

public class DivisionWithoutDivision {
    public static void main(String[] args) {
        String hi="klsd";
        
        DivisionWithoutDivision divisionWithoutDivision=new DivisionWithoutDivision();
        System.out.printf(divisionWithoutDivision.divide(-2147483648,-1)+"");
    }
    public int divide(int dividend, int divisor) {
        int reminder=0;
        int divident=0;
        int dividendcopy=dividend;
        int divisorcopy=divisor;
        divisor=divisor<0?-(divisor):divisor;
        dividend=dividend<0?-(dividend):dividend;
        while(dividend>=(divident+divisor)){
            divident += divisor;
            reminder++;
        }

        return divisorcopy>=0 ^ dividendcopy>=0?-(reminder):reminder;
    }

}
