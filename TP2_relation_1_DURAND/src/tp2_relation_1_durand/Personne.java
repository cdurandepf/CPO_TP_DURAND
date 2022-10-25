/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_durand;

/**
 *
 * @author Corentin DURAND
 */
public class Personne {

    public Personne(String nm, String pnm, int nb_voit) {
        Nom = nm;
        Prenom = pnm;
        nbVoitures = nb_voit;
        liste_voitures = new Voiture[3];
        for(int i = 0; i < 3; i++){
            liste_voitures[i] = null;
        }
        boolean disp_voitures[] = new boolean[3];
    }

    public String Nom;
    public String Prenom;
    public Voiture[] liste_voitures;
    public int nbVoitures;

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        int dispo = -1;

        if (voiture_a_ajouter.Proprietaire != null) {
            return (false);
        }

        for (int i = 0; i < 3; i++) {

            if (liste_voitures[i] == null) {
                dispo = i; 
            }
        }

        if (dispo == -1) {
            return (false);
        }
        liste_voitures[dispo] = voiture_a_ajouter;
        nbVoitures += 1;
        voiture_a_ajouter.Proprietaire = this;
        return (true);
    }



@Override
public String toString() {
        String retour = "";
        retour = "Nom ; " + Nom + "\nPrenom : " + Prenom;
        return (retour);

    }

}
