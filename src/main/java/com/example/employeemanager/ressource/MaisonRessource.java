package com.example.employeemanager.ressource;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.employeemanager.model.Maison;
import com.example.employeemanager.service.MaisonService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maison")
public class MaisonRessource {

    private MaisonService maisonService;

    public MaisonRessource(MaisonService maison){
        this.maisonService = maison;
    }

@GetMapping("/All")
public ResponseEntity  <List<Maison>> getAll(){
    List <Maison> maison = maisonService.getAll();
    return new ResponseEntity<>(maison, HttpStatus.OK);
}

@DeleteMapping("delete/{id}")
    public void deleteMaison(@PathParam("id") Long id){
        maisonService.deleteMaison(id);
    }

    @GetMapping("find/{id}")
    public ResponseEntity <Maison> findMaison(@PathParam("id") Long id){
        Maison maisons=maisonService.findMaisonById(id);
        return new ResponseEntity<>(maisons,HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Maison>addMaison(@RequestBody() Maison maison){
        Maison maisons=maisonService.addMaison(maison);
        return new ResponseEntity<>(maisons,HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<Maison>updateMaison(@RequestBody() Maison maison){
        Maison maisons=maisonService.Updatemaison(maison);
        return new ResponseEntity<>(maisons,HttpStatus.OK);
    }

    
}
