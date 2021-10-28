package com.example.manytomanydemo.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public int salary;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "jobs_workers",
            joinColumns = { @JoinColumn(name = "job_id") },
            inverseJoinColumns = { @JoinColumn(name = "worker_id") }
    )
    @JsonBackReference
    public Set<Worker> workers;

    public Job() {
    }
}
