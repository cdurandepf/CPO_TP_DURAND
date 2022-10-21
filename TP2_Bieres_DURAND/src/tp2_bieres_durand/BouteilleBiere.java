/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_durand;

/**
 *
 * @author Corentin DURAND
 */
public class BouteilleBiere {

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
    }

    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverture;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + "(" + degreAlcool + " degre)"
                + "\nBrasserie : " + brasserie);
    }

    public boolean Decapsuler() {
        if (ouverture == false) {
            ouverture = true;
            return (true);
        } else {
            System.out.println("Erreur, la biere est déjà ouverte");
            return (false);
        }
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)"
                + "Ouverte ? ";
        if (ouverture == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}
