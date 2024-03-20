package es.rodrigo.Models;

import es.rodrigo.interfaces.Imprimibledos;

public class Mensaje implements Imprimibledos {

	private String _mensaje;
	
	public Mensaje(String mensaje) {
        this._mensaje = mensaje;
    }

    public void imprimirMensaje() {
        System.out.println(_mensaje);
    }

	@Override
	public void imprimirMensajedos() {
		// TODO Auto-generated method stub
		System.out.println(_mensaje);
	}   
}
