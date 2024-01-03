package com.Set;

public class SetDemo {
    
    public static void main(String[] args) {
        Set <String> s = new Set<>();
        s.add("null");
        s.add("Manar");
        s.add("yousef");
        s.add("Yousef");
        s.add("manar");
        s.print();
        System.out.println(s.getSetSize());
    }

}
