package com.example.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Maison {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String quartier;
    private String parcelle;
    private String type;
    public Maison() {
    }
    public Maison(Long id, String quartier, String parcelle, String type) {
        this.id = id;
        this.quartier = quartier;
        this.parcelle = parcelle;
        this.type = type;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public String getParcelle() {
        return parcelle;
    }
    public void setParcelle(String parcelle) {
        this.parcelle = parcelle;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Maison [id=" + id + ", parcelle=" + parcelle + ", quartier=" + quartier + ", type=" + type + "]";
    }
    
}
