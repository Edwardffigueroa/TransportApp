package com.accenture.logic;

public class Motocarro extends Vehiculo implements MedioTransporte {

    public Motocarro(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        super(tipoVehiculo, marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
    }

    @Override
    public void moverse() {

        System.out.println("El Motocarro está moviendose cómo loco por toda la ciudad");

    }

    @Override
    public void autodestruirse() {

        System.out.println("El Motocarro se destruyó porque su conductor era un: " + tipoConductor);

    }

    @Override
    public void chocarse() {

        System.out.println("El Motocarro se acaba de chocar con un poste de energía");

    }

    @Override
    public void chocarse(Vehiculo v) {

        System.out.println("El conductor del Motocarro murió justo después de haber chocado con: " + v.getTipoVehiculo());

    }

    @Override
    public void tanquear() {

        System.out.println("El Motocarro no tanqueó y se quedó paila");

    }

    @Override
    public void tanquear(int cuanto) {
        System.out.println("el Motocarro acaba de tanquear: $ "+cuanto );
    }

    @Override
    public void viajar() {

        System.out.println("El Motocarro está viajando por la luna");

    }

    @Override
    public void viajar(String destino) {

        System.out.println("el Motocarro está llevando a un pasajero a: " + destino);

    }



}
