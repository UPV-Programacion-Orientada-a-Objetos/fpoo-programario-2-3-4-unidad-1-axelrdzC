package edu.upvictoria.fpoo.Arreglos;

import java.awt.geom.Ellipse2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class EjercicioVeintitres {

    public EjercicioVeintitres() throws IOException {

        double[] a = new double[100];
        llenar(a);
        mostrar(a);
        double gralProm = obtenerPromedio(a);
        System.out.println("El promedio general del grupo es de " + gralProm);

        double superior = alumnosListos(a, gralProm);
        System.out.println("La cantidad de alumnos con calificacion superior al promedio son " + gralProm);


    }

    public void llenar(double[] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese la calificacion del alumno " + i + ": ");
            input = reader.readLine();
            a[i] = Double.parseDouble(input);
        }

        System.out.println();
    }

    public void mostrar (double[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + a[i] + "]");
        }

        System.out.println();

    }
    public double obtenerPromedio(double[] a) {

        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        double gralProm = suma/a.length;
        return gralProm;

    }

    public double alumnosListos(double[] a, double prom) {

        int contador = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > prom) {
                contador++;
            }
        }

        return contador;

    }


}
