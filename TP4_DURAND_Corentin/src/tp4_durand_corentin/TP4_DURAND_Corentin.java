/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_durand_corentin;

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
        
        Epee epee_1 = new Epee("Excalibur", 7, 5);
        Epee epee_2 = new Epee("Durandal", 4, 7);
        Baton baton_1 = new Baton("Chêne", 4, 5);
        Baton baton_2 = new Baton("Chârme", 5, 6);
        
        Vector list_arme = new Vector();
        
        list_arme.addElement(epee_1); 
        list_arme.addElement(epee_2);
        list_arme.addElement(baton_1);
        list_arme.addElement(baton_2);
        
        for(int i = 0; i < list_arme.size(); i++){
            System.out.println(list_arme.elementAt(i));
        }
        
        Magicien mage_1 = new Magicien("Gandalf",65,true);
        Magicien mage_2 = new Magicien("Garcimore", 44, false);
        Guerrier guerrier_1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier_2 = new Guerrier("Lannister", 45, true);
       
        Vector list_personnage = new Vector();
        
        list_personnage.addElement(mage_1);
        list_personnage.addElement(mage_2);
        list_personnage.addElement(guerrier_1);
        list_personnage.addElement(guerrier_2);
        
        for(int i = 0; i < list_personnage.size(); i++){
            System.out.println(list_personnage.elementAt(i));
        }
        
        
        
      
        

    }

}
