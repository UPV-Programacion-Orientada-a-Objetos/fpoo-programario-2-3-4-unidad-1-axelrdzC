package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {

    public EjercicioDiez() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println("Ingrese cuanto es pago x hora: ");
        input = reader.readLine();
        double pago = Double.parseDouble(input);

        calcular(pago);

    }

    public void calcular(double pago) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        int totalH = 0;

        for (int i = 0; i<6; i++) {

            System.out.println("Ingrese las horas trabajadas en " + i + ": ");
            input = reader.readLine();
            int horas = Integer.parseInt(input);
            totalH += horas;

        }

        double totalP = totalH*pago;
        System.out.println("El total de horas trabajadas es de: " + totalH);
        System.out.println("El pago sera de: " + totalP);

    }


}
