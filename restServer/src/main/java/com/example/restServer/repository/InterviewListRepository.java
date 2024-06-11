package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.InterviewList;

public interface InterviewListRepository extends JpaRepository<InterviewList, Long>{

}
