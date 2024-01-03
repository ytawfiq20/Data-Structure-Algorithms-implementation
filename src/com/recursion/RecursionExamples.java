package com.recursion;

public class RecursionExamples {
    

    public RecursionExamples(){}

    public double factorial(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public double add(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        return n + add(n-1);
    }

    /*
     * 
     * Recursion uses stack to backtrack code
     * 
     */

}
