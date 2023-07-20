package com.java.practice;

public class ExceptionAmbiquety {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        } catch (ArithmeticException ar){
            System.out.println(ar.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
