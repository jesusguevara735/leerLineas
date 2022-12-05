package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer4  extends Thread{

    private String nombre = "hilo1" ;

    public Leer4(String nombre){
        this.nombre = nombre;
    }
    public Leer4(){

    }
    public void run(){
        FileReader fr = null;
        try {
            fr = new FileReader("cuento1.txt" );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(fr);
        long lNumeroLineas4 = 0;
        String sCadena;
        while (true) {
            try {
                if (!((sCadena = bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas4++;
        }


        FileReader fr2 = null;
        try {
            fr2 = new FileReader("cuento2.txt" );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf2 = new BufferedReader(fr2);
        long lNumeroLineas42 = 0;
        String sCadena2;
        while (true) {
            try {
                if (!((sCadena2 = bf2.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas42++;
        }


        FileReader fr3 = null;
        try {
            fr3 = new FileReader("cuento3.txt" );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf3 = new BufferedReader(fr3);
        long lNumeroLineas43 = 0;
        String sCadena3;
        while (true) {
            try {
                if (!((sCadena3 = bf3.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lNumeroLineas43++;
        }


        int suma = (int) (lNumeroLineas4 + lNumeroLineas42 + lNumeroLineas43);
        System.out.println("La suma de lineas de los 3 cuentos es igual a  " + suma);
    }
}
