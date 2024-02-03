package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public EjercicioCinco () throws IOException{

        promedio();

    }

    public void promedio() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        double prom = 0;

        int i = 0;
        double est = 0;

        do {

            System.out.print("Ingrese la estatura del sujeto " + i + ": ");
            input = reader.readLine();
            est = Double.parseDouble(input);
            if (est != 0) {
                prom += est;
                i++;
            }
            System.out.println( "pulse 0 para salir");
        } while (est != 0);

        System.out.println( "\nEl promedio es de: " + prom/i );

    }


}
