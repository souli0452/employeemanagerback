package com.example.employeemanager.service;

import java.util.List;

import com.example.employeemanager.exception.TelephoneNotFoundException;
import com.example.employeemanager.model.Telephone;
import com.example.employeemanager.repository.TelephoneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelephoneService {

    private final TelephoneRepository telephoneRepository;
    
    @Autowired
    public TelephoneService (TelephoneRepository telephoneRepository){
        this.telephoneRepository = telephoneRepository;
    }

   /*  public List<Telephone> getAll(){
        return telephoneRepository.findAll();
    }
 */
    public void deleteTelephone (Long id){
        telephoneRepository.deleteById(id);
    }

    public Telephone addTelephone (Telephone telephone){
        return telephoneRepository.save(telephone);
    }

    public Telephone updaTelephone (Telephone telephone){
        return telephoneRepository.save(telephone);
    }

    public Telephone findTelephoneById(Long id){
        return telephoneRepository.findTelephoneById(id).orElseThrow(() -> new TelephoneNotFoundException("pas de téléphons...!!!"));
    }

    public List<Telephone> findAllTelephones() {
         return telephoneRepository.findAll();
    }
   
}
