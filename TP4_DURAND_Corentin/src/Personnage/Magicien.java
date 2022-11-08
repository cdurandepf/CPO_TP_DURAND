package Personnage;


import Personnage.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Corentin DURAND
 */
public class Magicien extends Personnage {
    
    public Magicien(String nom_v, int niv_vie, boolean exp){
        super(nom_v, niv_vie);        
        confirme = exp;
    }
    
    public boolean confirme;
    
    public void setter_confirme(String action){
        if(action.equals("up")){
            confirme = true; 
        }
        else if(action.equals("down")){
            confirme = false;
        }
    }
    
    
}
