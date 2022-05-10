package com.example.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String marque;
    private String serie;
    private Double prix;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Telephone() {
    }
    public Telephone(String marque, String serie, Double prix) {
        this.marque = marque;
        this.serie = serie;
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Telephone [id=" + id + ", marque=" + marque + ", prix=" + prix + ", serie=" + serie + "]";
    }
    
}
