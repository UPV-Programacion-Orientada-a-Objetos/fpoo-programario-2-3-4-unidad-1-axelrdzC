package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDoce {

    public EjercicioDoce() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Para la matriz 1\nIngrese el tamano de las filas: ");
        input = reader.readLine();
        int m = Integer.parseInt(input);

        System.out.println("Ingrese el tamano de las columnas: ");
        input = reader.readLine();
        int n = Integer.parseInt(input);

        System.out.println("Para la matriz 2\nIngrese el tamano de las filas: ");
        input = reader.readLine();
        int p = Integer.parseInt(input);

        System.out.println("Ingrese el tamano de las columnas: ");
        input = reader.readLine();
        int q = Integer.parseInt(input);

        double[][] a = new double[m][n];
        double[][] b = new double[p][q];

        //el valor max posible para fila y columna
        double[][] c = new double[Math.max(m, p)][Math.max(n, q)];

        llenar(a); llenar(b);
        mostrar(a); mostrar(b);
        multiplicar(a, b, c);
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

        System.out.println();

    }

    public void multiplicar(double[][] a, double[][] b, double[][] c) {

        int m = a.length;
        int n = a[0].length;
        int p = b.length;
        int q = b[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

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

}
