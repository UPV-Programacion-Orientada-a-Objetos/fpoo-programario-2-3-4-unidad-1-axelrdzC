package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinte {

    public EjercicioVeinte() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int tam = Integer.parseInt(input);

        // inicializar
        double[] vectorA = new double[100];
        double[] vectorB = new double[100];
        double[] vectorC = new double[100];

        for (int i = 0; i < tam; i++) {

            System.out.println("Ingrese valor en A[" + i + "]");
            input = reader.readLine();
            vectorA[i] = Double.parseDouble(input);

            System.out.println("Ingrese valor en B[" + i + "]");
            input = reader.readLine();
            vectorB[i] = Double.parseDouble(input);

        }

        operaciones(vectorA, vectorB, vectorC);

    }

    public void operaciones(double[] a, double[] b, double[] c) {

        int n = a.length;
        for (int i = 0; i < n; i++) { c[i] = a[i] + b[i]; }

        // mostrar
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + a[i] + "] + [" + b[i] + "] = [" + c[i] + "]");
        }

    }

}
