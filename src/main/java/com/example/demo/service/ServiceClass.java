package com.example.demo.service;

import com.example.demo.dto.Car;
import com.example.demo.repo.Db;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceClass {

    private Db db;

    @Autowired
    public ServiceClass(Db db) {
        this.db = db;
    }

    public Optional<Car> findById(int id){
        return db.findById(id);
    }
}
