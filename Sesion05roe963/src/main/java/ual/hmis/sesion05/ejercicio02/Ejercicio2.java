package ual.hmis.sesion05.ejercicio02;

import java.util.Arrays;

public class Ejercicio2 {
    /**
     * @param username
     * @param password
     * @return if login
     */
    public boolean login(final String username, final String password) {
        final int size = 30;
        // comprobar que sean distintos de vacio
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // comprobar que la longitud sea < 30
        if (username.length() >= size || password.length() >= size) {
            return false;
        }
        // comprobar que la contraseña contenga una mayúscula,
        // una minúscula y un dígito
        int[] counter = {0, 0, 0};
        password.chars().mapToObj(c -> (int) c).forEach(c -> {
            if (Character.isUpperCase(c)) {
                counter[0]++;
            }
            if (Character.isLowerCase(c)) {
                counter[1]++;
            }
            if (Character.isDigit(c)) {
                counter[2]++;
            }
        });
        if (Arrays.stream(counter).min().orElse(0) == 0) {
            return false;
        }
        // llamar al método de la bbdd
        return compruebaLoginEnBD(username, password);

    }

    /**
     * @param username
     * @param password
     * @return if in bd
     */
    public boolean compruebaLoginEnBD(final String username,
            final String password) {
        // método mock (simulado)
        return username.equals("user") && password.equals("Pas5");
    }
}
