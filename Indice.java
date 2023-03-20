/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import projet.Case;
/**
 *
 * @author Abdel-Aziz-Hisseine
 */
 enum Indice{
  SOMME("+"),
  DiFFERENCE("-"),
  PRODUIT("*");
  private String m_indice;

    public void setM_indice(String m_indice) {
        this.m_indice = m_indice;
    }

    private Indice(String m_indice) {
        setM_indice(m_indice);
    }

    public String getIndice() {
        return m_indice;
    }
    public static double getValeurIndice(Case a,Case b){
        double r=(double)a.getValeur();double d;
      d = (double)b.getValeur();
        switch(a.getOperateur()){
            case SOMME -> r+=d;
            case DiFFERENCE -> r-=d;
            case PRODUIT -> r=r*d;
        }
        return r;
    }

    @Override
    public String toString() {
        return (String)getIndice();
    }
     
 }
