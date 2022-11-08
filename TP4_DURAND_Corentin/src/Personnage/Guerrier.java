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

    public Guerrier(String nom, int niv_vie, boolean cheval) {
        super(nom, niv_vie);
        chevalier = cheval;
    }

    public boolean chevalier;

    public void setter_chevalier(String action) {
        if (action.equals("up")) {
            chevalier = true;
        } else if (action.equals("down")) {
            chevalier = false;
        }
    }

}
