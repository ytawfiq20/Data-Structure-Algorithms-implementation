package com.queue;
import com.LinkedList.*;

public class QueueLinkedList <T> {

    private LinkedList<T> ll = new LinkedList<>();

    public void enQueue(T valure){
        ll.insertAtEnd(valure);
    }

    public T deQueue(){
        if(ll.Length()==0){
            System.out.println("Queue is empty");
            return null;
        }
        return ll.removeFirstNode();
    }

    public void print(){
        ll.print();
    }

    
}
