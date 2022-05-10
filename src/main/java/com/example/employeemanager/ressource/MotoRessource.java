package com.example.employeemanager.ressource;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.employeemanager.model.Moto;
import com.example.employeemanager.service.MotoService;

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
@RequestMapping("/moto")
public class MotoRessource {

    private final MotoService motoService;


    public  MotoRessource (MotoService moto){
        this.motoService =moto;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Moto> > findAll(){
        List <Moto> motos=motoService.getAll() ;
        return new ResponseEntity<>(motos,HttpStatus.OK);
    }


    @GetMapping("find/{id}")
    public ResponseEntity <Moto> findMoto(@PathParam("id") Long id){
        Moto moto=motoService.findMotoById(id);
        return new ResponseEntity<>(moto,HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Moto>addMoto(@RequestBody() Moto moto){
        Moto motos=motoService.addMoto(moto);
        return new ResponseEntity<>(motos,HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<Moto>updateMoto(@RequestBody() Moto moto){
        Moto motos=motoService.updateMoto(moto);
        return new ResponseEntity<>(motos,HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public void deleteMoto(@PathParam("id") Long id){
        motoService.deleteMoto(id);
    }
}
