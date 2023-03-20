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
public class Joueur {
    private int score;
    private String pseudo;

    public int getScore() {
        return score;
    }

    public void setScore(int credit) {
        this.score = credit;
    }
    
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Joueur( String pseudo) {
        setScore(0);
        setPseudo(pseudo); 
        
    }
    //la methode qui permet à un joueur de jouer
    public void joue(Plateau p){
    Case[] c = new Case[2];
    int i = 0, j = 0, k;
    double d;
    boolean b;
    RetourTest. MessageLigne(RetourTest.vert( getPseudo()+ "  joue."));
       
    // demande au joueur de sélectionner deux cases
    for(k = 0; k < 2; k++){//parcourt de 2 caases que le joueur doit donner
      b = true;
      //Affiche les message selon la case actuel
      RetourTest. MessageLigne(RetourTest.vert("Donner la " + (k == 0 ?
          "première" : "seconde") + " case."));
      while(b){
        RetourTest. MessageLigne(RetourTest.vert("Entrez le numéro de ligne :"));
        i = TestE.getBig(0, p.getDimension1()) ;//verification de la valeur de ligne entrée
        RetourTest. MessageLigne(RetourTest.vert("Entrez le numéro de colonne :"));
        j = TestE.getBig(0, p.getDimension2());//verification de la valeur de ligne entrée
        if(b = p.casedecouverte(i, j)){//si une case est decouverte
            //message d'erreur
          RetourTest.MessageErr("Cette case a été déjà decouverte. " +
              "Choisissez une autre !");
        }
      }
      c[k] = p.getCasos(i, j);//affectation de l'adress de case selectionée du plateau à une case 
        System.out.println(p.getCasos(i, j).getValeur()+"");
      if(c[0].equals(c[1])){//si les cases choisies sont les mêmes
        RetourTest.MessageErr("Vous devez choisir deux cases distinctes.");
        k = 0;
      }
    }
    // affiche les indices des cases
    for(k = 0; k < 2; k++){
      d = 0;
      try{
        d = Indice.getValeurIndice(c[k], c[(k + 1) % 2]);//cacul de valeur d'une case avec son indice
      }catch(Exception a){
        RetourTest.MessageErr(a);
      }finally{//en fin 
        RetourTest.MessageLigne(RetourTest.vert("Indice de la " + (k == 0 ?//affiche l'indice de la  case 
            "premièrere" : "seconde") + " case : " + d));
      }
    }
    // propose au joueur de faire une hypothèse
    RetourTest.MessageLigne(RetourTest.vert("Voulez -vous faire une hypothèse ?"));
    if(TestE.Confirme()){
      i = 0;
      for(k = 0; k < 2; k++){
        RetourTest.MessageLigne(RetourTest.vert(
            "Entrez la valeur hypothétique de la " + (k == 0 ? "première" :
            "seconde") + " case."));
        i += c[k].isVisible(TestE.getInt()) ? 1 : 0;//incremente de 1 si lla case est visible et 0 sinon
      }
      switch(i){
        case 2:
          RetourTest.MessageLigne(
              RetourTest.vert("Les deux hypothèses sont justes."));
          AjoutScore(c[0].getValeur() + c[1].getValeur());//incrementation du score de joueur avec la valeur de ces deux cases
          for(k = 0; k < 2; k++){
            c[k].setCaseVisible(true);
          }
          break;
        case 1:
          RetourTest.MessageLigne(
              RetourTest.vert("L'une des deux hypothèses est fausse."));
          break;
        default:
          RetourTest.MessageLigne(
              RetourTest.vert("Les deux hypothèses sont fausses."));
      }
    }
    RetourTest.MessageLigne(this.toString());//affiche du caracteristique du joueur
    RetourTest.Message(""+p);//affiche plateau
  }

    /**
     *
     * @param s
     */
    
    public void AjoutScore(int s){
    // ajoute un entier s au score actuel du joueur
    setScore((this.getScore()+ s));
  }
 

    /**
     *
     * @return
     */
    @Override
  public String toString(){
    // retourne les caracteristiques du joueur sous forme d'une chaine de
    // caractères
    return RetourTest.magenta("Joeur: " + this.getPseudo() + " Score : " +
    this.getScore());
  }

    /**
     *
     * @return
     */
  
}
