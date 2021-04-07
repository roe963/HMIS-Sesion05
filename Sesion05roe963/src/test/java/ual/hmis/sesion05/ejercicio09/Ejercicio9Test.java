package ual.hmis.sesion05.ejercicio09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio9Test {

	@MethodSource("provider")

	@ParameterizedTest
	void testTransformar(ArrayList<String> inputList1, ArrayList<String> inputList2, ArrayList<String> expectedList) {
		Ejercicio9 c = new Ejercicio9();
		assertEquals(expectedList, c.combine(inputList1, inputList2));
	}

	static Stream<Arguments> provider() {
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("Azul");
				add("Rojo");
				add("Verde");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("Amarillo");
				add("Morado");
				add("Rojo");
			}
		};
		ArrayList<String> list3 = new ArrayList<String>() {
			{
				add("Blanco");
			}
		};
		return Stream.of(
				Arguments.of(list1, list2, new ArrayList<String>() {
					{
						add("Amarillo");
						add("Azul");
						add("Morado");
						add("Rojo");
						add("Verde");
					}
				}),
				Arguments.of(list1, list1, list1),
				Arguments.of(list1, list3, new ArrayList<String>() {
					{
						add("Azul");
						add("Blanco");
						add("Rojo");
						add("Verde");
					}
				}),
				Arguments.of(list3, new ArrayList<String>() {}, list3)
				);
	}
}
