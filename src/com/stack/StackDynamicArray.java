package com.stack;
import com.dynamicArray.DynamicArray;

public class StackDynamicArray <T> {
    
    private DynamicArray<T> da = new DynamicArray<>();

    public void push(T value){
        da.insert(value);
    }

    public Object pop(){
        return  da.delete(da.getCounter()-1);
    }

    public void print(){
        da.print();
    }

    public boolean isEmpty(){
        return da.getCounter() == 0;
    }

    public int getStackCapacity(){
        return da.getCounter();
    }

    public Object top(){
        if(isEmpty()){
            return null;
        }
        return da.lastElement();
    }

}
