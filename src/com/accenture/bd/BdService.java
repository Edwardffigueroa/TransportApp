package com.accenture.bd;

import com.accenture.logic.Carro;
import com.accenture.logic.Logica;
import com.accenture.logic.Vehiculo;

import java.io.*;

public class BdService {



    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "tipoVehiculo,marca,color,nombreVehiculo,modelo,velocidadMaxima,numeroAsientos,ciudadDestino,tipoConductor,numeroRuedas";

    private FileWriter fileWriter = null; //escritor
    private BufferedReader fileReader = null; //lector
    private Logica log;


    public BdService(Logica log) throws IOException {
        this.log=log;
try {
    fileWriter = new FileWriter("bd.csv", true);
    //Write the CSV file header
   // fileWriter.append(FILE_HEADER);

    //Add a new line separator after the header
  //  fileWriter.append(NEW_LINE_SEPARATOR);

}catch (Exception e){

}


    }

    public void write(Object obj){


        try {

            //escribir objeto
            if(obj instanceof Vehiculo){
                Vehiculo car = (Vehiculo) obj;

                fileWriter.append(car.getTipoVehiculo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(car.getColor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(car.getNombreVehiculo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(car.getModelo()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(car.getVelocidadMaxima()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(car.getNumeroAsientos()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(car.getCiudadDestino());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(car.getTipoConductor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(car.getNumeroRuedas()));
                fileWriter.append(NEW_LINE_SEPARATOR);

            }


            fileWriter.flush();
            fileWriter.close();


            System.out.println("CSV file was created successfully !!!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean read(){

        try {
            String line;
            fileReader = new BufferedReader(new FileReader("bd.csv"));
            fileReader.readLine();

            while((line = fileReader.readLine())!= null){

                String [] celdas = line.split(COMMA_DELIMITER);

                if(celdas.length>0){

                    return true;

                //    log.crearVehiculo(celdas[0], celdas[1], );

                }

            }


        } catch (FileNotFoundException e) {
            System.out.println("we can't open CSV file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;

    }


}
