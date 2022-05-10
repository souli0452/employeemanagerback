package com.example.employeemanager.service;

import java.util.List;


import com.example.employeemanager.exception.MotoNotFoundException;
import com.example.employeemanager.model.Moto;
import com.example.employeemanager.repository.MotoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoService {
    
    private MotoRepository motoRepository;
    
    @Autowired
    public  MotoService(MotoRepository motoRepository){
        this.motoRepository=motoRepository;
    }


    public List<Moto> getAll(){
        return motoRepository.findAll();
    }

    public Moto addMoto(Moto moto){
        return motoRepository.save(moto);
    }

    public Moto findMotoById(Long id){
        return motoRepository.findMotoById(id).orElseThrow(()->new MotoNotFoundException("Pas de moto"));
    }


    public void deleteMoto(Long id){
        motoRepository.deleteById(id);
    }


    public Moto updateMoto(Moto moto){
        return motoRepository.save(moto);
    }
}
