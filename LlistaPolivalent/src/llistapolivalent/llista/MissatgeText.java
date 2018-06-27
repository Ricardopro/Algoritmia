package llistapolivalent.llista;

/**
 * Objecte extés d'"Element" que conté informació tupus text.
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public class MissatgeText extends Element {

    /**
     * Informació tipus text que guarda aquest objecte derivat d'"Element".
     */
    private String missatge;

    /**
     * Constructor d'un objecte de tipus "MissatgeText".
     * @param nom Nom identificatiu de l'objecte.
     * @param m Informació de tipus text a guardar a l'objecte.
     */
    public MissatgeText(String nom, String m) {
        super(nom);
        missatge = m;
    }

    /**
     * Retorna la informació corresponent al nom identificatiu de l'element y
     * la seva informació tipus text associada.
     * @return String Nom de l'element i el seu text associat.
     */
    protected String escriure() {
        String res = super.escriure();
        res += "  El seu missatge és: " + missatge
                + "\n---------------------\n\n\n";
        return res;
    }
}
