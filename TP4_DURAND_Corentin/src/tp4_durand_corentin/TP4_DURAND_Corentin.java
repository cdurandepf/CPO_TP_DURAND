/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_durand_corentin;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import Personnage.Guerrier;
import Personnage.Magicien;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Corentin DURAND
 */
public class TP4_DURAND_Corentin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee epee_1 = new Epee("Excalibur", 7, 5,15);
        Epee epee_2 = new Epee("Durandal", 4, 7,7.5);
        Epee epee_3 = new Epee("Sabre", 10, 1,20);
        Baton baton_1 = new Baton("Chêne", 4, 5, 40);
        Baton baton_2 = new Baton("Chârme", 5, 6, 20);
        Baton baton_3 = new Baton("Olivier",10,1, 50);
        
        ArrayList<Arme> list_arme = new ArrayList();
        
        list_arme.add(epee_1); 
        list_arme.add(epee_2);
        list_arme.add(baton_1);
        list_arme.add(baton_2);
        
        /**
        for(int i = 0; i < list_arme.size(); i++){
            System.out.println(list_arme.get(i));
        }
        **/
        
        Magicien mage_1 = new Magicien("Gandalf",65,true, 120, 40, 30, 10, 1.5, 1.3, 3.4);
        Magicien mage_2 = new Magicien("Garcimore", 44, false, 100, 20, 40, 5, 1.1, 1, 2.9);
        Guerrier guerrier_1 = new Guerrier("Conan", 78, false, 190, 15, 60, 60, 2.2, 2.6, 2.3);
        Guerrier guerrier_2 = new Guerrier("Lannister", 45, true, 170, 7.5, 40, 40, 2, 2.3, 1.9);
       
        ArrayList list_personnage = new ArrayList();
        
        list_personnage.add(mage_1);
        list_personnage.add(mage_2);
        list_personnage.add(guerrier_1);
        list_personnage.add(guerrier_2);
        
        /**
        for(int i = 0; i < list_personnage.size(); i++){
            System.out.println(list_personnage.get(i));
        }
        **/
        
        mage_1.add_arme(baton_3);
        mage_1.add_arme(baton_2);
        mage_1.add_arme(epee_2);
        guerrier_1.add_arme(epee_3); 
        guerrier_1.add_arme(epee_1);
        
        /**
        System.out.println("Nombre d'arme preferer du magicient : " + 
                mage_1.Arme_predilection().size() + "\nNom arme Preferer : " + 
                mage_1.Arme_predilection());
        System.out.println(mage_1);
        System.out.println(Personnage.Personnage.nombre_personnage);
        
        guerrier_1.seFatiger(); 
        System.out.println(guerrier_1);
        guerrier_1.Attaque(mage_2);
        **/
        
        System.out.println(mage_2.Duel(guerrier_2));
      
        

    }

}
