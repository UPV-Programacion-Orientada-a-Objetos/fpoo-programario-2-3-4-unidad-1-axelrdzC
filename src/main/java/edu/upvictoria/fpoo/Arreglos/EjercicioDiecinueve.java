package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiecinueve {

    public EjercicioDiecinueve() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        double[][] a = new double[15][12];

        llenar(a);
        mostrar(a);

        int opc = 1;

        while (opc != 0) {

            System.out.println("seleccione una accion.\n");
            System.out.print("[1] Ver el menor elemento del arreglo\n");
            System.out.print("[2] Sumar primeras 5 filas del arreglo;\n");
            System.out.print("[3] Ver total de elementos negativos en las columnas de la quinta a la nueve.\n");
            System.out.println("\nSALIR [0]");

            System.out.print("\nIngrese su eleccion: ");
            input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    System.out.println("el menor elemento del arreglo es: " + menor(a));
                    break;
                case 2:
                    System.out.println("resultado: " + suma5(a));
                    break;
                case 3:
                    System.out.println("elementos negativos en las columnas 5-9: " + contadorN(a));
                    break;
            }


        }
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

    public void mostrar(double[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

    }
    public double menor(double[][] a) {
        double menor = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] < menor) {
                    menor = a[i][j];
                }
            }
        }

        return menor;
    }
    public double suma5(double[][] a) {
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[0].length; j++) {
                suma += a[i][j];
            }
        }

        return suma;
    }
    public int contadorN(double[][] a) {
        int totalNegativos = 0;

        for (int j = 5; j <= 9; j++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] < 0) {
                    totalNegativos++;
                }
            }
        }

        return totalNegativos;
    }


}
