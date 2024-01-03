package com.sort;

public class Main {

    public static void main(String[] args) {

        int[] arr = { 5, 8, 94, 2, 1, 0, 4, 7, 6 };
        beforeSort(arr);
        Sort s = new Sort(arr);
        s.heapSort();
        s.print();
    }

    public static void beforeSort(int[] arr) {
        System.out.print("Before sorting: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
