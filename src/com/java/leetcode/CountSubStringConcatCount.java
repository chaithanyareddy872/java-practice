package com.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSubStringConcatCount {
    public static boolean getindex(String s, Map<String, Integer> words, int startindex, int wordlen,int count){
        HashMap<String, Integer> res=new HashMap<>();
        for(int i=startindex;i<startindex+count*wordlen;i+=wordlen){
            res.put(s.substring(i,i+wordlen),res.getOrDefault(s.substring(i,i+wordlen),0)+1);
        }
        if(words.equals(res)) return true;
        else return false;
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        int len=s.length();
        int wordlen=words[0].length();
        HashMap<String, Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
            count++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<(len-(words.length*wordlen-1));i++){
            if(map.containsKey(s.substring(i,i+wordlen))){
                if(getindex(s,map,i,wordlen,count)==true) res.add(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> res=findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"});
    }
}
