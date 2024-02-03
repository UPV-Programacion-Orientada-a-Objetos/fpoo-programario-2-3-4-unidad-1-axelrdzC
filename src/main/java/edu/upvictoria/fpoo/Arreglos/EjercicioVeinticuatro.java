package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinticuatro {

    public EjercicioVeinticuatro() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano de su vector: ");
        input = reader.readLine();
        int x = Integer.parseInt(input);

        double[] vector = new double[x];
        llenar(vector);

        System.out.println("La magnitud del vector es de: " + magno(vector));

    }

    public void llenar(double[] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {

            System.out.print("Ingrese el valor de [" + i + "]: ");
            input = reader.readLine();
            a[i] = Double.parseDouble(input);

        }

    }

    public double magno(double[] a) {

        double sumC = 0;

        for (int i = 0; i < a.length; i++) {
            sumC += Math.pow(a[i], 2);
        }

        return Math.sqrt(sumC);
    }

}
