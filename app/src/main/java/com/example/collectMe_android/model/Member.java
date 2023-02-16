package com.example.collectMe_android.model;

public class Member {
    String identifiant;
    String password;
    String nom;
    String prenom;

    public Member() {
        super();
    }

    public Member(String identifiant, String password, String nom, String prenom) {
        super();
        this.identifiant = identifiant;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    public String getIdentifiant() {
        return this.identifiant;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
}

