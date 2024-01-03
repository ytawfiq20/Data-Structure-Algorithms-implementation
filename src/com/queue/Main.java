package com.queue;

public class Main {
    public static void main(String[] args) {

        /*
         * Circular queue
         */
        CircularQueue<Integer> q = new CircularQueue<>(5);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.print();
        System.out.println("----------------------------------");
        /*
         * Linked list queue
         */
        QueueLinkedList<Integer> q1 = new QueueLinkedList<>();
        q1.enQueue(15);
        q1.enQueue(20);
        q1.enQueue(80);
        q1.enQueue(70);
        q1.print();
        q1.deQueue();
        q1.print();
        System.out.println("----------------------------------");
        /*
         * Dynamic array queue
         */
        QueueDynamicArray<Integer> q2 = new QueueDynamicArray<>();
        q2.enQueue(5);
        q2.enQueue(6);
        q2.enQueue(7);
        q2.enQueue(8);
        q2.enQueue(9);
        q2.enQueue(10);
        q2.print();
        q2.deQueue();
        q2.deQueue();
        q2.deQueue();
        q2.deQueue();
        q2.print();
    }
}
