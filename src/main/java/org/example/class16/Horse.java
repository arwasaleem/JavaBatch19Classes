package org.example.class16;

public class Horse {
    private String name;
    private String color;
    private  int age;


    public Horse(String name,String color){
        this.name=name; // "this" keyword always refers to the instance variable
        this.color=color;

    }
    public Horse(String name,String color,int age){
        this(name,color); // calling a constructor inside another constructor
        this.age=age;
    }
}
