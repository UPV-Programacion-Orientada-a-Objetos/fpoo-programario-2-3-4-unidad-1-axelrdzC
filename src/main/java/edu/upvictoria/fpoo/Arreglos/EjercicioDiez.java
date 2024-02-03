package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {

    public EjercicioDiez () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano de las filas: ");
        input = reader.readLine();
        int m = Integer.parseInt(input);

        System.out.println("Ingrese el tamano de las columnas: ");
        input = reader.readLine();
        int n = Integer.parseInt(input);

        double[][] a = new double[m][n];
        double[][] b = new double[m][n];
        double[][] c = new double[m][n];

        llenar(a); llenar(b);
        sumar(a,b,c);

        mostrar(a);
        mostrar(b);
        mostrar(c);


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

    }

    public void sumar(double[][] a, double[][] b, double[][] c) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

    }

    public void mostrar(double[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

    }

}
