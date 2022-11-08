package Personnage;

import java.util.*;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Corentin DURAND
 */
public class Personnage {

    public Personnage(String nom_p, int niv_vie) {
        nom = nom_p;
        niveau_vie = niv_vie;
        arme_en_main = null;

    }

    public String nom; 
    public int niveau_vie;
    public Arme arme_en_main;
    public Vector<Arme> inventair = new Vector();

    public boolean add_arme(Arme arme) {
        if (inventair.size() < 6) {
            inventair.addElement(arme);
            return (true);
                    
            
        } else {
            return (false);
        }
    }
    
    public Arme getter_arme_en_main(){
        return(arme_en_main);
    }
    
    public void porter_arme(String nom){
        for(int i = 0; i < inventair.size(); i++){
            if(inventair.elementAt(i).nom.equals("nom")){
                arme_en_main = inventair.elementAt(i);
                System.out.println("L'arme à bien été équiper");
            }
        }
    }
    
    @Override
    public String toString() {
        return ("Nom : " + nom + "\nNiveau de vie : " + niveau_vie);
    }

}
