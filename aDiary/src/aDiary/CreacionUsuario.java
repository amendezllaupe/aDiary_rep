package aDiary;

import aDiary_data.ManejoDatos;

public class CreacionUsuario {

	
	private String nombreUsrNuevo;
	private String contrasenaUsrNuevo;

	public CreacionUsuario() {
		// TODO - implement CreacionUsuario.CreacionUsuario
		
	}

	

	public String getNombreUsrNuevo() {
		return this.nombreUsrNuevo;
	}

	/**
	 * 
	 * @param nombreUsrNuevo
	 */
	public void setNombreUsrNuevo(String nombreUsrNuevo) {
		this.nombreUsrNuevo = nombreUsrNuevo;
	}

	public String getContrasenaUsrNuevo() {
		return this.contrasenaUsrNuevo;
	}

	/**
	 * 
	 * @param contrasenaUsrNuevo
	 */
	public void setContrasenaUsrNuevo(String contrasenaUsrNuevo) {
		this.contrasenaUsrNuevo = contrasenaUsrNuevo;
	}

	/**
	 * 
	 * @param contrase�aVerificadora
	 */
	private boolean verificarContrase�a(String contrase�aVerificadora) {
		// TODO - implement CreacionUsuario.verificarContrasena
		return contrase�aVerificadora.equals(contrasenaUsrNuevo);
		
	}

	/**
	 * 
	 * @param contrase�aVerificadora
	 */
	public Propietario crearUsuario(String contrase�aVerificadora) {
		// TODO - implement CreacionUsuario.crearUsuario
		if(verificarContrase�a(contrase�aVerificadora)) {
			Propietario usr = new Propietario();
			usr.setNombre(this.nombreUsrNuevo);
			usr.setContrasena(this.nombreUsrNuevo);
			return usr;
		}
		return null;
	}

	public void guardarUsuario() {
		// TODO - implement CreacionUsuario.guardarUsuario
		ManejoDatos manejo = new ManejoDatos();
		manejo.a�adirUsuario(this.getNombreUsrNuevo(), this.getContrasenaUsrNuevo(), 0);
	}

	/**
	 * 
	 * @param perfil
	 */
	public void a�adirPerfil(String perfil) {
		// TODO - implement CreacionUsuario.a�adirPerfil
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param activado
	 */
	public void activarControlParental(boolean activado) {
		// TODO - implement CreacionUsuario.activarControlParental
		throw new UnsupportedOperationException();
	}

}