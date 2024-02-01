package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioUno {

    public EjercicioUno() throws IOException {

        double[] arreglo = new double[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < 10; i++) {
            System.out.print( "\nIngrese el valor de la posicion [" + (i + 1) + "]: ");
            input = reader.readLine();
            arreglo[i] = Double.parseDouble(input);
        }

        double suma = sumArray(arreglo);
        System.out.println("El total sumado es de: " + suma);

    }

    public static double sumArray(double[] arreglo) {
        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        return suma;
    }


}
