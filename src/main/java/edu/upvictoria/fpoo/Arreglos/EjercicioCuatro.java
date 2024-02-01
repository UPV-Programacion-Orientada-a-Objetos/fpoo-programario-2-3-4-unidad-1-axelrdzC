package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {

    public EjercicioCuatro() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        // inicializar
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        System.out.println("Llene los siguientes campos: ");
        for (int i = 0; i<10; i++) {

            System.out.println("Existencia del producto [" + i + "]: ");
            input = reader.readLine();
            a[i] = Integer.parseInt(input);

            System.out.println("Pedidos del mismo producto: ");
            input = reader.readLine();
            b[i] = Integer.parseInt(input);

        }

        restock(a,b,c);

    }

    public void restock (int[] a, int[] b, int[] c) {

        int n = a.length;

        for (int i = 0; i < n; i++) {

            if (a[i] == b[i]) {
                c[i] = a[i];
            } else if (a[i] < b[i]) {
                c[i] = 2*(b[i]-a[i]);
            } else {
                c[i] = b[i];
            }

        }

        // mostrar
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] +" "+ b[i] +" "+ c[i]);
            System.out.println("para el producto " + i + " se requiere comprar " + c[i] + " unidades");
        }

    }

}
