package paquete;

import java.util.Timer;

public class main{
    public static void main(String[] args) {
        Leer1 hilo1 = new Leer1();
         Leer2 hilo2 = new Leer2();
         Leer3 hilo3 = new Leer3();
        Leer4 hilo4 = new Leer4();
        Timer timer = new Timer ();


        System.out.println("Se leyeron 3 cuentos y se tiene el total de lineas por cuento y el total de los 3 cuentos");
        hilo1.start();
        hilo2.start();
        hilo3.start();




        long inicio = System.nanoTime();
        hilo4.start();
        try
        {
            Thread.sleep (1000);
        }
        catch (Exception e)
        {
        }
        long fin = System.nanoTime();

        System.out.println("El tiempo para leer todas las lineas fue de: " + (fin - inicio) + " milisegundos");
}
}

