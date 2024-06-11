package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.CompanyReview;

public interface CompanyReviewRepository extends JpaRepository<CompanyReview, Long>{

}
