package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	public int convertirCadenaEntero(String cad) {
		int aux = 0;
		if (cad.matches("\\+?\\-?\\d+")) {
			aux = (int) Integer.parseInt(cad);
			if (aux > 0)
				return aux > Short.MAX_VALUE ? Short.MAX_VALUE : aux;
			else
				return aux < Short.MIN_VALUE ? Short.MIN_VALUE : aux;
		} else
			throw new NumberFormatException("Texto no válido!");
	}
}
