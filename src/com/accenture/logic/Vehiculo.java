package com.accenture.logic;

public class Vehiculo {

    protected String tipoVehiculo;
    protected String marca;
    protected String color;
    protected String nombreVehiculo;
    protected int modelo;
    protected int velocidadMaxima;
    protected int numeroAsientos;
    protected String ciudadDestino;
    protected String tipoConductor;
    protected int numeroRuedas;

    public Vehiculo(String tipoVehiculo, String marca, String color, String nombreVehiculo, int modelo, int velocidadMaxima, int numeroAsientos, String ciudadDestino, String tipoConductor, int numeroRuedas) {
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.color = color;
        this.nombreVehiculo = nombreVehiculo;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroAsientos = numeroAsientos;
        this.ciudadDestino = ciudadDestino;
        this.tipoConductor = tipoConductor;
        this.numeroRuedas = numeroRuedas;
    }

    public Vehiculo() {

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getTipoConductor() {
        return tipoConductor;
    }

    public void setTipoConductor(String tipoConductor) {
        this.tipoConductor = tipoConductor;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
