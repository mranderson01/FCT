package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados Rodrigo = contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(Rodrigo.getTareas());
		System.out.println(Rodrigo.getIforme());*/
		
		SecretarioEmpleado secretario = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		DirectorEmpleado director = contexto.getBean("miEmpleado",DirectorEmpleado.class);

		System.out.println(secretario.getEmail());  
		System.out.println(director.getEmail());

	}
}
