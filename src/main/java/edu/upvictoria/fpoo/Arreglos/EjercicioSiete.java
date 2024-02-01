package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {

    public EjercicioSiete() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int matriz [][]  = new int[4][4];

        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                input = reader.readLine();
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        System.out.print("\n");

        contar(matriz);

    }

    public void contar(int[][] a) {

        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(a[i][j] + " ");
                if (a[i][j] == 0) {
                    contador += 1;
                }

            }
            System.out.println("");
        }

        System.out.println("\nCantidad de 0s: " + contador);

    }

}
