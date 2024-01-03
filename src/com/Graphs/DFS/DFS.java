package com.Graphs.DFS;

import java.util.Arrays;
import java.util.Stack;

// Depth first search

public class DFS {
    
    int size;
    adjList[] array;
    public DFS(int size){
        this.size = size;
        array = new adjList[this.size];
        for(int i=0; i<size; i++){
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void add(int src, int dest){
        Node newNode = new Node(dest, null);
        newNode.next = array[src].head;
        array[src].head = newNode;
    }

    public void DFSexplore(int startVertex){
            boolean[] visited = new boolean[size];
            Arrays.fill(visited, false);
            Stack <Integer> st = new Stack<>();
            st.push(startVertex);
            while(!st.isEmpty()){
                int n = st.pop();
                st.push(n);
                visited[n] = true;
                Node head = array[n].head;
                boolean visitedDone = true;
                while(head!=null){
                    if(visited[head.dest]==false){
                        st.push(head.dest);
                        visited[head.dest] = true;
                        visitedDone = false;
                        break;
                    }
                    else{
                        head = head.next;
                    }
                }
                if(visitedDone==true){
                    int out = st.pop();
                    System.out.println("Visited: "+out);
                }
            }
        }
        public void search(int startVertex, int value){
            boolean[] visited = new boolean[size];
            boolean found = false;
            Arrays.fill(visited, false);
            Stack<Integer> s = new Stack<>();
            s.push(startVertex);
            while(!s.isEmpty()){
                int n = s.pop();
                s.push(n);
                visited[n] = true;
                if(n==value){
                    System.out.println("Element found");
                    found= true;
                    break;
                }
                Node head = array[n].head;
                boolean visitedDone= true;
                while(head!=null){
                    if(visited[head.dest]==false){
                        visitedDone = false;
                        s.push(head.dest);
                        visited[head.dest] = true;
                        break;
                    }
                    else{
                        head = head.next;
                    }
                }
                if(visitedDone == true){
                    int n1 = s.pop();
                    if(n1==value){
                        System.out.println("Element found");
                        found= true;
                        break;
                    }
                }
            }
            if(found==false){
                System.out.println("Element not found");
            }
        }
}
