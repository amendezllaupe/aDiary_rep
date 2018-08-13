package aDiary_test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import aDiary.CreacionUsuario;
import aDiary.Propietario;

public class CreacionUsuarioTest {

	@Test
	public void test() {
		ManejoDatosTest init = new ManejoDatosTest();
		
		init.testInit();
		
		CreacionUsuario creacion = new CreacionUsuario();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario = scan.nextLine();
		
		System.out.println("Contrase�a: ");
		String contrase�a = scan.nextLine();
		
		System.out.println("Verificar Contrase�a");
		String verificador = scan.nextLine();
		
		System.out.println("Creando perfil de administrador");
		
		System.out.println("Contrase�a control parental:");
		String controlParental = scan.nextLine();
		
		boolean estadoControlParental = false;
		
		creacion.setNombreUsrNuevo(usuario);
		creacion.setContrasenaUsrNuevo(contrase�a);
		creacion.setPerfilNuevo("admin-" + usuario);
		creacion.setContrase�aParentalUsrNuevo(controlParental);
		Propietario usr = creacion.crearUsuario(verificador);
		
		if(usr != null) {
			System.out.println("Exito");
			creacion.guardarUsuario(usr);
			System.out.println(usr.getPerfilActivo());
		}else {
			System.out.println("Fallo");
		}
	}

}
