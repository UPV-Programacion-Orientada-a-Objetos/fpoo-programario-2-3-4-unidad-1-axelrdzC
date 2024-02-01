package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    public EjercicioTres() throws IOException {

        System.out.println("Ingrese la cantidad de alumnos: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int tam = Integer.parseInt(input);

        // inicializar
        String[] nombre = new String[tam];
        double[] promedio = new double[tam];

        for (int i = 0; i < tam; i++) {

            System.out.println("Ingrese el nombre del alumno [" + i + "]");
            input = reader.readLine();
            nombre[i] = input;

            System.out.println("Ingrese su promedio: ");
            input = reader.readLine();
            promedio[i] = Double.parseDouble(input);

        }

        System.out.println("Alumnos ordenados!");
        operaciones(nombre, promedio);

    }

    public void operaciones(String[] a, double[] b) {

        int n = b.length;
        double temp = 0; String tempi = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] > b[j]) {

                    temp = b[j];
                    b[j] = b[i];
                    b[i] = temp;

                    tempi = a[j];
                    a[j] = a[i];
                    a[i] = tempi;

                }
            }
        }

        // mostrar
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " tiene un promedio de " + b[i]);
        }

    }

}
