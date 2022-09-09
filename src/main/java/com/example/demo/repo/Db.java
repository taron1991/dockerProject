package com.example.demo.repo;

import com.example.demo.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories("com.example.demo")
@Repository
public interface Db extends JpaRepository<Car,Integer> {

}
