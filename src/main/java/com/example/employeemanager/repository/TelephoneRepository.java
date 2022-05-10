package com.example.employeemanager.repository;

import java.util.Optional;

import com.example.employeemanager.model.Telephone;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TelephoneRepository extends JpaRepository <Telephone, Long> {

    void deleteTelephoneById (Long id);
    Optional <Telephone> findTelephoneById(Long id);
    
}
