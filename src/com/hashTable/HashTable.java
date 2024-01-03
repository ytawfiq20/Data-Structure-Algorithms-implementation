package com.hashTable;

public class HashTable <T> {
    
    Entry <T> [] arrayHash;
    int size;

    public HashTable(int size){
        this.size = size;
        arrayHash = new Entry[size];

        for(int i=0; i<this.size; i++){
            arrayHash[i] = new Entry<T> ();
        }
    }

    public int getHash(int key){
        return key%size;
    }

    public void add(int key, T value){
        int index = getHash(key);
        Entry <T> arrayValue = arrayHash[index];
        Entry <T> newItem = new Entry<T>(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key){
        int index = getHash(key);
        Entry<T> arrayItem = arrayHash[index];
        T value = null;
        while(arrayItem!=null){
            if(arrayItem.getKey() == key){
                value = arrayItem.getValue();
                break;
            }
            arrayItem = arrayItem.next;
        }
        return value;
    }

    public void print(){
        for(int i=0; i<this.size; i++){
            if(arrayHash[i].next!=null){
                Entry<T> arrayValue = arrayHash[i].next;
                while(arrayValue!=null){
                    System.out.print(arrayValue.getValue());
                    if(arrayValue.next!=null){
                        System.out.print("->");
                    }
                    arrayValue = arrayValue.next;
                }
                System.out.println();
            }
        }
    }

    public void deleteItem(int key){
        int index = getHash(key);
        Entry<T> root = arrayHash[index];
        T item = get(key);
        while(root.next.getValue()!= item){
            root = root.next;
        }
        root.next = root.next.next;
    }


}
