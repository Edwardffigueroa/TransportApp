package com.accenture.logic;

public class Bus extends Vehiculo implements MedioTransporte {

    public Bus(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        super(tipoVehiculo, marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
    }
    @Override
    public void moverse() {

        System.out.println("El Batimovil se està moviendo rápidamente hacia donde batman");

    }

    @Override
    public void autodestruirse() {

        System.out.println("El Bus se está incendiando con pasajeros dentro de él");

    }

    @Override
    public void chocarse() {

        System.out.println("El Bus se acaba de chocar con algún peaton");

    }

    @Override
    public void chocarse(Vehiculo v) {

        System.out.println("El Bus se acaba de chocar con: " + v.getTipoVehiculo());

    }

    @Override
    public void tanquear() {

        System.out.println("El Bus se tanqueó con Agua");

    }

    @Override
    public void tanquear(int cuanto) {
        System.out.println("el Bus acaba de llenar su tanque: $ "+cuanto );
    }

    @Override
    public void viajar() {

        System.out.println("El Bus está viajando para donde le indica su ruta");

    }

    @Override
    public void viajar(String destino) {

        System.out.println("el Bus está llevando pasajeros a: " + destino);

    }
}
