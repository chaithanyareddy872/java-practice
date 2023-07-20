package com.java.leetcode;

public class SummationOfLinkedList {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sumListNode=new ListNode();
            ListNode head=sumListNode;
            int sum=0,reminder=0;
            while(l1!=null && l2!=null){
                if(l1==null && l2!=null)
                {
                    sumListNode.val=l2.val;
                    sumListNode.next=new ListNode();
                    l2=l2.next;
                }
                else if(l2==null && l1 !=null){
                    sumListNode.val=l1.val;
                    sumListNode.next=new ListNode();
                    l1=l1.next;
                }
                else {

                    sum=l1.val+l2.val+reminder;
                    reminder=sum/10;
                    sum=sum%10;
                    sumListNode.val=sum;
                    sumListNode.next=new ListNode();
                    sumListNode=sumListNode.next;
                    l1=l1.next;
                    l2=l2.next;
                }
            }
            return head;

        }
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode();
        ListNode listNode2=new ListNode();
        ListNode head=new ListNode();
        listNode2=head;
        head.val=3;
        head.next=new ListNode();
        head.next.val=5;
        ListNode head1=new ListNode();
        listNode1=head1;
        head1.val=7;
        head1.next=new ListNode();
        head1.next.val=2;
        Solution solution=new Solution();
        ListNode headsolution=solution.addTwoNumbers(listNode1,listNode2);
        while (headsolution.next==null)
        {
            System.out.printf(headsolution.val+" -> ");
        }
    }
}
