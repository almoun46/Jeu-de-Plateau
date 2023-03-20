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
enum Couleur {
  ROUGE("\u001B[31m"),
  VERT("\u001B[32m"),
  BLEU("\u001B[34m"),
  MAGENTA("\u001B[35m"),
  REINITIALISATION("\u001B[39m");
  private String couleur; // permet de contenir les couleur declarées
  // constructeur
  Couleur(String couleur){
    setCouleur(couleur);
  }
  // accesseur en lecture
  private String getCouleur(){return couleur;}
  // accesseur en écriture
  private void setCouleur(String s){couleur = s;}

    /**
     *
     * @return
     */
    @Override
  public String toString(){
    // renvoie la sequence d'echappement
    return getCouleur();
  }
}
