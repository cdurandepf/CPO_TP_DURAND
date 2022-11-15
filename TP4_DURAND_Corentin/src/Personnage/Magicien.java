package Personnage;


import Personnage.Personnage;
import java.util.*;
import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Corentin DURAND
 */
public class Magicien extends Personnage {
    
    public Magicien(String nom_v, int niv_vie, boolean exp, double vie, double atq, double tacle_i, double endurance_i, double RM_i, double Armor_i, double vitesse_i){
        super(nom_v, niv_vie);        
        confirme = exp;
        arme_favori = true;
        nombre_mage++;
        PV = vie;
        AP = atq;
        tacle = tacle_i;
        endurance = endurance_i;
        etat = 100;
        RM = RM_i;
        Armor = Armor_i;
        vitesse = vitesse_i;
        
    }
    
    public boolean confirme;
    public static int nombre_mage = 0;
    
    public void setter_confirme(String action){
        if(action.equals("up")){
            confirme = true; 
        }
        else if(action.equals("down")){
            confirme = false;
        }
    }
    
    public ArrayList Arme_predilection(){
        ArrayList<Arme> retour = new ArrayList(); 
        for(int i = 0;i < inventair.size(); i++){
            if(inventair.get(i).etre_baton == true){
                retour.add(inventair.get(i));
            }
        }
        return(retour);
        
    }    
}
