package com.java.leetcode;

import com.java.practice.ListNode;

public class Solution {

    public MergeTwoSortedLinkedList.ListNode mergeTwoLists(MergeTwoSortedLinkedList.ListNode list1, MergeTwoSortedLinkedList.ListNode list2) {

        MergeTwoSortedLinkedList.ListNode listnode=new MergeTwoSortedLinkedList.ListNode(0);
        MergeTwoSortedLinkedList.ListNode listnodefinal=listnode;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1.next!=null || list2.next!=null){
            if(list1.val <= list2.val){
                listnode.val=list1.val;
                listnode.next=new MergeTwoSortedLinkedList.ListNode();
                listnode=listnode.next;
                list1=list1.next;
            }
            else {
                listnode.val=list2.val;
                listnode.next=new MergeTwoSortedLinkedList.ListNode();
                listnode=listnode.next;
                list2=list2.next;
            }


        }

        if(list1.next==null){
            listnode.val=list1.val;
            listnode.next=list2;
        }
        if(list2.val==0) {
            listnode.val=list2.val;
            listnode.next=list1;
        }
        return listnodefinal;

    }
    public MergeTwoSortedLinkedList.ListNode mergeTwoListsval(MergeTwoSortedLinkedList.ListNode list1, MergeTwoSortedLinkedList.ListNode list2) {

        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        MergeTwoSortedLinkedList.ListNode node=list1;

        while (list2.next !=null || list1.next !=null){

            if(list1.val< list2.val){
                list1=list1.next;
            }
            else if(list1.val> list2.val){
                int val= list1.val;
                list1.val= list2.val;
                list2=list2.next;
                list1.next=new MergeTwoSortedLinkedList.ListNode(val);
                list1=list1.next;
                continue;
            }

        }
        if(list1.next==null && list2.next!=null){
            if(list1.val< list2.val)
            {
                node.val = list1.val;
                node.next = list2;
            } else if (list1.val> list1.val) {
                node.val= list2.val;
                node.next=list1;
            }
            return node;
        }
        else if(list2.next==null && list1.next!=null){
            if(list1.val< list2.val)
            {
                
                node.val = list1.val;
                node.next = list2;
            } else if (list1.val> list1.val) {
                node.val= list2.val;
                node.next=list1;
            }
            return node;
        }
        return node;
    }

}
