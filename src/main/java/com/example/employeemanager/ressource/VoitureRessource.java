package com.example.employeemanager.ressource;

import java.util.List;

import com.example.employeemanager.model.Voiture;
import com.example.employeemanager.service.VoitureService;

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

@RequestMapping("/voiture")
public class VoitureRessource {
    private VoitureService voitureService;
    public VoitureRessource (VoitureService voitureService){
        this.voitureService = voitureService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Voiture>> getAllVoiture(){
        List<Voiture> voitures=voitureService.findAllVoitures();
        return new ResponseEntity<>(voitures, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Voiture>getVoitureById(@PathVariable("id")String id){
        Voiture voiture=voitureService.findeVoitureById(id);
        return new ResponseEntity<>(voiture, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Voiture> addTelephone(@RequestBody Voiture voiture){
        Voiture newVoiture=voitureService.addVoiture(voiture);
        return new ResponseEntity<>(newVoiture,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity <Voiture> updateVoiture(@RequestBody Voiture voiture){
        Voiture newVoiture=voitureService.updateVoiture(voiture);
        return new ResponseEntity<>(newVoiture,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> addVoiture(@PathVariable("id") String id){
        voitureService.deleteVoiture(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
