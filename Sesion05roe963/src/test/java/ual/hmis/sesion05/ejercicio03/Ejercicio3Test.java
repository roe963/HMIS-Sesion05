package ual.hmis.sesion05.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio01.Ejercicio1;

class Ejercicio3Test {

	@CsvSource({ "-1, número erróneo", "1, *****", "7, *******", "13, ************" })
	
	@ParameterizedTest(name = "{index} => Con valor ({0}) sale {1}")
	void test(String value, String result) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(c.print(Integer.parseInt(value)), result);
	}

}
