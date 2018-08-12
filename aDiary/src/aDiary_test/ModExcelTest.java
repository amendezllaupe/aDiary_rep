package aDiary_test;

import static org.junit.Assert.*;

import org.junit.Test;

import aDiary_data.ModExcel;

public class ModExcelTest {

	@Test
	public void testModificarCeldaLlena() {
		ModExcel mod = new ModExcel("Antonio", "Test2");
		assertTrue(mod.modificarCelda("./usrdata/usuarios.xlsx",0));
		
	}
	
	@Test
	public void testA�adirCeldas() {
		ModExcel mod = new ModExcel("Test2", "");
		mod.prepararCeldas("./usrdata/usuarios.xlsx", 2);
		System.out.println(mod.modificarCelda("./usrdata/usuarios.xlsx",0));
		
		mod.setValorNuevo("Contrase�a2");
		mod.setValorACambiar("");
		System.out.println(mod.modificarCelda("./usrdata/usuarios.xlsx",0));
	}

}
