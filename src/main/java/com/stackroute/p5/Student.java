package com.stackroute.p5;

public class Student {

    //instance variables
    private int id;
    private String name;
    private int age;

    //Student constructor
    public Student(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;

    }

    //getter setter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
