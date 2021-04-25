package ual.hmis.sesion05.ejercicio08;

import java.util.ArrayList;

public class Ferry {
    /**
     * maximum number of passengers.
     */
    private int maximoPasajeros;

    /**
     * maximum number of vehicles.
     */
    private int maximoVehiculos;

    /**
     * maximum weight.
     */
    private double maximoPesoVehiculos;

    /**
     * vehicles.
     */
    private ArrayList<Vehiculo> vehiculos;

    /**
     * @param maximumNumberOfPassengers
     */
    public void setMaximoPasajeros(final int maximumNumberOfPassengers) {
        this.maximoPasajeros = maximumNumberOfPassengers;
    }

    /**
     * @param maximumWeight
     */
    public void setMaximoPesoVehiculos(final double maximumWeight) {
        this.maximoPesoVehiculos = maximumWeight;
    }

    /**
     * @param maximumNumberOfVehicles
     */
    public void setMaximoVehiculos(final int maximumNumberOfVehicles) {
        this.maximoVehiculos = maximumNumberOfVehicles;
    }

    /**
     * @return number of passengers
     */
    public int getNumeroPasajeros() {
        return vehiculos.stream().mapToInt(v -> v.getNumeroPasajeros()).sum();
    }

    /**
     * @return vehicle's weight
     */
    public double getPesoVehiculos() {
        return vehiculos.stream().mapToDouble(v -> v.getPesoVehiculo()).sum();
    }

    /**
     * @param listOfVehicles
     */
    public void setVehiculos(final ArrayList<Vehiculo> listOfVehicles) {
        this.vehiculos = listOfVehicles;
    }

    /**
     * @param v
     * @return if shipment
     */
    boolean embarcarVehiculo(final Vehiculo v) {
        if (superadoMaximoVehiculos()) {
            return false;
        }
        if (superadoMaximoPeso(v)) {
            return false;
        }
        if (getNumeroPasajeros() + v.getNumeroPasajeros() > maximoPasajeros) {
            return false;
        }
        return vehiculos.add(v);
    }

    /**
     * @return number of vehicles
     */
    int totalVehiculos() {
        return vehiculos.size();
    }

    /**
     * @return if empty
     */
    boolean vacio() {
        return totalVehiculos() == 0;
    }

    /**
     * @return if maximum number of vehicles passed
     */
    boolean superadoMaximoVehiculos() {
        return totalVehiculos() + 1 > maximoVehiculos;
    }

    /**
     * @param v
     * @return if weight maximum passed
     */
    boolean superadoMaximoPeso(final Vehiculo v) {
        return getPesoVehiculos() + v.getPesoVehiculo() > maximoPesoVehiculos;
    }
}
