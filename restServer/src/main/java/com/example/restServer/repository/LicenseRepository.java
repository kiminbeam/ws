package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.License;

public interface LicenseRepository extends JpaRepository<License, Long>{

}
