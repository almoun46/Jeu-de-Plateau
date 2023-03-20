package projet;

import java.util.ArrayList;

public class LesJoueurs 
{
    //Attributs
    private ArrayList<Joueur> liste_joueurs;//Collection de joueur pour gèrer l'ensemble des joueurs
    
    //Accesseurs
    public void setListe_joueurs(ArrayList<Joueur> liste_joueurs)
    {
        this.liste_joueurs=liste_joueurs;
    }
    public ArrayList<Joueur> getListe_joueurs()
    {
        return this.liste_joueurs;
    }
    
    //Constructeur par défaut de la classe LesJoueurs--> ne prend pas de paramètre-->permet d'initialiser l'ttribut de la classe
    public LesJoueurs()
    {
        this.liste_joueurs = new ArrayList<>();
    }
    
    //Méthode pour recupere le nombre de joueur de l'ArrayList
    public int getNbJoueurs()
    {
        return this.liste_joueurs.size();
    }
    
    //Méthode--> qui renvoie un joueur d'indice i donné en paramètre
    public Joueur getJoueur(int i)
    {
        if (i>=0 && i<this.getNbJoueurs())
             return this.liste_joueurs.get(i);
        else
            return null;
    }
   
    //Méthode permettant d'ajouter un joueur
    public void ajouteJoueur(Joueur j)
    {
        this.liste_joueurs.add(j);
    }
    public void JoueursPartie(){
        //String autre=ok;
        System.out.println("Les joueurs qui doivent jouer?");
        String nom=Lire.S("Nom du joueur ");
        this.ajouteJoueur(new Joueur(nom));
        String autre=Lire.S("Joueur supplémentaire (oui/non) "); 
        while(autre.equalsIgnoreCase("oui")){
                       
            String nomd=Lire.S("Nom du joueur ");
            this.ajouteJoueur(new Joueur(nomd));
            autre=Lire.S("Joueur supplémentaire (oui/non) "); 
        } 
   }
    public void getGagnant(){
        Joueur gagnant=this.getJoueur(0);
        for (int i = 1; i < this.getNbJoueurs(); i++) {
            if(this.getJoueur(i).getScore()>gagnant.getScore()){
                gagnant=this.getJoueur(i);
            }
        }
        System.out.println("Le gagnant est : "+gagnant.getPseudo());
    }
    
    
}
