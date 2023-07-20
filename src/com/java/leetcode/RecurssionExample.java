package com.java.leetcode;

public class RecurssionExample {
    public static MergeTwoSortedLinkedList.ListNode combinedlinedlist(MergeTwoSortedLinkedList.ListNode l1, MergeTwoSortedLinkedList.ListNode l2){
        if(l1.next==null) return l2;
        if(l2.next==null) return l1;
        if(l1.val<l2.val){
            l1.next=combinedlinedlist(l1.next,l2);
            return l1;
        }
        else{
            l2.next=combinedlinedlist(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedList.ListNode l1=new MergeTwoSortedLinkedList.ListNode(1);
        l1.next=new MergeTwoSortedLinkedList.ListNode(3);
        l1.next.next=new MergeTwoSortedLinkedList.ListNode(5);
        MergeTwoSortedLinkedList.ListNode l2=new MergeTwoSortedLinkedList.ListNode(1);
        l2.next=new MergeTwoSortedLinkedList.ListNode(2);
        l2.next.next=new MergeTwoSortedLinkedList.ListNode(5);
        l2.next.next.next=new MergeTwoSortedLinkedList.ListNode(7);
        MergeTwoSortedLinkedList.ListNode l3=combinedlinedlist(l1,l2);
    }
}
