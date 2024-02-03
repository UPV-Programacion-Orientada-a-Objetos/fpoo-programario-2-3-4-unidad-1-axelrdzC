package edu.upvictoria.fpoo.Arreglos;

import java.io.IOException;
import java.util.Random;

public class EjercicioVeintidos {

    public EjercicioVeintidos() throws IOException {

        int[][] a = new int[12][19];
        llenar(a);
        mostrar(a);
        identificar(a);
        mostrar(a);

    }

    public void llenar(int[][] a) throws IOException {

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = random.nextInt(151) - 50;
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

    public void identificar(int[][] a) {

        boolean flag = true;
        double suma = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length ; j++) {

                if (a[i][j] < 0) {
                    a[i][j] = 0;
                }

            }
        }
    }

}
