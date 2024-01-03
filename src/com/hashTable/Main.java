package com.hashTable;

public class Main {
    
    public static void main(String[] args) {
        HashTable<Integer> h = new HashTable<>(5);
        h.add(15, 1);
        h.add(5, 2);
        h.add(4, 3);
        h.add(8, 4);
        h.add(7, 5);
        h.add(9, 6);
        h.add(3, 7);
        h.add(2, 8);
        h.add(71, 9);
        h.add(77, 10);
        h.add(10, 11);
        h.add(1, 12);
        h.add(98, 13);
        h.add(89, 14);
        h.add(101, 15);
        h.add(51, 16);
        h.add(0, 80);
        h.print();
    }

}
