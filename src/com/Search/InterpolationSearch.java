package com.Search;

public class InterpolationSearch {
    
    private int[] arr;
    private int target;

    public InterpolationSearch(int[] arr, int target){
        this.target = target;
        this.arr = arr;
    }

    public boolean Search(){
        int l, r, mid;
        l = 0; 
        r = arr.length - 1;
        int counter = 1;
        while(l<=r){
            mid = l + ((r-l)/(arr[r]-arr[l]))*(target - arr[l]);
            if(arr[mid] == target){
                System.err.println("Found after: "+counter+" times");
                return true;
            }
            else if(target > arr[mid]){
                l = r + 1;
                counter++;
            }
            else{
                r = l - 1;
                counter++;
            }
        } 
        System.out.println("We try: "+counter+" times but not found");
        return false;
    }


}
