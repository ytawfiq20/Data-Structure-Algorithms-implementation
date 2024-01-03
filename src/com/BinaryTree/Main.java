package com.BinaryTree;

public class Main {
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = new Node(15);
        bt.add(root, new Node(20));
        bt.add(root, new Node(10));
        bt.add(root, new Node(12));
        bt.add(root, new Node(4));
        bt.add(root, new Node(1));
        bt.postorder(root);
        System.out.println();
        bt.delete(root, 15);
        bt.postorder(root);
        System.out.println();
    }

}
