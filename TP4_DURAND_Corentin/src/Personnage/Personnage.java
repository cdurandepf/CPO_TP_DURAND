package Personnage;

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

    }

    public String nom;
    public int niveau_vie;

    @Override
    public String toString() {
        return ("Nom : " + nom + "\nNiveau de vie : " + niveau_vie);
    }

}
