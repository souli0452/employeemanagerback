package com.example.employeemanager.repository;

import java.util.Optional;

import com.example.employeemanager.model.Voiture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository <Voiture, String > {
    
    void deleteTelephoneById (String id);
    Optional <Voiture> findVoitureById(String id);
}
