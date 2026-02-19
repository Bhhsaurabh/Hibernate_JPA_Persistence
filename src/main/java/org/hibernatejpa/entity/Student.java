package org.hibernatejpa.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private  int id;
    @Column(nullable = false , length = 225)
    private  String name;
    @Column(nullable = false )
    private int age;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
