package com.Set;

public class Set <T> {
    

    private Object[] arr;
    private int size;
    private int counter;

    public Set(){
        size = 1;
        counter = 0;
        arr = new Object[size];
    }
/*
 * 
 * get index of value to insert it sorted in set
 * 
 */
    public int getIndex (T value){
        String ele = value.toString();
        String arrEle = null;
        if(counter==0){
            return 0;
        }
        arrEle = arr[counter-1].toString();
        if(ele.compareTo(arrEle)>0){
            return counter;
        }
        
            for(int i=0; i<counter; i++){
                arrEle = arr[i].toString();
                if(ele.compareTo(arrEle)<0){
                    return i;
                }
        }
        return -1;
    }
/*
 * 
 * check if element founded in set or not, so we don't repeat elements
 * 
 */
    public boolean contains(T value){
        for(int i=0; i<counter; i++){
            if(arr[i].equals(value)){
                return true;
            }
        }
        return false;
    }
/*
 * 
 * insert elements to set
 * 
 */
    public void add(T value){
        int index = getIndex(value);
        if(counter == 0){
            arr[counter] = value;
            counter++;
            return;
        }
        if(counter == size){
            size = size*2;
            Object [] arr2 = new Object[size];
            for(int i=0; i<counter; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        if(contains(value)){
            return;
        }
        if(index == counter){
            arr[counter] = value;
            counter++;
            return;
        }
        for(int i=counter; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        counter++;
    }
/*
 * 
 * print set
 * 
 */
    public void print(){
        System.out.print("[");
        for(int i=0; i<counter; i++){
            System.out.print(arr[i]);
            if(i<counter-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
/*
 * 
 * get set size
 * 
 */
    public int getSetCapacity(){
        return size;
    }
/*
 * 
 * get set counter
 * 
 */
    public int getSetSize(){
        return counter;
    }
/*
 * 
 * clear set
 * 
 */
    public void clear(){
        counter = 0;
        size = 1;
        arr = new Object[size];
    }
}
