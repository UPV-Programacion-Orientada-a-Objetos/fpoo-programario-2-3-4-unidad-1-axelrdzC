package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    public EjercicioTres() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print( "n" + i + ": = ");
            input = reader.readLine();
            suma += Integer.parseInt(input);
        }

        System.out.println( "\nEl total es de: " + suma);

    }

}
