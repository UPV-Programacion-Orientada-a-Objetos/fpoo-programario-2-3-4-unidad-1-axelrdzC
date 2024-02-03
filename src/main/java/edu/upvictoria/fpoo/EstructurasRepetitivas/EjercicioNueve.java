package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    public EjercicioNueve() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println("Ponga un valor a n: ");
        input = reader.readLine();
        int valor = Integer.parseInt(input);

        fibonacci(valor);

    }

    public void fibonacci(int n) {

        int n1 = 0, n2 = 1;
        System.out.print(n1 + ", " + n2 + ", ");

        for (int i = 3; i <= n; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + ", ");

            n1 = n2;
            n2 = n3;
        }

    }

}
