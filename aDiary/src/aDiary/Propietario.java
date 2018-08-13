package aDiary;

import java.util.ArrayList;

public class Propietario {

	private String nombre;
	private String contrasena;
	private String contrasenaControlParental;
	private ArrayList<String> perfiles;
	private boolean estadoControlParental;
	private String perfilActivo;

	public Propietario() {
		// TODO - implement Propietario.Propietario
		//throw new UnsupportedOperationException()
		this.perfilActivo = "defecto";
		this.perfiles = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public String getContrasenaControlParental() {
		return this.contrasenaControlParental;
	}

	public ArrayList<String> getPerfiles() {
		return this.perfiles;
	}

	public boolean getEstadoControlParental() {
		return this.estadoControlParental;
	}

	public String getPerfilActivo() {
		return this.perfilActivo;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * 
	 * @param contrasenaControlParental
	 */
	public void SetContrasenaControlParental(String contrasenaControlParental) {
		// TODO - implement Propietario.SetContrasenaControlParenta
		this.contrasenaControlParental = contrasenaControlParental;
	}

	/**
	 * 
	 * @param perfiles
	 */
	public void setPerfiles(ArrayList<String> perfiles) {
		this.perfiles = perfiles;
	}

	/**
	 * 
	 * @param estadoControlParental
	 */
	public void setEstadoControlParental(boolean estadoControlParental) {
		this.estadoControlParental = estadoControlParental;
	}

	/**
	 * 
	 * @param perfilActivo
	 */
	public void setPerfilActivo(String perfilActivo) {
		this.perfilActivo = perfilActivo;
	}
	
	


	@Override
	public String toString() {
		// TODO - implement Propietario.toString
		return 	"Usuario: " + this.nombre + "\n" +
				"Contrase�a: " + this.contrasena + "\n" +
				"Estado de control parental: " + this.estadoControlParental + "\n" +
				"Contrase�a control parental; " + this.contrasenaControlParental + "\n" +
				"Perfil Activo: " + this.perfilActivo;
	} 

}