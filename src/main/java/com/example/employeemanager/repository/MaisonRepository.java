package com.example.employeemanager.repository;

import java.util.Optional;

import com.example.employeemanager.model.Maison;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MaisonRepository extends JpaRepository <Maison, Long> {

    void deleteMaisonById(Long id);
        Optional<Maison> findMaisonById(Long id);

    
}
