package Armes;


import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Corentin DURAND
 */
public class Baton extends Arme {
    
    public Baton(String nom_bat, int niv_bat, int age_bat, double atq, int cap_i){
        super(nom_bat, niv_bat);
        age_baton = age_bat;
        etre_baton = true;
        etre_epee = false;
        AP_arme = atq;
        cap = cap_i;
    }
    
    public int age_baton; 
    
}
