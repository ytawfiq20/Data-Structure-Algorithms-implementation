package com.Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
    adjList[] arr;
    int size;

    public BFS(int size){
        this.size = size;
        arr = new adjList[this.size];
        for(int i=0; i<size; i++){
            arr[i] = new adjList();
            arr[i].head = null;
        }
    }

    public void add(int src, int dest){
        Node newNode = new Node(dest, null);
        newNode.next = arr[src].head;
        arr[src].head = newNode;
    }

    public void BFSexplore(int startVertex){
        boolean[]visited = new boolean[size];
        for(int i=0; i<size; i++){
            visited[i] = false;
        }
        Queue <Integer> q = new LinkedList<>();
        q.add(startVertex);
        while(!q.isEmpty()){
            int n = q.poll();
            System.out.println("Visited: "+ n);
            visited[n] = true;
            Node head = arr[n].head;
            while(head!=null){
                if(visited[head.value]==false){
                    q.add(head.value);
                    visited[head.value] = true;
                }
                else{
                    head = head.next;
                }
            }
        }
    }

    public void search(int startVertex, int value){
        boolean []visited = new boolean[size];
        boolean found = false;
        for(int i=0; i<size; i++){
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        while(!q.isEmpty()){
            int n = q.poll();
            visited[n] = true;
            if(n == value){
                System.out.println("Element found");
                found =true;
                break;
            }
            Node head = arr[n].head;
            while(head!=null){
                if(visited[head.value]==false){
                    q.add(head.value);
                    visited[head.value] = true;
                }
                else{
                    head = head.next;
                }
            }
        }
        if(found==false){
            System.out.println("Element not found");
        }
    }


}
