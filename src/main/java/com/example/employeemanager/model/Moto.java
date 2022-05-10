package com.example.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;

    private String Marque;
    private String Couleur;
    private Integer Place;
    public Moto() {
    }
    public Moto(Long id, String marque, String couleur, Integer place) {
        this.id = id;
        Marque = marque;
        Couleur = couleur;
        Place = place;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarque() {
        return Marque;
    }
    public void setMarque(String marque) {
        Marque = marque;
    }
    public String getCouleur() {
        return Couleur;
    }
    public void setCouleur(String couleur) {
        Couleur = couleur;
    }
    public Integer getPlace() {
        return Place;
    }
    public void setPlace(Integer place) {
        Place = place;
    }
    @Override
    public String toString() {
        return "Moto [Couleur=" + Couleur + ", Marque=" + Marque + ", Place=" + Place + ", id=" + id + "]";
    }

    

}
