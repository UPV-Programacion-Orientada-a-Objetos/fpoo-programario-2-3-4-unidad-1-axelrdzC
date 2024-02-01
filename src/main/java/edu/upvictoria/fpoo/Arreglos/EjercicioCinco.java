package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public EjercicioCinco () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        // inicializar
        int[] a = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el valor en a[" + i + "]: ");
            input = reader.readLine();
            a[i] = Integer.parseInt(input);
        }

        System.out.println("Arreglo invertido!");
        invertir(a);

    }

    public void invertir(int[] a) {

        int temp = 0;

        for (int i = 0; i < a.length/2; i++) {
            int j = a.length - 1 - i;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // mostrar
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
