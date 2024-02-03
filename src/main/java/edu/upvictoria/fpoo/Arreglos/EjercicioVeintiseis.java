package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintiseis {

    public EjercicioVeintiseis() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano del vector FILA: ");
        input = reader.readLine();
        int m = Integer.parseInt(input);

        System.out.println("Ingrese el tamano de vector COLUMNA: ");
        input = reader.readLine();
        int n = Integer.parseInt(input);

        double[] a = new double[m];
        double[] b = new double[n];

        llenar(a); llenar(b);
        System.out.println("El resultado es: " + resultado(a,b));

    }

    public void llenar(double[] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {
             System.out.print("Ingrese el valor de [" + i + "]: ");
             input = reader.readLine();
             a[i] = Double.parseDouble(input);
        }

        System.out.println();

    }

    public double resultado(double[] a, double[] b) {

        if (a.length != b.length) {
            System.out.println("no se puede multiplicar, los vectores deben ser del mismo tamano");
            return 0;
        }

        double multi = 0;

        for (int i = 0; i < a.length; i++) {
            multi += a[i] * b[i];
        }

        return multi;

    }


}
