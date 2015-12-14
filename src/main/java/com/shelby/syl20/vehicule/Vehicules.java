/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.syl20.vehicule;

/**
 *
 * @author shelby
 */
public class Vehicules {
    private String     nom;
    private int          nbreRoues;
    private String     couleur; 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbreRoues() {
        return nbreRoues;
    }

    public void setNbreRoues(int nbreRoues) {
        this.nbreRoues = nbreRoues;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    public void demarrer(){
        System.out.println("Jai demarrer la caisse");
    }
    public void arreter(){
        System.out.println("Stopper la caisse.");
    }
}
