package ual.hmis.sesion05.ejercicio08;

import java.util.ArrayList;

public class Ferry {
	private int maximoPasajeros;
	private int maximoVehiculos;
	private double maximoPesoVehiculos;

	private ArrayList<Vehiculo> vehiculos;

	public void setMaximoPasajeros(int maximoPasajeros) {
		this.maximoPasajeros = maximoPasajeros;
	}

	public void setMaximoPesoVehiculos(double maximoPesoVehiculos) {
		this.maximoPesoVehiculos = maximoPesoVehiculos;
	}
	
	public void setMaximoVehiculos(int maximoVehiculos) {
		this.maximoVehiculos = maximoVehiculos;
	}

	public int getNumeroPasajeros() {
		return vehiculos.stream().mapToInt(v->v.getNumeroPasajeros()).sum();
	}

	public double getPesoVehiculos() {
		return vehiculos.stream().mapToDouble(v->v.getPesoVehiculo()).sum();
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	// Embarca un vehículo añadiéndolo a la lista
	boolean embarcarVehiculo(Vehiculo v) {
		if (superadoMaximoVehiculos())
			return false;
		if (superadoMaximoPeso(v))
			return false;
		if (getNumeroPasajeros() + v.getNumeroPasajeros() > maximoPasajeros)
			return false;
		return vehiculos.add(v);
	}

	// devuelve el número total de vehículos embarcados
	int totalVehiculos() {
		return vehiculos.size();
	}

	// verdadero si no hay ningún vehículo
	boolean vacio() {
		return totalVehiculos() == 0;
	}

	// verdadero si el número total de los vehículos supera el máximo
	boolean superadoMaximoVehiculos() {
		return totalVehiculos()+1 > maximoVehiculos;
	}

	// verdadero si el peso total de los vehículos supera el máximo
	boolean superadoMaximoPeso(Vehiculo v) {
		return getPesoVehiculos()+v.getPesoVehiculo() > maximoPesoVehiculos;
	}
}
