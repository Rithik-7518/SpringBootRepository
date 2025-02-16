package com.rithik.SpringSecurity.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	@JsonProperty("id")
    private int id;
	@JsonProperty("name")
    private String name;
	@JsonProperty("marks")
    private int marks;


    public Student(int id, String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "StudentController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
