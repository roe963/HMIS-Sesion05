package ual.hmis.sesion05.ejercicio08;

public class Vehiculo {
    /**
     * number of passengers.
     */
    private int numeroPasajeros;
    /**
     * weight.
     */
    private double pesoVehiculo;

    /**
     * Empty constructor.
     */
    public Vehiculo() {
    }

    /**
     * @param numberOfPassengers
     * @param weight
     */
    public Vehiculo(final int numberOfPassengers, final double weight) {
        super();
        this.numeroPasajeros = numberOfPassengers;
        this.pesoVehiculo = weight;
    }

    /**
     * @return number of passengers
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * @param numberOfPassengers
     */
    public void setNumeroPasajeros(final int numberOfPassengers) {
        this.numeroPasajeros = numberOfPassengers;
    }

    /**
     * @return weight
     */
    public double getPesoVehiculo() {
        return pesoVehiculo;
    }

    /**
     * @param weight
     */
    public void setPesoVehiculo(final double weight) {
        this.pesoVehiculo = weight;
    }
}
