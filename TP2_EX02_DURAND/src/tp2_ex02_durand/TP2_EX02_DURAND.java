/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ex02_durand;

import java.util.Scanner;

/**
 *
 * @author Corentin DURAND
 */
public class TP2_EX02_DURAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int instruct;
        double temp;
        double res;
        Convertisseur conv = new Convertisseur();
        System.out.println("Please enter the operator :\n1) Celcuis to Kelvin"
                + "\n2) Kelvin to Celcuis\n3) Farenheit to Celcuis\n4) Celcuis to"
                + " Farenheit\n6) Kelvin to Farenheit\nFarenheit to Kelvin");
        Scanner sc = new Scanner(System.in);
        instruct = sc.nextInt();
        System.out.println("Veuillez indiquer votre température");
        temp = sc.nextInt();
        
        switch(instruct){
            case 1:
                res = conv.CelcuisVersKelvin(temp);
                System.out.println("Le resultat est : " + res);
        }

        System.out.println(conv.CelcuisVersFarenheit(25));
        System.out.println(conv);
    }

}
