package com.circulation_routiere.securite_routiere.Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Policier")
public class Policier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomPolicier;

    @Column
    private String prenomPolicier;

    @Column
    private String adPolicier;

    @Column
    private Long telPolicier;

    @Column(nullable = false)
    private String motDePasse;

    public Policier() {
    }


    public Policier(Long id, String nomPolicier, String prenomPolicier, String adPolicier, Long telPolicier, String motDePasse) {
        this.id = id;
        this.nomPolicier = nomPolicier;
        this.prenomPolicier = prenomPolicier;
        this.adPolicier = adPolicier;
        this.telPolicier = telPolicier;
        this.motDePasse = motDePasse;
    }


    public String getPrenomPolicier() {
        return this.prenomPolicier;
    }

    public void setPrenomPolicier(String PrenomPolicier) {
        this.prenomPolicier = PrenomPolicier;
    }

    public String getAdPolicier() {
        return this.adPolicier;
    }

    public void setAdPolicier(String adPolicier) {
        this.adPolicier = adPolicier;
    }

    public Long getTelPolicier() {
        return this.telPolicier;
    }

    public void setTelPolicier(Long telPolicier) {
        this.telPolicier = telPolicier;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomPolicier() {
        return this.nomPolicier;
    }

    public void setNomPolicier(String nomPolicier) {
        this.nomPolicier = nomPolicier;
    }

    public String getMotDePasse() {
        return this.motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    
}
