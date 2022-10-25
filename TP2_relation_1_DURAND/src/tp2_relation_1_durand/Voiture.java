/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_durand;

import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author Corentin DURAND
 */
public class Voiture {

    public Voiture(String mod, String mrq, int puiss) {
        Modele = mod;
        Marque = mrq;
        puissanceCV = puiss;
        Proprietaire = null;
    }

    public String Modele;
    public String Marque;
    public int puissanceCV;
    public Personne Proprietaire;

    @Override
    public String toString() {

        String retour = "";
        retour = "Modele : " + Modele + "\nMarque : " + Marque
                + "\nPuissance : " + puissanceCV;
        return (retour);
    }

}
