package aDiary_test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import aDiary.CreacionUsuario;

public class CreacionUsuarioTest {

	@Test
	public void test() {
		CreacionUsuario creacion = new CreacionUsuario();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario = scan.nextLine();
		
		System.out.println("Contrase�a: ");
		String contrase�a = scan.nextLine();
		
		System.out.println("Verificar Contrase�a");
		String verificador = scan.nextLine();
		
		creacion.setNombreUsrNuevo(usuario);
		creacion.setContrasenaUsrNuevo(contrase�a);
		if(creacion.crearUsuario(verificador) != null) {
			System.out.println("Exito");
			creacion.guardarUsuario();
		}else {
			System.out.println("Fallo");
		}
	}

}
