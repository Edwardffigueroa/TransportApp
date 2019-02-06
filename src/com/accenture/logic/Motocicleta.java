package com.accenture.logic;

public class Motocicleta extends Vehiculo implements MedioTransporte {

    public Motocicleta(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        super(tipoVehiculo, marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
    }

    @Override
    public void moverse() {

        System.out.println("La Motocicleta va al soco por toda la avenida norte");

    }

    @Override
    public void autodestruirse() {

        System.out.println("La Motocicleta se autodestruyó después de Atropellar un vehículo de"+ numeroAsientos);

    }

    @Override
    public void chocarse() {

        System.out.println("La Motocicleta se chocó y punto");

    }

    @Override
    public void chocarse(Vehiculo v) {

        System.out.println("La Motocicleta se volvió #%$SF3 por chocar con: " + v.getTipoVehiculo());

    }

    @Override
    public void tanquear() {

        System.out.println("La Motocicleta está tanqueando en el rio");

    }

    @Override
    public void tanquear(int cuanto) {
        System.out.println("La Motocicleta acaba de tanquear: $ "+cuanto );
    }

    @Override
    public void viajar() {

        System.out.println("La Motocicleta está viajando con un grupo de Moteros");

    }

    @Override
    public void viajar(String destino) {

        System.out.println("La Motocicleta va en una caravana hacia " + destino);

    }
}
