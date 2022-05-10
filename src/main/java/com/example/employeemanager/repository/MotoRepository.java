package com.example.employeemanager.repository;

import java.util.Optional;

import com.example.employeemanager.model.Moto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository <Moto,Long>{
    
  
    Optional <Moto> findMotoById(Long id);
}
