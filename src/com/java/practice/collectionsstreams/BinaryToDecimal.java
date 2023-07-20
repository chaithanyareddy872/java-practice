package com.java.practice.collectionsstreams;

import java.util.LinkedList;

public class BinaryToDecimal {
    static class Node
    {
        boolean data;
        Node next;
    };
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = (data==1? true:false);
        temp.next = null;
        return temp;
    }
    static int decimalValue( Node head){
        int res=0;
        while (head!=null){
            res = (res << 1) + (head.data?1:0);
            head=head.next;
        }
        return res;
    }
    public static void main(String[] args) {
        Node head=newNode(1);
        head.next=newNode(1);
        head.next.next=newNode(0);
        head.next.next.next=newNode(1);
        System.out.println(3<<1);

        System.out.println(decimalValue(head));
//       v return val*Math.pow(2,1);}).forEach(System.out::println);
//                .reduce(0d,(val1, val2)->{return val1+val2;}));
    }
}
