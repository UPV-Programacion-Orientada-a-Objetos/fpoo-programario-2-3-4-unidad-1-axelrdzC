package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintiocho {

    public EjercicioVeintiocho() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano de las filas: ");
        input = reader.readLine();
        int m = Integer.parseInt(input);

        System.out.println("Ingrese el tamano de las columnas: ");
        input = reader.readLine();
        int n = Integer.parseInt(input);

        double[][] a = new double[m][n];

        llenar(a);
        mostrar(a);

        encontrarN(a);

    }

    public void llenar(double[][] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length ; j++) {

                System.out.print("Ingrese el valor de [" + i + "][" + j + "]: ");
                input = reader.readLine();
                a[i][j] = Double.parseDouble(input);

            }

        }

        System.out.println();

    }

    public void mostrar (double[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

    }

    public void encontrarN(double[][] a) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length ; j++) {

                if (a[i][j] < 0) {
                    x = i;
                    y = j;
                    System.out.println("El elemento negativo se encuentra en la posicion (" + i + ", " + j + ")");
                }

            }

        }

    }

}
