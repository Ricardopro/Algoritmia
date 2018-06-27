package llistapolivalent.llista;

/**
 * Objecte base de dipósit del diferents tipus d'informació que conté la
 * col·lecció.
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public class Element {

   

    /**
     * Nom de l'objecte que conté la informació del nom de l'element i serveix
     * com a base per instancias tipus d'elements més avançats.
     */
    private String nom;

    /**
     * Constructor d'un objecte de tipus element.
     * @param n Nom identificatiu de l'objecte.
     */
    protected Element(String n) {
        nom = n;
    }

    /**
     * Retorna la informació corresponent al nom identificatiu de l'element.
     * @return String Nom de l'element.
     */
    protected String escriure() {
        String res = "";
        res = "Informació de l'element: "+nom+"\n";
        res += "------------------------------------------\n";
        return res;
    }
    protected String borrar(){
    String res = "";
        return res;
    }
    
}
