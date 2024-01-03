package com.Search;

public class Main {
    

    public static void main(String[] args) {

        Integer size = 1000000;
        Integer[] arr = new Integer[size];
        for(int i=0; i<size; i++){
            arr[i] = i+1;
        }
        LinearSearch <Integer> ls = new LinearSearch<Integer>(arr, 1000000);
        System.out.println(ls.Search());
        System.out.println("---------------------------------------");

        int [] arr1 = {1,2,3,4,5};
        BinarySearch <Integer> b = new BinarySearch(arr1, 5);
        System.out.println(b.Search());
        System.out.println(b.recursionSerarch(0, arr1.length-1));
    
        System.out.println("---------------------------------------");

        InterpolationSearch r = new InterpolationSearch(arr1, 4);
        System.err.println(r.Search());

    }

}
