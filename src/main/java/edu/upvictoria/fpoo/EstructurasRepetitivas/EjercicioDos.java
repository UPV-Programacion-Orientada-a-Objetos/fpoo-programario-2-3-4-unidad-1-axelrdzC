package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {

    public EjercicioDos() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        double suma = 0;

        int i = 1;
        do {

            System.out.print( "n" + i + ": = ");
            input = reader.readLine();
            suma += Double.parseDouble(input);
            i ++;

        } while (i <= 10);

        System.out.println( "\nEl total es de: " + suma );

    }

}
