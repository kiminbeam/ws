package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.Career;

public interface CareerRepository extends JpaRepository<Career, Long>{

}
