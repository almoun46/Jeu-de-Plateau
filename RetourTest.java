/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
/**
 *
 * @author Abdel-Aziz-Hisseine
 */
public class RetourTest {
    
    public static void Message(Object x){//facilite l'affichage
        System.out.print(x.toString());
  }
  public static void MessageErr(Object O){
    // affiche une erreur dans le terminal
     MessageLigne(rouge("---- ERREUR ---------------------------------\n  " +
    O.toString() + "\n---------------------------------------------"));
  }
  public static void MessageLigne(Object x){
    
    Message(x.toString() + "\n");
  }
  // des methodes qui permettent le  changement de la couleur d'affichage d'un texte dans le terminl
 
  public static String bleu(Object x){
    return Couleur.BLEU + x.toString() + Couleur.REINITIALISATION;
  }
  public static String magenta(Object x){
    return Couleur.MAGENTA + x.toString() + Couleur.REINITIALISATION;
  }
  public static String rouge(Object x){
    return Couleur.ROUGE + x.toString() + Couleur.REINITIALISATION;
  }
  public static String vert(Object x){
    return Couleur.VERT + x.toString() + Couleur.REINITIALISATION;
  }
}
