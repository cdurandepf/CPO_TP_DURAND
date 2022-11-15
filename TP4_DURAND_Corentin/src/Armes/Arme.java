package Armes;

import Personnage.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Corentin DURAND
 */
public class Arme {

    public Arme(String nom_arme, int niv_arme) {
        nom = nom_arme;
        niveau_atq = niv_arme;
    }

    public String nom;
    public int niveau_atq;
    public boolean etre_epee;
    public boolean etre_baton;
    public double AD_arme = 0;
    public double AP_arme = 0;
    public boolean special = false;
    public int cap;
    
    public void Capacite(Personnage person){
        switch(cap){
            case 0: 
                break;
            case 1: 
                Coup_Critic(person);
        }
    }

    public void Coup_Critic(Personnage porteur) {
        if (porteur.Charge > 3) {
            AD_arme = AD_arme * 2;
            porteur.Charge = 0;
            special = true;
        } else {
            if (special) {
                AD_arme = AD_arme / 2;
                special = false;
            }
        }
    }

    @Override
    public String toString() {
        return ("Nom : " + nom + "\nNiveau d'attaque : " + niveau_atq);
    }

}
