package es.pildoras.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creacion de objetos empleado
		//Empleados Empleado1 = new JefeEmpleado();
		//Empleados Secretario1 = new SecretarioEmpleado();
		Empleados director1 = new DirectorEmpleado();

		//Uso de los objetos creados 
		//System.out.println( Empleado1.getTareas());
		//System.out.println( Secretario1.getTareas());
		System.out.println( director1.getTareas());
	}

}
