package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio10Test {

	@CsvSource({ 
		"'+5', 5", 
		"'-5', -5", 
		"'100000', 32767", 
		"'32767', 32767", 
		"'-32768', -32768", 
		"'-100000', -32768" 
		})

	@ParameterizedTest(name = "{index} => Con entrada ''{0}'' sale {1}")
	void testTransformar(String input, int expected) {
		Ejercicio10 c = new Ejercicio10();
		assertEquals(expected, c.convertirCadenaEntero(input));
	}

	@Test
	void exceptionTest() {
		Ejercicio10 e10 = new Ejercicio10();
		assertThrows(NumberFormatException.class, () -> e10.convertirCadenaEntero("HOLA MUNDO!"));
	}

}
