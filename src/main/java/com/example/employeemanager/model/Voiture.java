package com.example.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private  String id;
    private String marque;
    private String couleur;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public Voiture() {
    }
    public Voiture(String id, String marque, String couleur) {
        this.id = id;
        this.marque = marque;
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Voiture [couleur=" + couleur + ", id=" + id + ", marque=" + marque + "]";
    }
    
}
