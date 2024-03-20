package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados director1 = contexto.getBean("miEmpleado",Empleados.class);
 		
		System.out.println(director1.getIforme());
		
		contexto.close();
		
	}

}
