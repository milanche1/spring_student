package com.example.demo.model;

import java.time.LocalDate;

public class Student {
    private long Id;
    private String name;
    private String email;
    private int age;
    private LocalDate dob;

    public Student() {
    }

    public Student(String name, String email, int age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Student(long id, String name, String email, int age, LocalDate dob) {
        Id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
