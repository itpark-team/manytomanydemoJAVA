package com.example.manytomanydemo.models.tables;

import com.example.manytomanydemo.models.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableWorkers extends JpaRepository<Worker, Integer> {
}
