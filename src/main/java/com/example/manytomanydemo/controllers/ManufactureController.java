package com.example.manytomanydemo.controllers;

import com.example.manytomanydemo.models.entities.Job;
import com.example.manytomanydemo.models.entities.Worker;
import com.example.manytomanydemo.models.tables.TableJobs;
import com.example.manytomanydemo.models.tables.TableWorkers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/manufacture", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ManufactureController {

    @Autowired
    private final TableJobs tableJobs;

    @Autowired
    private final TableWorkers tableWorkers;

    public ManufactureController(TableJobs tableJobs, TableWorkers tableWorkers) {
        this.tableJobs = tableJobs;
        this.tableWorkers = tableWorkers;
    }

    @GetMapping(value = "/getAllJobs")
    public List<Job> getAllJobs() throws Exception {
        return tableJobs.findAll();
    }

    @GetMapping(value = "/getAllWorkers")
    public List<Worker> getAllWorkers() throws Exception {
        return tableWorkers.findAll();
    }
}
