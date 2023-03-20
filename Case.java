/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Abdel-Aziz-Hisseine
 */
public class Case {
    private int valeur ;
    private Indice operateur;
    private boolean caseVisible;


    Case() {
        setValeur(10);
        setCaseVisible(false);
        gere();

    }
    
    

    public Indice getOperateur() {
        return operateur;
    }

    public int getValeur() {
        return valeur;
    }

    public boolean isCaseVisible() {
        return caseVisible;
    }

   
    public void setCaseVisible(boolean caseVisible) {
        this.caseVisible = caseVisible;
    }

    public void setOperateur(Indice operateur){
       
            this.operateur = operateur;
    }

    public void setValeur(int valeur) {
        this.valeur = (int)(Math.random()*valeur);
    }
 
   
       

    public Case( int valeurmax) {
        setCaseVisible(false);
        gere(); 
    }
    public void gere(){
      Random  rand = new Random();//valeur aléatoire entre O et 1
      setOperateur(Indice.values()[rand.nextInt(Indice.values().length)]);
      //Indice.values().length):renvoie la longueur du tableau des élts present(enumeré) dans la classe Indice
      setValeur(rand.nextInt(10));
    }
    public boolean isVisible(int V){
        boolean test=false;
        if(this.getValeur()==V){
            test=true;
            setCaseVisible(true);

        }
        return test ;
        
    }
    
    
    public String toString(){
       String res="";
       res=" "+this.getValeur()+this.getOperateur();
       return res;
    }
}
