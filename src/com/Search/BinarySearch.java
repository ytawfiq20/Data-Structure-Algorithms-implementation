package com.Search;

public class BinarySearch <T> {

    private int[] arr;
    private int target;

    public BinarySearch(int[] arr, int target) {
        this.target = target;
        this.arr = arr;
    }

    public boolean Search() {
        int r, l, mid;
        r = arr.length - 1;
        l = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (this.arr[mid] == target) {
                return true;
            }
            if (this.arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public boolean recursionSerarch(int l, int r) {
        int mid = l + (r - l) / 2;
        if (l <= r) {
            if (arr[mid] == target) {
                return true;
            }
            if(arr[mid]>target){
                return recursionSerarch(l, mid-1);
            }
            return recursionSerarch(mid+1, r);
        }
        return false;
    }

}
