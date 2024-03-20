package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//creacion de campo tipo creaciónInforme (Interfaz) 
	private CreacionInformes _informeNuevo;
			
	
	//creacion del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this._informeNuevo = informeNuevo;
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
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getIforme() { 
		return "Informe creado por el Director: " + _informeNuevo.getIforme();
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
		return _informeNuevo;
	} 
}
