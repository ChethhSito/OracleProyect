package com.stech.repository;
import com.stech.model.clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  clientRepository extends  JpaRepository<clients, Long>{
    
}
