package Personnage;

import java.util.*;
import Armes.Arme;
import tp4_durand_corentin.etre_vivant;
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
public class Personnage implements etre_vivant {

    public Personnage(String nom_p, int niv_vie) {
        nom = nom_p;
        niveau_vie = niv_vie;
        arme_en_main = null;
        nombre_personnage++;
    }

    public String nom;
    public int niveau_vie;
    public Arme arme_en_main;
    public ArrayList<Arme> inventair = new ArrayList();
    public boolean arme_favori;
    public double PV;
    public double AD = 0;
    public double AP = 0;
    public double etat;
    public double endurance;
    public double tacle;

    public static int nombre_personnage = 0;

    public boolean add_arme(Arme arme) {
        if (inventair.size() < 6) {
            inventair.add(arme);
            return (true);

        } else {
            return (false);
        }
    }

    public Arme getter_arme_en_main() {
        return (arme_en_main);
    }

    public void porter_arme(String nom) {
        boolean verif = true;
        for (int i = 0; i < inventair.size(); i++) {
            if (inventair.get(i).nom.equals("nom")) {
                arme_en_main = inventair.get(i);
                System.out.println("L'arme à bien été équiper");
                verif = false;
                break;
            }
        }
        if (verif) {
            System.out.println("Cette arme n'est pas dans l'inventaire");
        }
    }

    public ArrayList Arme_predilection() {
        ArrayList<Arme> retour = new ArrayList();
        for (int i = 0; i < inventair.size(); i++) {
            if (inventair.get(i).etre_baton == arme_favori) {
                retour.add(inventair.get(i));
            }
        }
        return (retour);

    }

    @Override
    public String toString() {
        if (arme_en_main == null) {
            return ("Nom : " + nom + "\nNiveau de vie : " + niveau_vie +
                    "\nEtat : " + etat + "\nEndurance : " + endurance + 
                    "\nTâcle : " + tacle + "\nAP : " + AP + "\nAD : " + AD);
        } else {
            return ("Nom : " + nom + "\nNiveau de vie : " + niveau_vie +
                    "\nEtat : " + etat + "\nEndurance : " + endurance + 
                    "\nTâcle : " + tacle + "\nAP : " + AP + "\nAD : " + AD +
                    "Arme équier : " + arme_en_main);
        }

    }

    @Override
    public void seFatiger() {
        AP = AP * etat * 0.01;
        AD = AD * etat * 0.012;
    }

    @Override
    public boolean estVivant() {
        if (PV > 0) {
            return (true);
        } else {
            return (false);
        }
    }

    @Override
    public void estAttaquer(Personnage attaquant) {
        PV -= attaquant.AP + attaquant.AD;
    }

    @Override
    public void Attaque(Personnage cible) {
        cible.estAttaquer(this);
        etat -= tacle/endurance;
        this.seFatiger();
    }

}
