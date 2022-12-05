package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer2  extends Thread{

    private String nombre = "hilo1" ;

    public Leer2(String nombre){
        this.nombre = nombre;
    }
    public Leer2(){

    }
    public void run(){
        FileReader fr = null;
        try {
            fr = new FileReader("cuento2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(fr);
        long lNumeroLineas2 = 0;
        String sCadena;
        while (true) {
            try {
                if (!((sCadena = bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas2++;
        }
        System.out.println("El fichero leido tiene " + lNumeroLineas2 + " lineas");
    }
}
