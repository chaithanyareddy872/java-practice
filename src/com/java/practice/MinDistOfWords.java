package com.java.practice;

public class MinDistOfWords {
    public static void main(String[] args) {
        String s="java is a platform depenent no java no independent no java ";
        System.out.println(new MinDistOfWords().slidingwindow(s,"java","no"));
    }


    public int slidingwindow(String str,String word1,String word2){
        int mindis=0,maxdis=-1;
        String[] values=str.trim().split(" ");
        for (int i=0;i<values.length;i++) {
            if (values[i].equals(word1)){
                mindis=i+1;
            }
            if(mindis!=0 && values[i].equals(word2)) {
                if(mindis!=0 && (maxdis>i-mindis ||maxdis==-1)) maxdis=i-mindis;
                else mindis=0;
            }
        }
        return maxdis==0?maxdis:maxdis;
    }
    public int distance(String givenstr,String word1,String word2){
        String[] stringArrayList=givenstr.trim().split(" ");
        int val=0,val1=0;
        for (int i = 0; i < stringArrayList.length; i++) {
            if(stringArrayList[i].equals(word1)){

                for (int j = i; j < (stringArrayList.length); j++) {
                        if (stringArrayList[j].equals(word2)) {
                            val=j-i;
                            if(val<val1){
                                val1=val;
                            } else if (val1==0 && val!=0) {
                                val1=val;
                            }
                            break;
                        }
                }
            }

        }
        return  val1==0?val1:val1-1;
    }
}
