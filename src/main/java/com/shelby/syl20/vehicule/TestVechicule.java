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
public class TestVechicule {
    public static void main(String[] args) {
        Vehicules monVehicule = new Vehicules();
        monVehicule.demarrer(); 
        monVehicule.accelerer(190);
        monVehicule.arreter();
    }
    
}
