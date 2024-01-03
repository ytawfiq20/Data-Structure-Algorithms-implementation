package com.dynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<String> d1 = new DynamicArray<>();

        d1.insert("Manar");
        d1.insertAt(1, "Yousef");
        d1.print();
    }
    
}
