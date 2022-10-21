/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ex02_durand;

/**
 *
 * @author Corentin DURAND
 */
public class Convertisseur {

    public Convertisseur() {
        nbConversions = 0;
    }
    public int nbConversions;

    public double CelcuisVersKelvin(double C) {
        double k;
        k = C - 273.15;
        nbConversions += 1;
        return k;

    }

    public double KelvinVersCelcuis(double K) {
        double C;
        C = K + 273.15;
        nbConversions += 1;
        return C;
    }

    public double FarenheitVersCelcuis(double F) {
        double C;
        C = (F - 32) * (5.0 / 9);
        return C;
    }

    public double CelcuisVersFarenheit(double C) {
        double F;
        F = C * (9.0 / 5) + 32;
        nbConversions += 1;
        return F;
    }

    public double FarenheitVersKelvin(double F) {
        double K;
        K = (F - 32) * (5.0 / 9) + 273.15;
        return K;
    }

    public double KelvinVersFarenheit(double K) {
        double F;
        F = (K - 273.15) * (9.0 / 5) + 32;
        nbConversions += 1;
        return F;
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}
