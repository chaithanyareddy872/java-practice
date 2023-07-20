package com.java.practice;

import static  java.lang.System.*;

import java.util.*;

class A{
    void A(){
        out.println("first");
    }
}

public class ExamCheckingQuestions extends A {
    public static void main(String[] args) {
        List<Integer> persons = new ArrayList<>();
        persons.add(2);
        persons.add(6);
        persons.sort(Comparator.comparing(inr));
    }

}
