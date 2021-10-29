package Comercio;

import java.util.Date;

public class Pacientes {
	private String nombre;
	private String apellido;
	private String domicilio;
	private int DNI;
	private Date FechaAlta;
	private String usuario;
	private String password;
	
	public Pacientes(String nombre, String apellido, String domicilio, int DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.DNI = DNI;
		this.FechaAlta = FechaAlta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public Date getFechaAlta() {
		return FechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		FechaAlta = fechaAlta;
	}
}
