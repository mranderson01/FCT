package es.rodrigo;
import es.rodrigo.Models.*;
import es.rodrigo.interfaces.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Imprimibledos mensaje = new Mensaje("Hola, esto esto se a inprimido!");
		Impresora impresora = new Impresora(mensaje);
		 
	    impresora.imprimir();
	}

}
