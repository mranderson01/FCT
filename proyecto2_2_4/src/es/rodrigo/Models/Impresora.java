package es.rodrigo.Models;

//import es.rodrigo.interfaces.Imprimible;
import es.rodrigo.interfaces.Imprimibledos;

public class Impresora{
	
    private Imprimibledos imprimible;

    public Impresora(Imprimibledos imprimible) {
        this.imprimible = imprimible;
    }

    public void imprimir() {
        imprimible.imprimirMensajedos();
    }
}