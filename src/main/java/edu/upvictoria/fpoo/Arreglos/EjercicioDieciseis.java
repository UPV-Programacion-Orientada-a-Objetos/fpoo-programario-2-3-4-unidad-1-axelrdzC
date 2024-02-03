package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciseis {

    public EjercicioDieciseis() throws IOException {

        String[] alumnos = new String[10];
        String[] edad = new String[10];

        llenar(alumnos, edad);
        mostrar(alumnos); mostrar(edad);
        comparar(alumnos, edad);


    }

    public void llenar(String[] a, String[] b) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {

            System.out.print("Ingrese el nombre del alumno [" + i + "]: ");
            input = reader.readLine();
            a[i] = input;
            System.out.print("Ingrese su edad: ");
            input = reader.readLine();
            b[i] = input;


        }

        System.out.println();

    }

    public void comparar(String[] a, String[] b) {

        int temp = 0;
        for (int i = 1; i < 5; i++) {
            if (Integer.parseInt(b[i]) > Integer.parseInt(b[temp])) {
                temp = i;
            }
        }


        System.out.println("El alumno " + a[temp] + " es el mayor, tiene " + b[temp]);

    }

    public void mostrar (String[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }

        System.out.println();

    }

}

