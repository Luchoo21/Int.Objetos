package Comercio;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Odontologos{
	private String nombre;
	private String apellido;
	private int matricula;
	
	public Odontologos(String nombre, String apellido, int matricula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
