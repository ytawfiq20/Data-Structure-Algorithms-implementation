package com.stack;
import com.LinkedList.*;

public class StackLinkedList <T> {

    public StackLinkedList(){}

    private LinkedList<T> ll = new LinkedList<>();

    public void push(T value){
        ll.insertAtEnd(value);
    }

    public T pop(){
        return ll.removeLastNode();
    }

    public void print(){
        ll.print();
    }

    public boolean isEmpty(){
        return ll.Length() == 0;
    }

    public int getStackCapacity(){
        return ll.Length();
    }

    public T top(){
        Node<T> newNode = ll.getRoot(); 
        while(newNode.next!=null){
            newNode = newNode.next;
        }
        return newNode.value;
    }

    
}
