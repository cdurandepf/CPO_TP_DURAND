/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_durand_corentin;

import java.util.Scanner;
import Personnage.Personnage /**
         *
         * @author Corentin DURAND
         */

public class Jeu {

    public void Menu() {
        while (true) {

            int reponce;
            System.out.println("Que souhaitez vous faire ?\n1) DUEL\n2) Créée un personnage\n3) Créée une arme");
            Scanner sc = new Scanner(System.in);
            reponce = sc.nextInt();
            switch (reponce) {
                case 1:
                    this.Interface_Duel();
                case 2:
                    this.Cree_perso();
                case 3:
                    this.Cree_arme();
            }
        }
    }

    public void Interface_Duel(Personnage attaquant, Personnage defenseur) {
        boolean kill_cible;
        boolean kill_this;
        int tour = 0;
        while (attaquant.PV > 0 || defenseur.PV > 0) {
            if (attaquant.vitesse > defenseur.vitesse) {
                kill_cible = attaquant.Attaque(defenseur);
                System.out.println(attaquant.nom + "a attaqué " + defenseur.nom
                        + "\n" + defenseur.nom + " à " + defenseur.PV + " PV");

                if (kill_cible) {
                    System.out.println(attaquant.nom + " a ganger");
                } else {
                    kill_this = defenseur.Attaque(attaquant);
                    System.out.println(defenseur.nom + "a attaqué " + attaquant.nom
                            + "\n" + attaquant.nom + " à " + attaquant.PV + " PV");
                    if (kill_this) {
                        System.out.println(defenseur.nom + " a gagner");
                    }
                }
            } else {
                kill_this = defenseur.Attaque(attaquant);
                System.out.println(defenseur.nom + "a attaqué " + attaquant.nom
                        + "\n" + attaquant.nom + " à " + attaquant.PV + " PV");
                if (kill_this) {
                    System.out.println(defenseur.nom + " a gagner");
                } else {
                    kill_cible = attaquant.Attaque(defenseur);
                    System.out.println(attaquant.nom + "a attaqué " + defenseur.nom
                            + "\n" + defenseur.nom + " à " + defenseur.PV + " PV");

                    if (kill_cible) {
                        System.out.println(attaquant.nom + " a ganger");
                    }
                }
            }
            tour += 1;
        }
        if (attaquant.PV <= 0) {
            System.out.println(defenseur.nom + " a gagner");
        } else {
            System.out.println(attaquant.nom + " a ganger");
        }
    }

    public void Cree_perso() {

    }

    public void Cree_arme() {

    }
}
