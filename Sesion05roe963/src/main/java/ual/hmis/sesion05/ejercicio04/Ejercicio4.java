package ual.hmis.sesion05.ejercicio04;

import java.util.HashSet;

public class Ejercicio4 {

    /**
     * @param p1
     * @param p2
     * @return combined
     */
    public String combine(final String p1, final String p2) {
        HashSet<Character> result = new HashSet<Character>();
        p1.chars().forEach(c -> {
            if (p2.contains(String.valueOf((char) c))) {
                result.add((char) c);
            }
        });
        return result.toString().replaceAll("\\W", "");
    }

}
