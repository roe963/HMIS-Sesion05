package ual.hmis.sesion05.ejercicio4;

import java.util.HashSet;

public class Ejercicio4 {
	public String combine(String P1, String P2) {
		HashSet<Character> result = new HashSet<Character>();
//		String result = "";
		P1.chars().forEach(c -> {
//			if (!result.contains((char)c)) {
				if (P2.contains(String.valueOf((char)c)))
					result.add((char)c);
//			}
		});
		return result.toString().replaceAll("\\W", "");
	}

}
