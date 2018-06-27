package llistapolivalent.llista;

/**
 * Objecte extés d'"Element" que conté informació tupus nombre real.
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public class NombreReal extends Element {

    /**
     * Informació tipus nombre real que te aquest objecte derivat d'"Element".
     */
    private double valor;

    /**
     * Constructor d'un objecte de tipus "NombreReal".
     * @param nom Nom identificatiu de l'objecte.
     * @param val Valor de tipus "double" de l'objecte.
     */
    public NombreReal(String nom, double val) {
        super(nom);
        valor = val;
    }

    /**
     * Retorna la informació corresponent al nom identificatiu de l'element y
     * la seva informació tipus nombre real.
     * @return String Nom de l'element i el seu valor numèric associat.
     */
        
    protected String escriure() {
        String res = super.escriure();
        res += "  El seu valor real és: " + valor
                + "\n---------------------\n\n\n";
        return res;
    }
}
