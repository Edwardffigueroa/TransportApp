package com.accenture.logic;

import com.accenture.bd.BdService;
import com.accenture.ui.Ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Logica {

    BdService bd;
    Ui ui;

    ArrayList<Vehiculo> vehiculos;

    public Logica() {

        vehiculos = new ArrayList<Vehiculo>();
    }

    public void crear(){

        try {
            bd = new BdService(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ui = new Ui(this);

       // bd.read();
        ui.seleccionarOptiones();


    }


    public void crearVehiculo(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas){

        if(tipoVehiculo =="Carro"){
            Vehiculo carro = new Carro(tipoVehiculo,marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
            vehiculos.add(carro);
            bd.write(carro);
        }

        if(tipoVehiculo =="Bus"){
            Vehiculo carro = new Bus(tipoVehiculo,marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
            vehiculos.add(carro);
            bd.write(carro);
        }

        if(tipoVehiculo =="Batimovil"){
            Vehiculo carro = new Batimovil(tipoVehiculo,marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
            vehiculos.add(carro);
            bd.write(carro);
        }
        if(tipoVehiculo =="Motocarro"){
            Vehiculo carro = new Motocarro(tipoVehiculo,marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
            vehiculos.add(carro);
            bd.write(carro);
        }
        if(tipoVehiculo =="Motocileta"){
            Vehiculo carro = new Motocicleta(tipoVehiculo,marca, color, nombreVehiculo, modelo, velocidadMaxima, numeroAsientos, ciudadDestino, tipoConductor, numeroRuedas);
            vehiculos.add(carro);
            bd.write(carro);
        }


    }

    public void interactuar(){

            for (int i = 0; i <vehiculos.size() ; i++) {
                Vehiculo v = vehiculos.get(i);

                if (v instanceof Carro ){

                    Carro c = (Carro) v;

                    c.moverse();
                    c.autodestruirse();
                    c.chocarse();
                    c.chocarse(vehiculos.get(i+1));
                    c.tanquear();
                    c.tanquear(3000);
                    c.viajar();
                    c.viajar(c.getCiudadDestino());

                }

                if (v instanceof Bus ){

                    Bus b = (Bus) v;

                    b.moverse();
                    b.autodestruirse();
                    b.chocarse();
                    b.chocarse(vehiculos.get(0));
                    b.tanquear();
                    b.tanquear(3000);
                    b.viajar();
                    b.viajar(b.getCiudadDestino());

                }
                if (v instanceof Batimovil ){

                    Batimovil ba = (Batimovil) v;

                    ba.moverse();
                    ba.autodestruirse();
                    ba.chocarse();
                    ba.chocarse(vehiculos.get(i+1));
                    ba.tanquear();
                    ba.tanquear(3000);
                    ba.viajar();
                    ba.viajar(ba.getCiudadDestino());

                }
                if (v instanceof Motocarro ){

                    Motocarro mot = (Motocarro) v;

                    mot.moverse();
                    mot.autodestruirse();
                    mot.chocarse();
                    mot.chocarse(vehiculos.get(i+1));
                    mot.tanquear();
                    mot.tanquear(3000);
                    mot.viajar();
                    mot.viajar(mot.getCiudadDestino());

                }
                if (v instanceof Motocicleta ){

                    Motocicleta mo = (Motocicleta) v;

                    mo.moverse();
                    mo.autodestruirse();
                    mo.chocarse();
                    mo.chocarse(vehiculos.get(i+1));
                    mo.tanquear();
                    mo.tanquear(3000);
                    mo.viajar();
                    mo.viajar(mo.getCiudadDestino());

                }
            }

    }



}
