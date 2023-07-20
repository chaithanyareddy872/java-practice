package com.java.leetcode;

public class Palindrom {
    public static void main(String[] args) {
        Palindrom palindrom=new Palindrom();
        System.out.println(palindrom.isPalindrome(121));
    }
        public boolean isPalindrome(int x) {
            boolean status=false;
            if(x>0)
            {
                int copyval=x;
                int rem=0;
                while(copyval>0){
                    rem=copyval%10+rem*10;
                    copyval=copyval/10;
                }
                if(rem==x){
                    status = true;
                }
            }
            return status;
        }
}
