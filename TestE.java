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
 class TestE  {
  public static boolean Confirme(){
         String s;
         RetourTest.Message(RetourTest.bleu("OUI/NON"));//appel à la methode message pour afficher
         s=Lecture().trim();//return un String dont sa valeur est est la chaîne entrée
         return s.isEmpty()? true : s.equalsIgnoreCase("oui");//si la variable s contient la chaine de caractère"oui" return true
   }
     public static int getInt(){
    // demande l'entrée d'un entier à l'utilisateur
    boolean c = true;
    int i = 0;
    while(c){
      try{
          RetourTest. MessageLigne(" >> ");
        i = Integer.parseInt(Lecture());
        c = false;
      }catch (Exception e){
        RetourTest.MessageErr(e);
      }
    }
    return i;
  }
   //methode qui permet de teste deux valeur(si petite)
  public static int getSmall(int small){
    // demande à l'utilisateur l'entrée d'un entier supérieur à min
    int i;
    do{
      i = getInt();
      if(i < small){
        RetourTest.MessageErr("Vous avez entré quelque chose plus petit que " +
        small);
      }
    }while(i < small);
    return i;
  }
  //methode qui permet de teste deux valeur(si grande))
  public static int getBig(int small, int big){
    // demande à l'utilisateur l'entrée d'un entier supérieur à small et inférieur
    // à big
    int i;
    do{
      i = getSmall(small);
      if(i >= big){
       RetourTest.MessageErr("Vous avez entré un nombre plus grand que  " + big);
      }
    }while(i >= big);
    return i;
  }
  // affiche une erreur dans le terminal avec les carateristique de l'objet appelé
  public static void afficheErreur(Object e){
    afficheLigne("---- ERREUR ---------------------------------\n  " + e.toString() +
            "\n---------------------------------------------");
  }
  public static void afficheLigne(Object x) {
         System.out.print(x.toString());
     }

    private static String Lecture() {
        String l="";
        try{//essaie de lire au clavier une line
            l=new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();
                
        }catch(Exception a){
            RetourTest.MessageErr(a);
        }
        return l;
    }

    
 }