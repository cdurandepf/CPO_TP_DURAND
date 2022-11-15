/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp4_durand_corentin;
import Personnage.*;

/**
 *
 * @author Corentin DURAND
 */
public interface etre_vivant {
    public void seFatiger();
    public boolean estVivant(); 
    public void estAttaquer(Personnage attaquant);
    public boolean Attaque(Personnage cible);
    public Personnage Duel(Personnage cible);
    
    
}
