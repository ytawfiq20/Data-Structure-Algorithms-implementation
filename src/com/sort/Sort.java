package com.sort;

public class Sort {
    

    private int[] arr;
    private int[] tempArray;
    public Sort(int[] arr){
        this.arr = arr;
    }
/*
 * 
 * Bubble sort method
 * 
 */
    public void bubbleSort(){
        int[] arr1 = arr;
        for(int i=0; i<arr1.length; i++){
            for(int j=1; j<arr1.length-i; j++){
                if(arr1[j-1]>arr1[j]){
                    swap(arr1, j-1, j);
                }
            }
        }
    }
/*
 * 
 * print array method
 * 
 */
    public void print(){
        System.out.print("After sorting: [");
        for(int i=0; i<this.arr.length; i++){
            System.out.print(this.arr[i]);
            if(i<this.arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
/*
 * 
 * swap method
 * 
 */
    public void swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
/*
 * 
 * selection sort
 * 
 */
    public void selectionSort(){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
/*
 * 
 * merge sort
 * 
 */
    public void MergeSort(int[]arr){
        this.arr = arr;
        tempArray = new int[arr.length];
        doMergeSort(0, arr.length-1);
    }
    private void doMergeSort(int lowIndex, int heighIndex){
        int mid = lowIndex + (heighIndex-lowIndex)/2;
        if(lowIndex<heighIndex){
            doMergeSort(lowIndex, mid);
            doMergeSort(mid+1, heighIndex);
            merge(lowIndex, mid, heighIndex);
        }
    }
    private void merge(int lowIndex, int mid, int heighIndex){
        for(int i=0; i<arr.length; i++){
            tempArray[i] = arr[i];
        }
        int i, j, k;
        i = k = lowIndex;
        j = mid+1;
        
        while(i<=mid && j<=heighIndex){
            if(tempArray[i]<tempArray[j]){
                arr[k] = tempArray[i];
                i++;
            }
            else{
                arr[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = tempArray[i];
            i++;
            k++;
        }
    }
/*
 * 
 * 
 */ 

/*
 * 
 * quick sort
 * 
 */
    public void quickSort(int low, int heigh){

        int mid = low + (heigh-low)/2;
        int pevit = arr[mid];
        int i = low;
        int j = heigh;
        while(i<=j){
            while(arr[i]<pevit){
                i++;
            }
            while(arr[j]>pevit){
                j--;
            }
            if(i<=j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(low, j);
        }
        if(heigh>i){
            quickSort(i, heigh);
        }
        
    }
/*
 * 
 * heap sort
 * 
 */
    private void heapify(int[]arr, int N, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<N && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<N && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=i){
            swap(arr, largest, i);
            heapify(arr, N, largest);
        }
    }

    public void heapSort(){
        int N = arr.length;
        for(int i=N/2-1; i>=0; i--){
            heapify(arr, N, i);
        }
        for(int i=N-1; i>0; i--){
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
}
/*
 * 
 * 
 */
