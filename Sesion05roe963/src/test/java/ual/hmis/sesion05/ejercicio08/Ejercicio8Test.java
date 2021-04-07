package ual.hmis.sesion05.ejercicio08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {
	
	@Test
	void testCrearVehiculoyFerryVacio() {
		Ferry f = new Ferry();
		f.setMaximoPasajeros(4);
		f.setMaximoPesoVehiculos(10.0);
		f.setMaximoVehiculos(3);
		f.setVehiculos(new ArrayList<Vehiculo>());
		assertTrue(f.vacio());
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(2);
		v.setPesoVehiculo(0.5);
		f.embarcarVehiculo(v);
		assertFalse(f.vacio());
	}

	@MethodSource("provider")
	@ParameterizedTest
	void testEmbarcar(Ferry f, Vehiculo v, Boolean expected) {
		assertEquals(expected, f.embarcarVehiculo(v));
	}

	static Stream<Arguments> provider() {
		Ferry f = new Ferry();
		f.setMaximoPasajeros(4);
		f.setMaximoPesoVehiculos(10.0);
		f.setMaximoVehiculos(3);
		f.setVehiculos(new ArrayList<Vehiculo>() {
			{
				add(new Vehiculo(1, 1.5));
			}
		});

		return Stream.of(
				Arguments.of(f, new Vehiculo(1, 2.5), true),
				Arguments.of(f, new Vehiculo(1, 9.5), false),
				Arguments.of(f, new Vehiculo(4, 1.5), false),
				Arguments.of(f, new Vehiculo(1, 1.5), true),
				Arguments.of(f, new Vehiculo(1, 1.5), false)
		);
	}
}
