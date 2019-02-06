package com.accenture.logic;

public class Carro extends Vehiculo implements MedioTransporte {

    public Carro(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        super(tipoVehiculo, marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
    }

    @Override
    public void moverse() {

        System.out.println("El carro se està moviendo suavemente");

    }

    @Override
    public void autodestruirse() {

        System.out.println("El carro se està autodestruyendo");

    }

    @Override
    public void chocarse() {

        System.out.println("El carro se acaba de chocar con algo");

    }

    @Override
    public void chocarse(Vehiculo v) {

        System.out.println("El carro se acaba de chocar con: " + v.getTipoVehiculo());

    }

    @Override
    public void tanquear() {

        System.out.println("El carro está tanqueando en algún lado");

    }

    @Override
    public void tanquear(int cuanto) {
        System.out.println("el carro acaba de tanquear: $ "+cuanto );
    }

    @Override
    public void viajar() {

        System.out.println("El carro está viajando para algún lado");

    }

    @Override
    public void viajar(String destino) {

        System.out.println("el carro se abrió para: " + destino);

    }
}
