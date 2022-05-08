package org.cuatrovientos.ed;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Repeatable;

import org.junit.Before;
import org.junit.Test;




class GeneradoIpTest1 {
	GenerarIp generador;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	void testGenerarIp() {
		generador.generarIp();
		assertFalse(generador.generarIp().charAt(0) == '0' || generador.generarIp().charAt(15) == '0' || generador.generarIp().charAt(0) == '255' || generador.generarIp().charAt(15) == '255'  );
	}
	
	@Repeatable(1000)
	void testGenerarNumero() {
		generador.GenerarNumero(0, 255);
		assertTrue(	generador.GenerarNumero(0, 255) > 0 && generador.GenerarNumero(0, 255) < 255 );
	}
	
	

}
