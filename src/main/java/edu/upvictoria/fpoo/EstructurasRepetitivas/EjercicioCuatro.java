package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {

    public EjercicioCuatro() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println( "\nIngrese el numero de alumnos: " );
        input = reader.readLine();
        int n = Integer.parseInt(input);

        System.out.println("El promedio es de " + promedio(n));



    }

    public double promedio(int n) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        double prom = 0;

        for (int i = 0; i<n; i++) {
            System.out.println( "\nIngrese la edad del alumno " + i + ": ");
            input = reader.readLine();
            int edad = Integer.parseInt(input);
            prom += edad;
        }

        return prom/n;

    }

}
