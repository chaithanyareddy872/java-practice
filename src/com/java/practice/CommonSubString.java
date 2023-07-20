package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonSubString {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] input = {"hia", "hiad", "hil"};
        System.out.println(longestCommonPrefix(input));
        List<String> lis = new ArrayList<>(Arrays.asList("ghg"));
        for (String s : lis) {

        }
    }
}
