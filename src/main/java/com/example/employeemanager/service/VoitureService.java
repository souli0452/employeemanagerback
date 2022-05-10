package com.example.employeemanager.service;

import java.util.List;

import com.example.employeemanager.exception.VoitureNotFondException;
import com.example.employeemanager.model.Voiture;
import com.example.employeemanager.repository.VoitureRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;

    @Autowired
    public VoitureService (VoitureRepository voitureRepository){
        this.voitureRepository = voitureRepository;
    }

    public Voiture addVoiture (Voiture voiture){
        return voitureRepository.save(voiture);
    }

    public List <Voiture> findAllVoitures(){
        return voitureRepository.findAll();
    }

    public void deleteVoiture (String id){
        voitureRepository.deleteById(id);
    }

    public Voiture updateVoiture (Voiture voiture){
        return voitureRepository.save(voiture);
    }

    public Voiture findeVoitureById(String id){
        return  voitureRepository.findVoitureById(id).orElseThrow(() -> new VoitureNotFondException("pas de voiture"));

    }
    
}
