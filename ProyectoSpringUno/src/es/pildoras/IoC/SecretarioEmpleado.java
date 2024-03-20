package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	//Esto es un Setter
	private CreacionInformes informeNuevo;  
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	
	private String email;
	private String nombreEmpresa;
	
	public void metodoInicial() {
		System.out.println("dentro del metodo bean, antes de usar el bean");
	}
	public void metodofinal() {
		System.out.println("dentro del metodo bean, despues de utiliza el bean");
	}
	
	@Override
	public String getTareas() { 
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getIforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario "+ informeNuevo.getIforme();
	}
	
	//GETTER Y SETTERS
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}
	
	
}
