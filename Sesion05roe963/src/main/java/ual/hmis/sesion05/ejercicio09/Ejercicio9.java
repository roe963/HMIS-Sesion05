package ual.hmis.sesion05.ejercicio09;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio9 {
    /**
     * @param list1
     * @param list2
     * @return combined
     */
    public ArrayList<String> combine(final ArrayList<String> list1,
            final ArrayList<String> list2) {
        TreeSet<String> res = new TreeSet<String>();
        for (String string : list1) {
            res.add(string);
        }
        for (String string : list2) {
            res.add(string);
        }
        return new ArrayList<String>(res);
    }
}
