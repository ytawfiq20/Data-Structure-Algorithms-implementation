package com.LinkedList;

public class LinkedList<T> {
    
    private Node <T> root;
    private Object [] newArr;
    public Node<T> getRoot(){
        return root;
    }
/*
 * 
 * Constructor to initialize root with null
 * 
 */
    public LinkedList(){
        root = null;
    }
/*
 * 
 * Function to generate new node
 * 
 */
    public Node <T> CreatNewNode(T value){
        Node <T> newNode = new Node<>(value);
        return newNode;
    }
/*
 * 
 * Length of linked list
 * 
 */
    public int Length(){
        Node<T> newNode = root;
        int counter = 0;
        while(newNode!=null){
            counter ++;
            newNode = newNode.next;
        }
        return counter;
    }
/*
 * 
 * Inser Node at the begging of the list
 * 
 */
    public void insertAtBegging(T value){
        Node<T> newNode = CreatNewNode(value);
        newNode.next = root;
        root = newNode;
    }
/*
 * 
 * Print list
 * 
 */
    public void print(){
        if(Length()==0){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node<T> newNode = root;
        while(newNode!=null){
            System.out.print(newNode.value);
            if(newNode.next!=null){
                System.out.print("->");
            }
            newNode = newNode.next;
        }
        System.out.println("]");
    }
 /*
* 
* Insert element at the end of linked list
* 
*/
    public void insertAtEnd(T value){
        if(root == null){
            insertAtBegging(value);
            return;
        }
        Node<T> newNode = root;
        while(newNode.next!=null){
            newNode = newNode.next;
        }
        Node<T> newNode2 = CreatNewNode(value);
        newNode.next = newNode2;
    }
/*
 * 
 * Insert element at certain position
 * 
 */
    public void insertAt(int pos, T value){
        if(pos == 1){
            insertAtBegging(value);
            return;
        }
        if(pos == Length()+1){
            insertAtEnd(value);
            return;
        }
        if(pos<0||pos>Length()+1){
            System.out.println("Position out of pounds");
            return;
        }
        Node<T> newNode1 = root;
        for(int i=1; i<pos-1; i++){
            newNode1 = newNode1.next;
        }
        Node<T> newNode2 = CreatNewNode(value);
        newNode2.next = newNode1.next;
        newNode1.next = newNode2;
        return;
    }
/*
 * 
 * remove first node
 * 
 */
    public T removeFirstNode(){
        if(root==null){
            System.out.println("No elements to remove");
            return null;
        }
        T element = root.value;
        root = root.next;
        return element;
    }
/*
 * 
 * remove last node
 * 
 */
    public T removeLastNode(){
        T element;
        if(root==null){
            System.out.println("No elements to remove");
            return null;
        }
        else if(root.next==null){
            element = root.value;
            root = root.next;
            return element;
        }
        else if(root.next.next==null){
            element = root.next.value;
            root = root.next;
            return element;
        }
        Node<T> newNode = root;
        while(newNode.next.next!=null){
            newNode = newNode.next;
        } 
        element = newNode.next.value;
        newNode.next = null;
        return element;
    }
/*
 * 
 * remove node at certain position
 * 
 */
    public T removeFrom(int pos){
        T element;
        if(pos == 1){
            return removeFirstNode();
        }
        else if(pos == Length()){
            return removeLastNode();
        }
        else if(pos <=0 || pos > Length()){
            System.out.println("Position out of pounds");
            return null;
        }
        Node<T> newNode1 = root;
        for(int i=1; i<pos-1; i++){
            newNode1 = newNode1.next;
        }
        element = newNode1.next.value;
        newNode1.next = newNode1.next.next;
        return element;
    }
/*
 * 
 * remove node at certain position
 * 
 */
    public void reverse(){
        Node <T> pre, next, cur;
        pre = null;
        cur = root;
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        root = pre;
    }
/*
 * 
 * convert linked list to array
 * 
 */
    public Object[] toArray(){
        newArr = new Object[Length()];
        Node<T> newNode = root;
        int i=0;
        while(i<Length()){
            newArr[i] = newNode.value;
            i++;
            newNode = newNode.next;
        }
        return newArr;
    }
/*
 * 
 * print array
 * 
 */
    public void printArray(){
        Object [] array = toArray();
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(newArr[i]);
            if(i<newArr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
