package com.example.demo.controller;


import com.example.demo.dto.Car;
import com.example.demo.repo.Db;
import com.example.demo.service.ServiceClass;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@AllArgsConstructor
@RequestMapping("/rest")
public class Rest {

    private final ServiceClass serviceClass;


    @GetMapping("/getCar/{id}")
    public Optional<Car> getCar(@PathVariable("id") int id){
        log.info("in the get method");
        return serviceClass.findById(id);
    }

    @GetMapping("/hello")
    public String hello(){
        log.info("in the hello method");
        return "hello";
    }
}
