package com.java.practice;
class Testing{
    public Testing() {
        System.out.println("constructor called");
    }
}
public class SortString {
    public static void main(String[] args) throws Exception {
        Object o=Class.forName(args[0]).newInstance();
        System.out.println("given class is"+o.getClass().getName());
    }
}
