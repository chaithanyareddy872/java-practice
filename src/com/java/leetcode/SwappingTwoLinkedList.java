package com.java.leetcode;

public class SwappingTwoLinkedList {
    public static MergeTwoSortedLinkedList.ListNode swapPairs(MergeTwoSortedLinkedList.ListNode head) {
        MergeTwoSortedLinkedList.ListNode dummy=new MergeTwoSortedLinkedList.ListNode();
        dummy.next=head;
        MergeTwoSortedLinkedList.ListNode node=dummy;
        while(node!=null){
            MergeTwoSortedLinkedList.ListNode first=node.next;
            MergeTwoSortedLinkedList.ListNode second=null;
            if(first!=null){
                second=first.next;
            }
            if(second!=null){
                MergeTwoSortedLinkedList.ListNode secondnext=second.next;
                second.next=first;
                node.next=second;
                first.next=secondnext;
                node=first;

            }
            else break;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedList.ListNode listNode=new MergeTwoSortedLinkedList.ListNode(1);
        listNode.next=new MergeTwoSortedLinkedList.ListNode(2);
        listNode.next.next=new MergeTwoSortedLinkedList.ListNode(3);
        listNode.next.next.next=new MergeTwoSortedLinkedList.ListNode(4);
        MergeTwoSortedLinkedList.ListNode res=swapPairs(listNode);
        while (res.next!=null){
            System.out.print(res.val +"-> ");
            res=res.next;
        }
    }
}
