package ual.hmis.sesion05.ejercicio09;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio9 {
	public ArrayList<String> combine(ArrayList<String> list1, ArrayList<String> list2) {
		TreeSet<String> res = new TreeSet<String>();
		for (String string : list1) {
			res.add(string);
		}
		for (String string : list2) {
			res.add(string);
		}
		return new ArrayList<String>( res );
	}
}
