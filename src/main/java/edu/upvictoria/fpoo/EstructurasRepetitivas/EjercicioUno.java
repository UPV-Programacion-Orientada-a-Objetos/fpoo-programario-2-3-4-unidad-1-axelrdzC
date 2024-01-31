package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioUno {

    public void flotantes() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\nIngrese a continuacion los numeros a sumar: " );
        String input;
        double suma = 0;

        int i = 1;
        while (i <= 10) {

            System.out.print( "\nn" + i + ": = ");
            input = reader.readLine();
            suma += Double.parseDouble(input);
            i ++;

        }

        System.out.println( "\nEl total es de: " + suma );

    }
}
