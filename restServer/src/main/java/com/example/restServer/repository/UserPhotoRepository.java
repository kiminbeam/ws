package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.UserPhoto;

public interface UserPhotoRepository extends JpaRepository<UserPhoto, Long>{

}
