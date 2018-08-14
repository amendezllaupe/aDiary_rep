package aDiary;

import aDiary_data.ManejoDatos;

public class CreacionUsuario {

	
	private String nombreUsrNuevo;
	private String contrasenaUsrNuevo;
	private String contrase�aParentalUsrNuevo;
	private String perfilNuevo;

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
			usr.setContrasena(this.contrasenaUsrNuevo);
			usr.SetContrasenaControlParental(contrase�aParentalUsrNuevo);
			
			usr.setPerfilActivo(this.perfilNuevo);
			usr.getPerfiles().add(this.perfilNuevo);
			
			return usr;
		}
		return null;
	}

	public void guardarUsuario(Propietario usr) {
		// TODO - implement CreacionUsuario.guardarUsuario
		ManejoDatos manejo = new ManejoDatos(usr);
		manejo.a�adirUsuario(this.nombreUsrNuevo, this.contrasenaUsrNuevo, this.perfilNuevo,usr.getEstadoControlParental(), this.contrase�aParentalUsrNuevo, 0);
		manejo.crearArchivosPerfil(usr.getPerfilActivo());
		manejo.crearExcelRecompensa();
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
	public void activarControlParental(Propietario usr, boolean activado) {
		// TODO - implement CreacionUsuario.activarControlParental
		usr.setEstadoControlParental(activado);
	}



	public String getPerfilNuevo() {
		return perfilNuevo;
	}



	public void setPerfilNuevo(String perfilNuevo) {
		this.perfilNuevo = perfilNuevo;
	}



	public String getContrase�aParentalUsrNuevo() {
		return contrase�aParentalUsrNuevo;
	}



	public void setContrase�aParentalUsrNuevo(String contrase�aParentalUsrNuevo) {
		this.contrase�aParentalUsrNuevo = contrase�aParentalUsrNuevo;
	}
	
	

}