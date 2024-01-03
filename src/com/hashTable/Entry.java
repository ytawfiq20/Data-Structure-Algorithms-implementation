package com.hashTable;

public class Entry <T> {
    
    private int key;
    private T value;
    public Entry next;

    public Entry(){
        next = null;
    }

    public Entry(int key, T value){
        this.key=key;
        this.value=value;
        next=null;
    }

    public int getKey(){
        return key;
    }
    
    public T getValue(){
        return value;
    }

}
