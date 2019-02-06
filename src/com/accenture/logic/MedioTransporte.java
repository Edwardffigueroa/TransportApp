package com.accenture.logic;

public interface MedioTransporte {

    public void moverse();

    public void autodestruirse();

    public void chocarse();
    public void chocarse(Vehiculo v);

    public void tanquear();
    public void tanquear(int cuanto);

    public void viajar();
    public void viajar(String destino);

}
