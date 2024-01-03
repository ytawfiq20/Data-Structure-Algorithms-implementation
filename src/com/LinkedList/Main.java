package com.LinkedList;

public class Main {
    
    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>();
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.Length());

    }

}
