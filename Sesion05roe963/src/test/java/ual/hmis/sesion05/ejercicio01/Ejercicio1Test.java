package ual.hmis.sesion05.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio01.Ejercicio1;

class Ejercicio1Test {

	@CsvSource({ "2, 1", "10, 1", "6, 1", "14, 7" })
	
	@ParameterizedTest(name = "{index} => Con entrada ({0}) sale {1}")
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}

}
