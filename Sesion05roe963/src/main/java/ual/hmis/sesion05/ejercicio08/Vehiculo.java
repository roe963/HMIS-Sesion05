package ual.hmis.sesion05.ejercicio08;

public class Vehiculo {
	private int numeroPasajeros;
	private int numeroRuedas;
	private double pesoVehiculo;

	public Vehiculo() {
		super();
	}

	public Vehiculo(int numeroPasajeros, double pesoVehiculo) {
		super();
		this.numeroPasajeros = numeroPasajeros;
		this.pesoVehiculo = pesoVehiculo;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public double getPesoVehiculo() {
		return pesoVehiculo;
	}

	public void setPesoVehiculo(double pesoVehiculo) {
		this.pesoVehiculo = pesoVehiculo;
	}
}
