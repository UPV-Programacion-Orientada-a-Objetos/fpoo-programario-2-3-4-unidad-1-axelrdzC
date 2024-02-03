package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {

    public EjercicioSiete() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println("Ponga un valor a n: ");
        input = reader.readLine();
        int valor = Integer.parseInt(input);

        contar(valor);


    }

    public void contar(int n) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        int menoresi = 0;
        int iguales = 0;

        for (int i = 1; i<=n; i++) {
            System.out.println( i + ". Ingrese una cantidad : ");
            input = reader.readLine();
            double cant = Double.parseDouble(input);
            if (cant <= 0) {
                menoresi++;
            } else { iguales++; }
        }

        System.out.println("Hay " + menoresi + " numeros <= 0");
        System.out.println("Hay " + iguales + " numeros > 0");

    }

}
