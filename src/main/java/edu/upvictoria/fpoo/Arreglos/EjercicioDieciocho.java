package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciocho {

    EjercicioDieciocho() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano de su vector: ");
        input = reader.readLine();
        int x = Integer.parseInt(input);

        int[] vector = new int[x];
        int[] dector = new int[x];

        llenar(vector);
        mostrar(vector);
        cambiar(vector, dector);
        mostrar(dector);

    }

    public void llenar(int[] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {

            System.out.print("Ingrese el valor de [" + i + "]: ");
            input = reader.readLine();
            a[i] = Integer.parseInt(input);

        }

    }

    public void cambiar(int[] a, int[] b) {

        double temp = 0;
        for (int i = 0; i < a.length; i++) {

            if (i == a.length-1) {
                temp = a[i];
                b[0] = a[i];
            } else {
                temp = a[i];
                b[i+1] = a[i];
            }

        }

    }

    public void mostrar (int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }

        System.out.println();

    }


}
