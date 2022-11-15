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
public class Epee extends Arme{
    
    public Epee(String nom_epee, int niv_epee, int finesse, double atq, int cap_i){
        super(nom_epee,niv_epee);
        indice_finesse = finesse;
        etre_baton = false;
        etre_epee = true;
        AD_arme = atq;
        cap = cap_i;
    }
    
    public int indice_finesse;
    
    
    
}
