package llistapolivalent.llista;

import java.util.ArrayList;

/**
 * És la classe depòsit dels elements de la col·lecció. Implementa la interfícia
 * "AccesLlista" que és la col·lecció de mètodes que empren les classes externes
 * al paquet "llistapolivalet.llista" per manipular la informació del conjunt
 * d'elements
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public class Conjunt implements AccesLlista {
    /**
     * És la classe que conté el dipòsit d'elements de la col·lecció.
     */
    private ArrayList <Element> conj;

    /**
     * Constructor de la classe conjunt d'elements.
     */
    public Conjunt() {
        conj = new ArrayList <Element> ();
    }

    /**
     * Mètode d'accés a la mida del conjunt d'elements.
     * @return int Quantitat dels elements que hi ha en el conjunt.
     */
    public int getMida() {
        return conj.size();
    }

    /**
     * Retorna la informació de tots els elements del conjunt.
     * @return String Conté la informació completa de tota la col·lecció.
     */
    public String getInfoTotal() {
        String res = "";
        for(int i=0;i<getMida();i++) {
            res += conj.get(i).escriure();
            
        }
        return res;
    }

    /**
     * Retorna la informació d'un element donat del conjunt.
     * @param int i Posició del element del conjunt del qual es vol saber la
     * informació.
     * @return String Conté la informació d'un element donat del conjunt.
     */
    public String getInfo(int i) {
        return conj.get(i).escriure();
    }

    /**
     * Mètode intern que afeigeix un objecte de tipus "Element" a la llista
     * física apuntada per "conj".
     * @param e Objecte de tipus "Element" a afeigir a la col·lecció.
     */
    private void posar(Element e) {
        conj.add(e);
    }

    /**
     * Posa una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param double d Valor del nombre real que es vol guardar.
     */
    public void posar(String s,double d) {
        posar(new NombreReal(s,d));
    }

    /**
     * Posa una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     */
    public void posar(String s,String m) {
        posar(new MissatgeText(s,m));
    }
      /**
     * Posa una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(String s,double d,int i){
        NombreReal nr =  new NombreReal(s,d);
        posar(nr,i);
    
    } 
    
   /**
     * Posa una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(String s,String m,int i){
    MissatgeText nr = new MissatgeText(s,m);
    posar(nr,i);
    }
    
     /**
     * Posa una informació d'un element de tipus "element" al conjunt.
     * @param element e Nom del nou element del conjunt.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(Element e, int i) {
        conj.add(i, e);
        
    }
    
    
    
    
     /**
     * Modifica una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del real de l'element a guardar.
     * @param int i lloc de la llista on es modifica el element
     */
    public void modificar(String s,double d,int i){
        posar(s,d,i);
        eliminar(i);
        
    }
    /**
     * Modifica una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void modificar(String s,String m,int i){
        posar(s,m,i);
        eliminar(i);
  
    }
    
    
    /**
     * Elimina una informació d'un element de tipus "element" al conjunt.
     * @param int i lloc de la llista on posa el element nou
     */
    public void eliminar(int i){
        
        int h ;
        h= conj.size();
        if (i<h){
        conj.remove(i);
        }
    }
    
    /**
     * Mètode d'accés a la mida del conjunt d'elements.
     * @return int Quantitat dels elements que hi ha en el conjunt.
     */
    
    public int mostrarmida (){
       return conj.size();
    
    }

     /**
     * Elimina tota la informació del conjunt.
     */
    
    public void vaciartodo (){
        conj.clear();
}
    /**
     * Mostra tota la informació del conjunt.
     */
     public void mostrartot(){
    System.out.println(getInfoTotal()); //posar this
         //conj.get(0).
     }
     
       /**
     *  Mostra una informació d'un element de tipus "element" al conjunt.
     * @param int i lloc de la llista on es mostra l'element nou
     */
     public void mostrarelement(int i){
     
     System.out.println(conj.get(i).escriure());
    }
    
    

   /**
     * Posa una informació d'un element de tipus "int" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param int d Valor del enter de l'element a guardar.
     */
      public void posar(String s,int d,int i){
        NombreEnter nr =  new NombreEnter(s,d);
        posar(nr,i);
    }
     /**
     * Posa una informació d'un element de tipus "int" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param int d Valor del nombre enter que es vol guardar.
     */
    public void posar(String s,int d) {
        posar(new NombreEnter(s,d));
    }
     /**
     * Modifica una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String d Valor del treal de l'element a guardar.
     * @param int i lloc de la llista on es modifica el element
     */
   public void modificar(String s,int d,int i){
        posar(s,d,i);
        eliminar(i);
        
    }
      
      
      
      
      
      
      
}