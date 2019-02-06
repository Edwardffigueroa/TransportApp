package com.accenture.logic;

public class Batimovil extends Vehiculo implements MedioTransporte {


    public Batimovil(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        super(tipoVehiculo, marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
    }


    @Override
    public void moverse() {

        System.out.println("El Batimovil se està moviendo rápidamente hacia donde batman");

    }

    @Override
    public void autodestruirse() {

        System.out.println("El Batimovil se destruyó después de haber llegado a la casa de Batman");

    }

    @Override
    public void chocarse() {

        System.out.println("El Batimovil se chocó en la entrada de la casa de Venom");

    }

    @Override
    public void chocarse(Vehiculo v) {

        System.out.println("El Batimovil se acaba de chocar con: " + v.getTipoVehiculo());

    }

    @Override
    public void tanquear() {

        System.out.println("El Batimóvil no necesita gasolina, él se mueve por Amor");

    }

    @Override
    public void tanquear(int cuanto) {
        System.out.println("el Batimóvil acaba de tanquear: $ "+cuanto );
    }

    @Override
    public void viajar() {

        System.out.println("El Batimóvil está perdido sin saber a donde viajar");

    }

    @Override
    public void viajar(String destino) {

        System.out.println("el Batimóvil se abrió para: " + destino);

    }
}
