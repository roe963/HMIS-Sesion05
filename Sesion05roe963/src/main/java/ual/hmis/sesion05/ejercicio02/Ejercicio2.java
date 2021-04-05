package ual.hmis.sesion05.ejercicio02;

import java.util.Arrays;

public class Ejercicio2 {
	public boolean login(String username, String password) {
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >= 30)
			return false;
		// comprobar que la contraseña contenga una mayúscula, una minúscula y un dígito
		int[] counter = { 0, 0, 0 };
		password.chars().mapToObj(c -> (int) c).forEach(c -> {
			if (Character.isUpperCase(c))
				counter[0]++;
			if (Character.isLowerCase(c))
				counter[1]++;
			if (Character.isDigit(c))
				counter[2]++;
		});
		if (Arrays.stream(counter).min().orElse(0) == 0)
			return false;
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD(String username, String password) {
		// método mock (simulado)
		if (username.equals("user") && password.equals("Pas5"))
			return true;
		else
			return false;
	}
}
