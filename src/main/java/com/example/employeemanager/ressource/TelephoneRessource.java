package com.example.employeemanager.ressource;

import java.util.List;

import com.example.employeemanager.model.Telephone;
import com.example.employeemanager.service.TelephoneService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telephone")
public class TelephoneRessource {
    
    private final TelephoneService telephoneService;

    public TelephoneRessource ( TelephoneService telephoneService){
        this.telephoneService = telephoneService;
    }

    @GetMapping("/All")
    public ResponseEntity<List<Telephone>> getAllTelephone(){
        List <Telephone> telephone=telephoneService.findAllTelephones();
        return new ResponseEntity<>(telephone,HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Telephone>getEmployeeById(@PathVariable("id") Long id){
        Telephone telephone=telephoneService.findTelephoneById(id);
        return new ResponseEntity<>(telephone,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Telephone> addTelephone(@RequestBody Telephone telephone){
        Telephone newTelephone=telephoneService.addTelephone(telephone);
        return new ResponseEntity<>(newTelephone,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity <Telephone> updateTelephone(@RequestBody Telephone telephone){
        Telephone newTelephone=telephoneService.updaTelephone(telephone);
        return new ResponseEntity<>(newTelephone,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> addTelephone(@PathVariable("id") Long id){
        telephoneService.deleteTelephone(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    }

    

