package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer1  extends Thread{

    private String nombre = "hilo1" ;

    public Leer1(String nombre){
        this.nombre = nombre;
    }
    public Leer1(){

    }
    public void run(){
        FileReader fr = null;
        try {
            fr = new FileReader("cuento1.txt" );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(fr);
        long lNumeroLineas1 = 0;
        String sCadena;
        while (true) {
            try {
                if (!((sCadena = bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas1++;
        }
        System.out.println("El fichero leido tiene  " + lNumeroLineas1 + " lineas");
    }
}
