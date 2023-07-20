package com.java;

public class LinearArrayMIn {
    public int findmin(int[] arrayval){
        int min=arrayval[0];
//        for (int i = 1; i < arrayval.length; i++) {
//            if(arrayval[i] < min) min=arrayval[i];
//
//        }
        for (int i = 1; i < arrayval.length/2; i++) {
            if( arrayval[i]<arrayval[arrayval.length-i] && arrayval[i]<min) min=arrayval[i];
            if (arrayval[arrayval.length-i]<arrayval[i] && arrayval[arrayval.length-i]<min) min=arrayval[arrayval.length-i];
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arrayvalues={1,10,11,-1,41,51,0, 61};
        LinearArrayMIn linearArrayMIn=new LinearArrayMIn();
        System.out.println(linearArrayMIn.findmin(arrayvalues));
    }
}
