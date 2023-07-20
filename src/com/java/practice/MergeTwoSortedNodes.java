package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedNodes {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode listnode=new ListNode(0);
        ListNode listnodefinal=listnode;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1.next!=null && list2.next!=null){
            if(list1.val <= list2.val){
                listnode.val=list1.val;
                listnode.next=new ListNode();
                listnode=listnode.next;
                list1=list1.next;

            }
            else {
                listnode.val=list2.val;
                listnode.next=new ListNode();
                listnode=listnode.next;
                list2=list2.next;
            }


        }

        if(list1.next==null && list1.val<=list2.val){
            listnode.val=list1.val;
            listnode.next=list2;
            return listnodefinal;
        }
        if(list2.next==null && list2.val<list1.val){
            listnode.val=list2.val;
            listnode.next=list1;
        }
        return listnodefinal;

    }

    public static void main(String[] args) {
//        ListNode list1=new ListNode(1);
//        ListNode listnode=list1;
//        listnode.next=new ListNode(2);
//        listnode=listnode.next;
//        listnode.next=new ListNode(4);
//        ListNode list2=new ListNode(1);
//        listnode=list2;
//        listnode.next=new ListNode(3);
//        listnode=listnode.next;
//        listnode.next=new ListNode(4);
//        ListNode list1=new ListNode(2);
//        ListNode list2=new ListNode(1);
        ListNode list1=new ListNode(-9);
        list1.next=new ListNode(3);
        ListNode list2=new ListNode(5);
        list2.next=new ListNode(7);
        mergeTwoLists(list1,list2);
    }
}
