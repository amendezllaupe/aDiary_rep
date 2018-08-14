package aDiary;

import java.util.ArrayList;

import aDiary_data.Dato;
import aDiary_data.ManejoDatos;

public class Login {

	private String nombreIngresado;
	private String contrasenaIngresada;

	public Login() {
		// TODO - implement Login.Login
		
	}

	public String getNombreIngresado() {
		return this.nombreIngresado;
	}

	/**
	 * 
	 * @param nombreIngresado
	 */
	public void setNombreIngresado(String nombreIngresado) {
		this.nombreIngresado = nombreIngresado;
	}

	public String getContrasenaIngresada() {
		return this.contrasenaIngresada;
	}

	/**
	 * 
	 * @param contrasenaIngresada
	 */
	public void setContrasenaIngresada(String contrasenaIngresada) {
		this.contrasenaIngresada = contrasenaIngresada;
	}

	public boolean validarLogin() {
		ManejoDatos manejo = new ManejoDatos();
		manejo.solicitarDatos("./usrdata/usuarios.xlsx");
		ArrayList<Dato> data = manejo.getDatos();
		Dato usrLogin = buscarUsuario(data);
		if(usrLogin != null) {
			if(compararContrase�as(data, usrLogin)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean compararContrase�as(ArrayList<Dato> datos, Dato dato) {
		return datos.get(dato.getFila()*5+1).getContenido().equals(this.contrasenaIngresada);
	}

	private Dato buscarUsuario(ArrayList<Dato> datos) {
		// TODO - implement Login.buscarUsuaro
		
		for(int i = 0; i<datos.size(); i++) {
			//Primera condicion compara el string con el dato
			//segunda condicion solo acepta la operacion si la columna corresponde al usuario.
			if(datos.get(i).getContenido().equals(this.nombreIngresado) && datos.get(i).getColumna() == 0) {
				return datos.get(i);
				
			}
		}
		return null;
	}
}