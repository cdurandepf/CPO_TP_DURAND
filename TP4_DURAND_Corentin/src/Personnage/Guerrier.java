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
public class Guerrier extends Personnage {

    public Guerrier(String nom, int niv_vie, boolean cheval,  double vie, double atq, double tacle_i, double endurance_i) {
        super(nom, niv_vie);
        chevalier = cheval;
        arme_favori = false;
        nombre_guerrier += 1;
        PV = vie;
        AD = atq;
        tacle = tacle_i;
        endurance = endurance_i;
        etat = 100;
    }

    public boolean chevalier;
    public static int nombre_guerrier = 0;

    public void setter_chevalier(String action) {
        if (action.equals("up")) {
            chevalier = true;
        } else if (action.equals("down")) {
            chevalier = false;
        }
    }

}
