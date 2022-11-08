/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Corentin DURAND
 */
public class Arme {
    
    public Arme(String nom_arme, int niv_arme){
        nom = nom_arme;
        niveau_atq = niv_arme;                
    }
    
    public String nom;
    public int niveau_atq; 
    
    @Override 
    public String toString(){
        return("Nom : " + nom + "\nNiveau d'attaque : " + niveau_atq);
    }
    
}
