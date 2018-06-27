package llistapolivalent.llista;

/**
 * Interficie d'accés a les utilitats que permeten manipular la informació a la
 * nostra llibreria de conjunts d'elements.
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public interface AccesLlista {
    /**
     * Mètode d'accés a la mida del conjunt d'elements.
     * @return int Quantitat dels elements que hi ha en el conjunt.
     */
    public int getMida();
    /**
     * Retorna la informació d'un element donat del conjunt.
     * @param int i Posició del element del conjunt del qual es vol saber la
     * informació.
     * @return String Conté la informació d'un element donat del conjunt.
     */
    public String getInfo(int i);
    /**
     * Posa una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param double d Valor del nombre real que es vol guardar.
     */
    public void posar(String s,double d);
    
    
    /**
     * Posa una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     */
    public void posar(String s,String m);
    /**
     * Retorna la informació de tots els elements del conjunt.
     * @return String Conté la informació completa de tota la col·lecció. 
     */
    public String getInfoTotal();
    /**
     * Posa una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(String s,double d,int i);
    
    /**
     * Posa una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(String s,String m,int i);
     
    /**
     * Posa una informació d'un element de tipus "element" al conjunt.
     * @param element e Nom del nou element del conjunt.
     * @param int i lloc de la llista on posa el element nou
     */
    public void posar(Element e, int i);
     /**
     * Modifica una informació d'un element de tipus "double" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String d Valor del treal de l'element a guardar.
     * @param int i lloc de la llista on es modifica el element
     */
    public void modificar(String s,double d,int i);
    /**
     * Modifica una informació d'un element de tipus "text" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param String m Valor del text de l'element a guardar.
     * @param int i lloc de la llista on posa el element nou
     */
    public void modificar(String s,String m,int i);
    /**
     * Elimina una informació d'un element de tipus "element" al conjunt.
     * @param int i lloc de la llista on posa el element nou
     */
    public void eliminar(int i);
    /**
     * Elimina tota la informació del conjunt.
     */
    
    public void vaciartodo();
     /**
     * Mostra tota la informació del conjunt.
     */
    public void mostrartot();
      /**
     *  Mostra una informació d'un element de tipus "element" al conjunt.
     * @param int i lloc de la llista on es mostra l'element nou
     */
    public void mostrarelement(int i);
    
    
     /**
     * Posa una informació d'un element de tipus "int" al conjunt.
     * @param String s Nom del nou element del conjunt.
     * @param int d Valor del nombre enter que es vol guardar.
     */
    public void posar(String s,int d);
}
