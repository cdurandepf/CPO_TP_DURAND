/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_manip_durand;

/**
 *
 * @author Corentin DURAND
 */
public class TP_manip_DURAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories);
        // deux tartiflette on été crée assiette3 et assiette 2 sont un objet
        assiette2 = assiette1;
        assiette1 = assiette3;
        /*
        Moussaka assiette666 = assiette1 ;
        Moussaka assiette667 = new Tartiflette() ;
        Aucune de c'est deux ligne est correcte
        
        la réponce est non 
        */
        
        Moussaka tab[] = new Moussaka[10];
        for(int i = 0; i < 10; i++){
            tab[i] = new Moussaka(100);
        }
        /* 
        Oui c'est possible, un exemple serai "System.out.println()" ici
        out est un objet possédant c'est attribut et c'est méthode(dans notre
        cas println()) et nous nous référons à cette objet comme un attribut
        de System
        */

        
    }

}
