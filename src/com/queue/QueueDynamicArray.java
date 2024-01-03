package com.queue;
import com.dynamicArray.*;

public class QueueDynamicArray <T> {
    
    private DynamicArray<T> da = new DynamicArray<>();
    private int front;

    public QueueDynamicArray(){
        front = 0;
    }

    public void enQueue(T value){
        da.insert(value);
    }

    public Object deQueue(){
        if(da.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return da.delete(front);
    }

    public void print(){
        da.print();
    }

}
