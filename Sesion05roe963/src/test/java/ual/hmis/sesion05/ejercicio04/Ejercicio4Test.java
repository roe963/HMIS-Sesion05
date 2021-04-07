package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio01.Ejercicio1;
import ual.hmis.sesion05.ejercicio04.Ejercicio4;

class Ejercicio4Test {

	@CsvSource({ "aaa, bbb, ''", "aaa, abb, a", "abc, abb, ab", "'', abb, ''" })
	
	@ParameterizedTest(name = "{index} => Con P1 ({0}) y P2 ({1}) sale {2}")
	void test(String P1, String P2, String result) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(c.combine(P1, P2), result);
	}

}
