package com.stack;

public class StackFixedArray <T> {
    
    private Object [] arr;
    private int size;
    private int counter;

    public StackFixedArray(int size){
        this.size = size;
        arr = new Object [size];
        counter = -1;
    }

    public boolean isEmpty(){
        return counter == -1;
    }

    public boolean isFull(){
        return counter==size-1;
    }

    public void push(T value){

        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        counter ++;
        arr [counter] = value;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("No elements to remove stack is empty");
            return null;
        }
        Object element = arr[counter];
        counter--;
        return element;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("[Stack is empty]");
            return;
        }
        System.out.print("[");
        for(int i=0; i<=counter; i++){
            System.out.print(arr[i]);
            if(i<counter){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public int numberOfElements(){
        return counter;
    }

    public Object top(){
        if(counter==0){
            return null;
        }
        return arr[counter];
    }

}
