package com.queue;

public class CircularQueue<T> {

    private Object[] arr;
    private int size, rear, front;

    public CircularQueue(int size) {
        this.size = size;
        rear = front = -1;
        arr = new Object[size];
    }

    public boolean isFull() {
        return (rear == 0 && front == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return (front == -1) || (rear == -1 && front == 0);
    }

    public void enQueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = -1;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (rear == front) {
            rear = -1;
            front = -1;
        }
        //Object element = arr[front];
        front = (front + 1) % size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        if (front > rear) {
            System.out.print("[");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i]);
                if (i < rear || rear == 0) {
                    System.out.print(",");
                }
            }
            for (int i = rear + 1; i < size; i++) {
                System.out.print(arr[i]);
                if (i < size - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
            return;
        }
        if (rear >= front) {
            System.out.print("[");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
                if (i < rear) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }

    }
}
