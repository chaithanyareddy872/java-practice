package com.java.leetcode;

import com.java.practice.ListNode;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        ListNode list1=new ListNode(2);
//        list1.next=new ListNode(2);
//        list1.next.next=new ListNode(4);
        ListNode list2=new ListNode(1);
//        list2.next=new ListNode(3);
//        list2.next.next=new ListNode(4);
        Solution solution=new Solution();
        ListNode finalsolution=solution.mergeTwoListsval(list1,list2);
        while (finalsolution.next != null){
            System.out.printf(finalsolution.val+" -> ");
            finalsolution=finalsolution.next;
        }
        System.out.printf(finalsolution.val +"");
    }


      //Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
