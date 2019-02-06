package com.accenture.ui;

import com.accenture.logic.Logica;

import javax.swing.*;


public class Ui  {

    private Utils utilidades;
    private Logica log;
    private int states =0;

    public Ui(Logica log) {
        this.log=log;
    }

    public void seleccionarOptiones(){

        int seleccionMedios =0;

        String [] mediosT = {"Carro", "Bus","Batimovil", "Motocarro", "Motocileta" };
        seleccionMedios = createMenuOption("Selecciona tu medio de transporte a crear!",mediosT);

        //  System.out.println("Hello World!");
//        System.out.println(mediosT[seleccionMedios]);

        String marca;
        String color;
        String nombreCarro;
        int modelo;
        int kilometraje;
        int asientos;
        String destino;
        String conductor;

        switch (mediosT[seleccionMedios]){

            case "Carro":

                //escogo marca
                 marca = createInputlist("Cual es la marca de tu carro?", utilidades.MARCAS_CARROS);

                //De que color lo queres ve?

                 color = utilidades.COLORES_CARROS[createMenuOption("De que color lo queres ve?", utilidades.COLORES_CARROS)];

                //Ponele un nombre a tu vehiculo!

                 nombreCarro = createInputText("Ponele un nombre a tu vehiculo!");

                //De que año es tu carro?
                modelo = Integer.parseInt( createInputlist("De que año es tu carro?", utilidades.MODELO_CARROS));

                //a cuantos km/h andas?
                 kilometraje = Integer.parseInt( createInputlist("a cuantos km/h andas?", utilidades.KILOMETRAJE_CARROS));

                //Numero De Asientos?
                asientos = Integer.parseInt( createInputlist("Numero De Asientos?", utilidades.ASIENTOS_CARROS));

                //Para donde quieres ir?
                 destino = createInputlist("Para donde quieres ir?", utilidades.DESTINOS_CARROS);

                //Seleciona el tipo de conductor que eres!
                 conductor = createInputlist("Seleciona el tipo de conductor que eres!", utilidades.CONDUCTORES_CARROS);

                //Notificar a la lógica que se creó el objeto
                createMensaje("se creó un carro");

                log.crearVehiculo(mediosT[seleccionMedios],marca,color,nombreCarro,modelo,kilometraje,asientos,destino,conductor,4);



                break;
            case "Bus":

                //escogo marca
                 marca = createInputlist("Cual es la marca de tu carro?", utilidades.MARCAS_CARROS);

                //De que color lo queres ve?

                 color = utilidades.COLORES_CARROS[createMenuOption("De que color lo queres ve?", utilidades.COLORES_CARROS)];

                //Ponele un nombre a tu vehiculo!

                 nombreCarro = createInputText("Ponele un nombre a tu vehiculo!");

                //De que año es tu carro?
                 modelo = Integer.parseInt( createInputlist("De que año es tu carro?", utilidades.MODELO_CARROS));

                //a cuantos km/h andas?
                 kilometraje = Integer.parseInt( createInputlist("a cuantos km/h andas?", utilidades.KILOMETRAJE_CARROS));

                //Numero De Asientos?
                 asientos = Integer.parseInt( createInputlist("Numero De Asientos?", utilidades.ASIENTOS_CARROS));

                //Para donde quieres ir?
                 destino = createInputlist("Para donde quieres ir?", utilidades.DESTINOS_CARROS);

                //Seleciona el tipo de conductor que eres!
                 conductor = createInputlist("Seleciona el tipo de conductor que eres!", utilidades.CONDUCTORES_CARROS);

                //Notificar a la lógica que se creó el objeto
                createMensaje("se creó un carro");

                log.crearVehiculo(mediosT[seleccionMedios],marca,color,nombreCarro,modelo,kilometraje,asientos,destino,conductor,4);
                log.interactuar();
                break;
            case "Batimovil":

                //escogo marca
                 marca = createInputlist("Cual es la marca de tu carro?", utilidades.MARCAS_CARROS);

                //De que color lo queres ve?

                 color = utilidades.COLORES_CARROS[createMenuOption("De que color lo queres ve?", utilidades.COLORES_CARROS)];

                //Ponele un nombre a tu vehiculo!

                 nombreCarro = createInputText("Ponele un nombre a tu vehiculo!");

                //De que año es tu carro?
                 modelo = Integer.parseInt( createInputlist("De que año es tu carro?", utilidades.MODELO_CARROS));

                //a cuantos km/h andas?
                 kilometraje = Integer.parseInt( createInputlist("a cuantos km/h andas?", utilidades.KILOMETRAJE_CARROS));

                //Numero De Asientos?
                 asientos = Integer.parseInt( createInputlist("Numero De Asientos?", utilidades.ASIENTOS_CARROS));

                //Para donde quieres ir?
                 destino = createInputlist("Para donde quieres ir?", utilidades.DESTINOS_CARROS);

                //Seleciona el tipo de conductor que eres!
                 conductor = createInputlist("Seleciona el tipo de conductor que eres!", utilidades.CONDUCTORES_CARROS);

                //Notificar a la lógica que se creó el objeto
                createMensaje("se creó un carro");

                log.crearVehiculo(mediosT[seleccionMedios],marca,color,nombreCarro,modelo,kilometraje,asientos,destino,conductor,4);
                break;
            case "Motocarro":

                //escogo marca
                 marca = createInputlist("Cual es la marca de tu carro?", utilidades.MARCAS_CARROS);

                //De que color lo queres ve?

                 color = utilidades.COLORES_CARROS[createMenuOption("De que color lo queres ve?", utilidades.COLORES_CARROS)];

                //Ponele un nombre a tu vehiculo!

                 nombreCarro = createInputText("Ponele un nombre a tu vehiculo!");

                //De que año es tu carro?
                 modelo = Integer.parseInt( createInputlist("De que año es tu carro?", utilidades.MODELO_CARROS));

                //a cuantos km/h andas?
                 kilometraje = Integer.parseInt( createInputlist("a cuantos km/h andas?", utilidades.KILOMETRAJE_CARROS));

                //Numero De Asientos?
                 asientos = Integer.parseInt( createInputlist("Numero De Asientos?", utilidades.ASIENTOS_CARROS));

                //Para donde quieres ir?
                 destino = createInputlist("Para donde quieres ir?", utilidades.DESTINOS_CARROS);

                //Seleciona el tipo de conductor que eres!
                 conductor = createInputlist("Seleciona el tipo de conductor que eres!", utilidades.CONDUCTORES_CARROS);

                //Notificar a la lógica que se creó el objeto
                createMensaje("se creó un carro");

                log.crearVehiculo(mediosT[seleccionMedios],marca,color,nombreCarro,modelo,kilometraje,asientos,destino,conductor,4);
                break;
            case "Motocileta":

                //escogo marca
                 marca = createInputlist("Cual es la marca de tu carro?", utilidades.MARCAS_CARROS);

                //De que color lo queres ve?

                 color = utilidades.COLORES_CARROS[createMenuOption("De que color lo queres ve?", utilidades.COLORES_CARROS)];

                //Ponele un nombre a tu vehiculo!

                 nombreCarro = createInputText("Ponele un nombre a tu vehiculo!");

                //De que año es tu carro?
                 modelo = Integer.parseInt( createInputlist("De que año es tu carro?", utilidades.MODELO_CARROS));

                //a cuantos km/h andas?
                 kilometraje = Integer.parseInt( createInputlist("a cuantos km/h andas?", utilidades.KILOMETRAJE_CARROS));

                //Numero De Asientos?
                 asientos = Integer.parseInt( createInputlist("Numero De Asientos?", utilidades.ASIENTOS_CARROS));

                //Para donde quieres ir?
                 destino = createInputlist("Para donde quieres ir?", utilidades.DESTINOS_CARROS);

                //Seleciona el tipo de conductor que eres!
                 conductor = createInputlist("Seleciona el tipo de conductor que eres!", utilidades.CONDUCTORES_CARROS);

                //Notificar a la lógica que se creó el objeto
                createMensaje("se creó un carro");

                log.crearVehiculo(mediosT[seleccionMedios],marca,color,nombreCarro,modelo,kilometraje,asientos,destino,conductor,4);
                break;

        }

    }

    public int createMenuOption(String mensaje, String[] arreglo ) {

        return JOptionPane.showOptionDialog(null, mensaje, "TransportApp", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, arreglo, arreglo[0]);

    }

    public String createInputlist(String mensaje, String[] arreglo){

        return (String) JOptionPane.showInputDialog(null, mensaje, "TransportApp", JOptionPane.DEFAULT_OPTION, null, arreglo, arreglo[0]);
    }

    public String createInputText(String mensaje){
        return JOptionPane.showInputDialog(null, mensaje, "TransportApp!", JOptionPane.DEFAULT_OPTION);
    }

    public int createDialog(String mensaje){

        return JOptionPane.showConfirmDialog(null, mensaje);

    }

    public void createMensaje(String mensaje){

        JOptionPane.showMessageDialog(null, mensaje);

    }




}
