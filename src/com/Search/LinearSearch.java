package com.Search;

public class LinearSearch <T> {
    

    private T[] arr;
    private T target;
    public LinearSearch(T[]arr, T target){
        this.target = target;
        this.arr = arr;
    }

    public boolean Search(){
        for(int i=0; i<this.arr.length; i++){
            if(arr[i].equals(target)){
                return true;
            }
        }
        return false;
        
    }
    

}
