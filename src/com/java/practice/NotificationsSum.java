package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class NotificationsSum {
    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int notifications=0;
        int meadian=0;
        int start=0;
        for (int i = d; i < expenditure.size(); i++) {
            if(d%2==0){
                meadian=(expenditure.get(start+(d/2)-1)
                        +expenditure.get(start+(d/2)))/2;
                start+=1;
            }
            else
            {
                meadian=expenditure.get(start+(d/2));
                start+=1;
            }
            if((2*meadian) < expenditure.get(i)) notifications+=1;
        }
        return notifications;
    }

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(activityNotifications(arr,3));
    }

}
