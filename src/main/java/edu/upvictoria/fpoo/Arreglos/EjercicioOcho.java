package edu.upvictoria.fpoo.Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOcho {

    public EjercicioOcho () throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese la cantidad de choferes: ");
        input = reader.readLine();
        int chof = Integer.parseInt(input);

        String[][] choferes = new String[chof+1][8];
        choferes[0][0] = "";
        choferes[0][1] = "lunes";
        choferes[0][2] = "martes";
        choferes[0][3] = "miercoles";
        choferes[0][4] = "jueves";
        choferes[0][5] = "viernes";
        choferes[0][6] = "sabado";
        choferes[0][7] = "km totales";

        for (int i = 1; i <= chof; i++) {

            System.out.println("Ingrese el nombre del conductor [" + i + "]");
            input = reader.readLine();
            choferes[i][0] = input;

            for (int j = 1; j < 7; j++) {

                System.out.println("Ingrese sus km recorridos el dia " + choferes[0][j] + ": ");
                input = reader.readLine();
                choferes[i][j] = input;

            }

        }

        kmTotales(choferes);


        for (int i = 0; i <= chof; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.printf("%-15s", choferes[i][j]);

            }

            System.out.println("");

        }

    }

    public void kmTotales(String[][] a) {

        for (int i = 1; i < a.length; i++) {

            double kmT = 0;

            for (int j = 1; j < a[0].length-1; j++) {

                kmT += Double.parseDouble(a[i][j]);

            }

            a[i][7] = String.valueOf(kmT);
        }

    }

}
