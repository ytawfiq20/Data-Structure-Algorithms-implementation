package com.BinaryTree;

public class Node {
    
    private int value;
    private Node left;
    private Node right;

    public Node(int value){

        left = null;
        right = null;
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }
    public void setLeftNode(Node left){
        this.left = left;
    }

    public void setRightNode(Node right){
        this.right = right;
    }
    
    public int getValue(){
        return value;
    }

    public Node getLeftNode(){
        return left;
    }

    public Node getRightNode(){
        return right;
    }

}
