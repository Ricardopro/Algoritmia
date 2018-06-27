
package llistapolivalent;

import llistapolivalent.llista.Conjunt;

/**
 * Classe inicial de l'aplicació.
 * @author Ricardo Bibiloni
 * @version 1.0.02.
 */
public class Main {
    /**
     * Aquí és a on guardam la col·lecció dels diferents elements.
     */
    private Conjunt conj;

    /**
     * Constructor de la classe que s'instancia des de el programa principal.
     */
    private Main() {
        conj = new Conjunt();
    }

    /**
     * Métode que inicia tota la tasca de test del sistema.
     */
    private void iniciar() {
        //a continuació, hi ha un parell de mostres que he utilitzat per fer
        //les proves per provar si anava be el insertar i el mostrar.
        
        conj.posar("El primer valor", 83.3);
        //conj.mostrarelement(0);
        //conj.posar("Primer misatge", "Som el primer missatge");
        //conj.posar("El segon valor", -17.14);
        conj.mostrarelement(0);
        //conj.eliminar(1);
        //conj.posar("Segon misatge", "Som el segon missatge");
        //conj.posar("Tercer misatge", "Som el tercer missatge");
        //conj.vaciartodo();
        //conj.mostrartot();
        System.out.println(conj.mostrarmida());
        //System.out.println(conj.getMida());
       
        //System.out.println(conj.getInfoTotal());
    }

    /**
     * Mètode que invoca el SO per arrancar el programa a la JVM.
     * @param args Paràmetres que es passen des de el SO, aquí no n'hi ha cap.
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.iniciar();
    }
}
 