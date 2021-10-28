package com.example.manytomanydemo.models.tables;

import com.example.manytomanydemo.models.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableJobs extends JpaRepository<Job, Integer> {
}
