package com.Graphs.BFS;

public class BFSdemo {
    public static void main(String[] args) {
        BFS b = new BFS(6);
        b.add(1, 2);
        b.add(1, 3);
        b.add(2, 1);
        b.add(3, 1);
        b.add(2, 4);
        b.add(4, 2);
        b.add(3, 5);
        b.add(5, 3);
        b.BFSexplore(5);
        b.search(5, 5);
    }
}
