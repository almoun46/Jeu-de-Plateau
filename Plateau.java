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
public class Plateau {
    private Case [][] caso;
    private int dimension1;
    private int dimension2;

    public int getDimension1() {
        return dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public void setCaso(Case[][] caso) {
        this.caso = caso;
    }

    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    public Case[][] getCaso() {
        return caso;
    }


    public Case getCasos(int i,int j) {
       Case c=new Case();
               if(i<getDimension1() && j<getDimension2()){
                     c = caso[i][j];
                   
               }
       return c;
          
    
    }

    

    /**
     *
     */
    public Plateau() {
        
        this.dimension1=4;
        this.dimension2=4;
        this.caso = new Case [this.getDimension1()][this.getDimension2()];
        initPlateau(9);
    }
//constructeur avec param
    public Plateau( int dimension1, int dimension2,int valeurMax) {
        
        setDimension1(dimension1);
        setDimension2(dimension2);
        setCaso(new Case[this.getDimension1()][this.getDimension2()]);
        //on remplie le plateau case par case
        initPlateau(valeurMax);

    }
    //methode qui initialise les cases
    public void initPlateau(int valeur){
        for (int i = 0; i < getDimension1(); i++) {
            for (int j = 0; j < getDimension2(); j++) {
             caso[i][j]=new Case(valeur);
            }
        }
    }
    public boolean casedecouverte(int a,int b){
        
        return this.getCasos(a, b).isCaseVisible();
    }
    //permet de savoir si toute les cases sont decouverte et achève le jeu
    public boolean istouteDecouverte(){
        boolean fin=false;
        int compt=0;
        for (int i = 0; i < getDimension1(); i++) {
            for (int j = 0; j < getDimension2(); j++) {
               // fin &=casedecouverte(i, j);//teste parcase
               if(casedecouverte(i, j)==true){compt++;}
            }
        }
        if(compt==this.getDimension1()*getDimension2()){fin=true;}
        return fin;
    }
    public Boolean CorrectIndice(int a ,int b){
        return ((a>=0 && a<getDimension1()) && (b>=0 && b<getDimension2())); 
    }
  public int getTaille(){return caso.length;}
//    public static void afficheErreur(Object e){
//    // affiche une erreur dans le terminal
//    }
    @Override
    public String toString() {
        String mes="";
        int a=0;int b=0;
        for (int k = 0; k < this.getDimension1(); k++) {
           
            for (int l = 0; l < this.getDimension2(); l++) {
                
              if(caso[k][l].isCaseVisible()==true){
                  a=k;b=l;
                mes+=caso[a][b].toString()+"";}
              
             else{
               mes+="  XX"; }     
           }
            mes+="\n";
        }
        return mes;
    }
    
            
}