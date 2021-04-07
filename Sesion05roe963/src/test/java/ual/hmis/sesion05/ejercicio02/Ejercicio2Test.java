package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({ "'',pass,false", "user,'',false", "nombredeusuariossuperlagruisimomayorde30caraceteres,pass,false",
			"user,unsuperpasswordlarguisimoconmasde30caracteresgigantedelto,false", "user,Pas5,true", "user,pass,false",
			"user,Pas5wordincorrect,false", "usuario,Pas5,false" })

	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale {2}")
	void testLogin_parametrized(String username, String password, String result) {
		Ejercicio2 e2 = new Ejercicio2();
		assertEquals(Boolean.parseBoolean(result), e2.login(username, password));
	}

}
