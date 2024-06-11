package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.School;

public interface SchoolRespository extends JpaRepository<School, Long>{

}
