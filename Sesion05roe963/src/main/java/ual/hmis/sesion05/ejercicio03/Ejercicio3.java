package ual.hmis.sesion05.ejercicio03;

public class Ejercicio3 {
	public String print(int n) {
		if (n < 0)
			return "número erróneo";
		if (n < 5)
			n = 5;
		if (n > 12)
			n = 12;
		
		String s = "";
		for (int i = 0; i < n; i++) {
			s += '*';
		}
		return s;
	}
}
