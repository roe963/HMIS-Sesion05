package ual.hmis.sesion05.ejercicio03;

public class Ejercicio3 {
    /**
     * @param n
     * @return **..n
     */
    public String print(final int n) {
        final int cero = 0;
        final int cinco = 5;
        final int doce = 12;
        int aux = n;
        if (n < cero) {
            return "número erróneo";
        }
        if (n < cinco) {
            aux = cinco;
        }
        if (n > doce) {
            aux = doce;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < aux; i++) {
            sb.append('*');
        }

        return sb.toString();
    }
}
