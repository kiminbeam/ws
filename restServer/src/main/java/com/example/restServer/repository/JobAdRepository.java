package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.JobAd;

public interface JobAdRepository extends JpaRepository<JobAd, Long>{

}
