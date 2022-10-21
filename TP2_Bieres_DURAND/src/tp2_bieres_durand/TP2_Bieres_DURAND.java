/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_durand;

/**
 *
 * @author Corentin DURAND
 */
public class TP2_Bieres_DURAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuve des trolls", 
                7.0,"Dubuisson"); 
        uneBiere.ouverture = false; 
        uneBiere.lireEtiquette(); 
        BouteilleBiere leffe = new BouteilleBiere("leffe", 6.6,
                "Abbaye de leffe");
        leffe.ouverture = false; 
        leffe.lireEtiquette();
        System.out.println(uneBiere);
    }
    
}
