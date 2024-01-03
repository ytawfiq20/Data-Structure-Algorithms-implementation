package com.dynamicArray;

public class DynamicArray <T> {
    
    private int size;
    private int counter;
    private Object [] arr;
/*
 * 
 * Initialize array and size
 * 
 */
    public DynamicArray(){
        size = 1;
        counter = 0;
        arr = new Object [size];
    }
/*
 * 
 * Setters and getters
 * 
 */
    public void setSize(int size) {
        this.size = size;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public Object[] getArr() {
        return arr;
    }
    public void setArr(Object[] arr) {
        this.arr = arr;
    }
    /*
 * 
 * Insert element to dynamic array
 * 
 */
    public void insert(Object element){
        // check if there is space in array or not
        if(counter<size){
            arr[counter] = element;
            counter++;
        }
        else {
            // copy elements from array1 to double size array
            size = size*2;
            Object[] newArray = new Object[size];
            for(int j=0; j<counter; j++){
                newArray[j] = arr[j];
            }
            arr = newArray;
            arr[counter] = element;
            counter++;
        }
    }
/*
 * 
 * get array capacity
 * 
 */
    public int getCapacity(){
        return size;
    }
/*
 * 
 * get number of elements in array
 * 
 */
    public int getNumberOfElements(){
        return counter;
    }

/*
 * 
 * Print dynamic array
 * 
 */
    public void print(){
        System.out.print("[");
        for(int j=0; j<counter; j++){
            System.out.print(arr[j]);
            if(j<(counter-1)){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
/*
 * 
 * delete element from dynamic array
 * 
 */
    public Object delete(int index){
        Object element = arr[index];
        if(index>=counter){
            System.out.println("Index out of pounds");
            return -1;
        }
        else if(index==counter-1){
            counter = index;
            return element;
        }
        else if(index == 0 && counter == 1){
            counter = 0;
            return element;
        }
        for(int j=index; j<counter; j++){
            arr[j] = arr[j+1];
        }
        counter--;
        return element;
    }
/*
 * 
 * get element from specefic index
 * 
 */
    public Object getElementAt(int index){
        if(index>=counter){
            System.out.println("Index out of pounds");
            return -1;
        }
        return arr[index];
    }
/*
 * 
 * check dynamic array is empty or not
 * 
 */
    public boolean isEmpty(){
        return counter == 0;
    }
/*
 * 
 * delete all elements from array
 * 
 */
    public void deleteAll(){
        counter = 0;
        size = 1;
        arr = new Object[size];
    }
/*
 * 
 * Insert element at specefic position
 * 
 */
    public void insertAt(int position, Object element){
        if(counter>=size){
            size *= 2;
        }
        Object[] newArray = new Object[size];
        for(int j=0; j<size; j++){
            if(j==position-1){
                newArray[j] = element;
            }
            else if(j<position-1){
                newArray[j] = arr[j];
            }
            else{
                newArray[j] = arr[j-1];
            }
        }
        arr = newArray;
        counter++;
    }
/*
 * 
 * get array size
 * 
 */
    public int getSize(){
        return counter-1;
    }

/*
 * 
 * get last element of array
 * 
 */
    public Object lastElement(){
        return arr[counter-1];
    }
}
