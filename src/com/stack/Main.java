package com.stack;

public class Main {

    public static void main(String[] args) {
        StackLinkedList<Integer> st = new StackLinkedList<>();
        st.push(15);
        st.push(20);
        st.push(1);
        System.out.println(st.top());
        st.print();
        System.out.println("-----------------");
        StackDynamicArray<String> st1 = new StackDynamicArray<>();
        st1.push("Manar");
        st1.push("Yousef");
        st1.pop();
        System.out.println(st1.pop());
        st1.print();
        System.out.println("-----------------");
        StackFixedArray<Integer> st2 = new StackFixedArray<>(5);
        st2.push(1);
        st2.push(2);
        st2.print();
        st2.pop();
        st2.print();
        System.out.println(st2.pop());
        st2.print();
        
    }
}
