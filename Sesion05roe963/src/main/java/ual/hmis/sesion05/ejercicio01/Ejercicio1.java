package ual.hmis.sesion05.ejercicio01;

public final class Ejercicio1 {
    /**
     * @param x
     * @return result
     */
    public int transformar(final int x) {
        final int dos = 2;
        final int tres = 3;
        final int cinco = 5;
        int resultado = 0;
        if (x % dos == 0) {
            resultado = transformar(x / dos);
        } else if (x % tres == 0) {
            resultado = transformar(x / tres);
        } else if (x % cinco == 0) {
            resultado = transformar(x / cinco);
        } else {
            resultado = x;
        }
        return resultado;
    }
}
