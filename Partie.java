/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import java.util.Scanner;
/**
 *
 * @author Abdel-Aziz-Hisseine
 */
public class Partie {
    private Plateau p;
    private LesJoueurs lst;

    public Plateau getP() {
        return p;
    }

    public LesJoueurs getLst() {
        return lst;
    }

    public Partie() {
        this.p = new Plateau();
        this.lst = new LesJoueurs();
        
    }
    public void initPartie(){
        lst.JoueursPartie();
        System.out.println("Caractéristiques du jeu :\n Les joueurs ;");
        System.out.println("–––––––––––––– "); 
        
        for (int i = 0; i < lst.getNbJoueurs(); i++) {
            Joueur get = lst.getJoueur(i);
            System.out.println(get);
        }
        System.out.println("–––––––––––––– "); 
        System.out.println("Les natures d'indices : '-','+','*' \n Valeur maximale des cases : 9 ");
        System.out.println(""+p);
    for (int k = 0; !this.p.istouteDecouverte(); k++) {
        for (int i = 0; i < lst.getNbJoueurs(); i++) {
            lst.getJoueur(i).joue(p);
        }   
     }
    getLst().getGagnant();
   }
    
}
