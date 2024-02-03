package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public EjercicioSeis() throws IOException {

        ahorro();

    }

    public void ahorro() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        double total = 0;

        for (int i = 1; i<=12; i++) {
            System.out.println( "\nIngrese la cantidad ahorrada el mes " + i + ": ");
            input = reader.readLine();
            double mes = Double.parseDouble(input);
            total += mes;
        }

        System.out.println("El total ahorrado fue de: " + total);

    }

}
