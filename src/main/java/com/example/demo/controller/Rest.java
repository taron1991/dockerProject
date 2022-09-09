package com.example.demo.controller;


import com.example.demo.dto.Car;
import com.example.demo.repo.Db;
import com.example.demo.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Rest {

    private ServiceClass serviceClass;

    @Autowired
    public Rest(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/getCar/{id}")
    public Car get(@PathVariable("id") int id){
        return serviceClass.findById(id);
    }

    @GetMapping("/hello")
    public String get(){
        return "hello";
    }
}
