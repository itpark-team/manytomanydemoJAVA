package com.example.manytomanydemo.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "workers")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public int age;

    @ManyToMany(mappedBy = "workers")

    public Set<Job> jobs;

    public Worker() {
    }
}