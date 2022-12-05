package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer3  extends Thread{

    private String nombre = "hilo1" ;

    public Leer3(String nombre){
        this.nombre = nombre;
    }
    public Leer3(){

    }
    public void run(){
        FileReader fr = null;
        try {
            fr = new FileReader("cuento3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(fr);
        long lNumeroLineas3 = 0;
        String sCadena;
        while (true) {
            try {
                if (!((sCadena = bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas3++;
        }
        System.out.println("El fichero leido tiene  " + lNumeroLineas3 + " lineas");
    }
}