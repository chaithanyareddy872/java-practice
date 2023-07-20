package com.java.practice;

public class BinartTreeLeftNodeAdd {
    static Node root=null;
    public static boolean isleaf(Node node){
        if(node==null) return false;
        if (node.left==null && node.right==null) return true;
        return false;
    }
    public  static int addleft(Node root){
        int val=0;
        if(root!=null) {
            if (isleaf(root.left)) {
                val += root.left.val;
            }
            val+=addleft(root.left);
            val+=addleft(root.right);
        }
        return val;
    }

    public static void main(String[] args) {
        root=new Node(4);
        root.left=new Node(9);
        root.right=new Node(8);
        root.left.left=new Node(3);
        root.left.left.left=new Node(5);
        root.left.right=new Node(4);
        root.right.left=new Node(7);
        root.right.right=new Node(0);
        System.out.println(addleft(root));
    }
}
