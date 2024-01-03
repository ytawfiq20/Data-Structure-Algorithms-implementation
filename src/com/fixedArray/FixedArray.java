package com.fixedArray;

import java.util.Scanner;

public class FixedArray {


    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = in.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        System.out.println("-----------------------");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------");
        in.close();

        Student s1 = new Student("Yousef", 100, 20);
        s1.printDetails();
        System.out.println("-----------------------");
        
        Student[]s2 = new Student[2];
        s2[0] = new Student("null", 100, 19);
        s2[0].printDetails();
        System.out.println("-----------------------");

        s2[1] = new Student();
        s2[1].setAge(15);
        s2[1].setID(101);
        s2[1].setName("Manar");
        s2[1].printDetails();


    }



    
}