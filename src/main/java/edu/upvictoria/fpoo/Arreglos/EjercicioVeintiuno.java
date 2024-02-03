package edu.upvictoria.fpoo.Arreglos;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintiuno {

    public EjercicioVeintiuno() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese el tamano de las matrices: ");
        input = reader.readLine();
        int m = Integer.parseInt(input);

        int[][] a = new int[m][m];
        int[][] b = new int[m][m];

        llenar(a);
        llenar(b);

        mostrar(a);
        mostrar(b);

        boolean ba = identificar(a);
        boolean bb = identificar(b);

        if (ba == true && bb == true) {
            System.out.println("Ambos son matrices diagonales");
        } else if (ba == true && bb == false) {
            System.out.println("La segunda matriz no es diagonal");
        } else if (ba == false && bb == true) {
            System.out.println("La primera matriz no es diagonal");
        } else {
            System.out.println("ninguna matriz es diagonal");
        }


    }

    public void llenar(int[][] a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length ; j++) {

                System.out.print("Ingrese el valor de [" + i + "][" + j + "]: ");
                input = reader.readLine();
                a[i][j] = Integer.parseInt(input);

            }

        }

        System.out.println();

    }

    public void mostrar (int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

    }

    public boolean identificar(int[][] a) {

        boolean flag = true;
        double suma = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length ; j++) {

                if (i == j && a[i][j] != 0) {
                    return !flag;
                }

            }
        }
        System.out.println("Si es una matriz diagonal");

        return flag;
    }


}
