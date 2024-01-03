package com.fixedArray;

public class Student {
    

    private int age;
    private String name;
    private int id;

    // constructors

    public Student(){}
    public Student(String name, int id, int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    // setters
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }
    // getters
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    // print details

    public void printDetails(){
        System.out.println("Name is: "+name);
        System.out.println("ID is: "+id);
        System.out.println("Age is: "+age);
    }


}
