package es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//carga de xML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Peticiones de beans al contenedor spring
		
		Empleados secretario1 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		Empleados secretario2 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(secretario1);
		System.out.println(secretario2);

	}

}
