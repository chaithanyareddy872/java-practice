package com.java.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringCommonCharCount {
    public static int commonChild(String s1, String s2) {
        // Write your code here
       int count=0;
        int match=0;
        for (int i = 0; i < s1.length(); i++) {
            if (match>s2.length()) continue;
            for (int j = match; j < s2.length(); j++) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    count+=1;
                    match=j+1;
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonChild("OUDFRMYMAW","AWHYFCCMQX"));
    }
}
