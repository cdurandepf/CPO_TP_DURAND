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
        System.out.println("""
                           Please enter the operator :
                           1) Celcuis to Kelvin
                           2) Kelvin to Celcuis
                           3) Farenheit to Celcuis
                           4) Celcuis to Farenheit
                           5) Kelvin to Farenheit
                           6) Farenheit to Kelvin""");
        Scanner sc = new Scanner(System.in);
        instruct = sc.nextInt();
        System.out.println("Veuillez indiquer votre température");
        temp = sc.nextInt();
        
        switch(instruct){
            case 1 -> {
                res = conv.CelcuisVersKelvin(temp);
                System.out.println("Le resultat est : " + res);
            }
            case 2 -> { 
                res = conv.KelvinVersCelcuis(temp);
                System.out.println("Le resultat est : " + res);
            }
            case 3 -> { 
                res = conv.FarenheitVersCelcuis(temp);
                System.out.println("Le resultat est : " + res);
            }
            case 4 -> { 
                res = conv.CelcuisVersFarenheit(temp);
                System.out.println("Le resultat est : " + res);
            }
            case 5 -> { 
                res = conv.KelvinVersFarenheit(temp);
                System.out.println("Le resultat est : " + res);
            }
            case 6 -> {
                res = conv.FarenheitVersKelvin(temp);
                System.out.println("Le resultat est : " + res);
            }             
                           
        }
    }
}

        


