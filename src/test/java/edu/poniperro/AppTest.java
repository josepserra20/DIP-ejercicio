package edu.poniperro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.poniperro.bbdd.InventarioBBDD;
import negocio.ControladorEstoc;

public class AppTest {
    @Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}
}
