package com.example.employeemanager.service;

import java.util.List;

import com.example.employeemanager.exception.MotoNotFoundException;
import com.example.employeemanager.model.Maison;
import com.example.employeemanager.repository.MaisonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaisonService {

    private final MaisonRepository maisonRepository;

    @Autowired
    public MaisonService ( MaisonRepository maisonRepository){
        this.maisonRepository= maisonRepository;
    }

    public List<Maison> getAll(){
        return maisonRepository.findAll();
    }

    public void deleteMaison (Long id){
        maisonRepository.deleteById(id);
    }

    public Maison addMaison (Maison maison){
        return maisonRepository.save(maison);
    }

    public Maison Updatemaison (Maison maison){
        return maisonRepository.save(maison);
    }

    public Maison findMaisonById(Long id){
        return maisonRepository.findMaisonById(id).orElseThrow(()->new MotoNotFoundException("Manque de maisons à louer pour le moment "));
    }

}
