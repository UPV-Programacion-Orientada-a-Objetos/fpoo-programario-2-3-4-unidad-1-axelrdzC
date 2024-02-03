package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintisiete {

    public EjercicioVeintisiete() throws IOException {

        String[][] trabajadores = new String[6][5];
        trabajadores[0][0] = "nombre";
        trabajadores[0][1] = "horas x dia";
        trabajadores[0][2] = "sueldo x hora";
        trabajadores[0][3] = "horas x semana";
        trabajadores[0][4] = "sueldo semanal";

        double total = llenar(trabajadores);

        System.out.println("\nR E P O R T E");
        imprimir(trabajadores);
        System.out.println("El total a pagar x la empresa es de: " + total);

    }

    public double llenar(String[][] a) throws IOException {

        double pagoTotal = 0;

        for (int i = 1; i < a.length; i++) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = "";

            System.out.println("Ingrese el nombre de trabajador [" + i + "]");
            input = reader.readLine();
            a[i][0] = input;

            System.out.println("Ingrese sus horas trabajadas x dia: ");
            input = reader.readLine();
            a[i][1] = input;
            int hxs = Integer.parseInt(input)*6;
            a[i][3] = String.valueOf(hxs);

            System.out.println("Ingrese su sueldo x hora: ");
            input = reader.readLine();
            a[i][2] = input;
            int sxs = Integer.parseInt(input)*hxs;
            a[i][4] = String.valueOf(sxs);
            pagoTotal += sxs;

        }

        return pagoTotal;

    }

    public void imprimir(String[][] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                System.out.printf("%-15s", a[i][j]);

            }

            System.out.println("");

        }

    }

}
