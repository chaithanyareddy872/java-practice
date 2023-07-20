package com.java.practice;

public class ArraySwapCount {
    static int minimumSwaps(int[] arr) {
        int result=0;
        int dummy=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==i) {
                continue;
            }
            else{
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] == i+1){
                        dummy=arr[i];
                        arr[i]=arr[j];
                        arr[j]=dummy;
                        result +=1;
                        break;
                    }

                }
            }

        }
        return result;


    }

    public static void main(String[] args) {
        int[] arr={4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }
}
