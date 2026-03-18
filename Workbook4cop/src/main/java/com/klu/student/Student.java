package com.klu.student;

public class Student {

    private long studentId;
    private String name;
    private String course;
    private int year;

    public Student(long studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }
}