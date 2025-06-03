package com.stech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stech.model.directions;

public interface  directionRepository extends  JpaRepository<directions, Long>{
    
}

