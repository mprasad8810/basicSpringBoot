package com.springboot.application.basicSpringBoot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private int id;
//    @Column(name = "Course_Name")
    private String name;
//    @Column(name = "Author_Name")
    private String author;

    public Course(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
