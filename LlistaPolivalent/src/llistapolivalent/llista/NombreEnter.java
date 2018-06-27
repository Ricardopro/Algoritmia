package llistapolivalent.llista;
/**
 *
 * @author Ricardo Bibiloni
 */
public class NombreEnter extends NombreReal {
     /**
     * Informació tipus nombre real que te aquest objecte derivat d'"Element".
     */
    private int valor;
    /**
     * Constructor d'un objecte de tipus "NombreEnter".
     * @param nom Nom identificatiu de l'objecte.
     * @param val Valor de tipus "int" de l'objecte.
     */
     public NombreEnter(String nom, int val) {
        super(nom,val);
        valor = val;
    }
     
     /**
     * Retorna la informació corresponent al nom identificatiu de l'element y
     * la seva informació tipus nombre int.
     * @return String Nom de l'element i el seu valor numèric associat.
      * Aqui hauriem de fer una instrospecció perque ens funcionas be el
      * escriure, ja que sinos ens fa malament el escriure per pantalla
      * i en escrit el super.escriure, i aquest seria el de NombreReal i no el
      * que ens interesa que es el de l'element, ja que no es pot fer un super
      * super.
     */
     
     
     protected String escriute(){
       String res = super.escriure();
        res += "  El seu valor enter és: " + valor
                +"\n---------------------\n\n\n";
        
    return res;
    }
    
}
    

