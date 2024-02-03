package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    public EjercicioNueve () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        String[][] m = new String[6][8];
        m[0][0] = "";
        m[0][1] = "lunes";
        m[0][2] = "martes";
        m[0][3] = "miercoles";
        m[0][4] = "jueves";
        m[0][5] = "viernes";
        m[0][6] = "sabado";
        m[0][7] = "ventas totales";

        for (int i = 1; i < 6; i++) {

            System.out.println("Ingrese el nombre del empleado [" + i + "]");
            input = reader.readLine();
            m[i][0] = input;

            for (int j = 1; j < 7 ; j++) {

                System.out.println("Ingrese sus ventas el dia " + m[0][j] + ": ");
                input = reader.readLine();
                m[i][j] = input;

            }

        }

        ventasTotales(m);


        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.printf("%-15s", m[i][j]);

            }

            System.out.println("");
        }

        encontrarMayor(m);


    }

    public void ventasTotales(String[][] a) {

        for (int i = 1; i < 6; i++) {

            double vt = 0;

            for (int j = 1; j < 7; j++) {

                vt += Double.parseDouble(a[i][j]);

            }

            a[i][7] = String.valueOf(vt);
        }
    }

    public void encontrarMayor(String[][] a) {

        String temp = ""; String temp2 = "";

        for (int i = 1; i < 5; i++) {

            if (Double.parseDouble(a[i][7]) > Double.parseDouble(a[i+1][7])){
                temp = a[i][7];
                temp2 = a[i][0];
            } else {
                temp = a[i+1][7];
                temp2 = a[i+1][0];
            }

        }

        System.out.println("\nLa venta mayor fue de " + temp + " por la vendedora " + temp2);

    }
}
