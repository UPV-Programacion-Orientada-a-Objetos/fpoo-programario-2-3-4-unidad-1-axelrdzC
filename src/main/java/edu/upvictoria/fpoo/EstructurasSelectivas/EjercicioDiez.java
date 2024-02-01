package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {

    public EjercicioDiez() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese el tipo de autobus (a,B,c): ");
        String num = reader.readLine();
        String autobus = num;

        System.out.print( "\nIngrese la distancia del viaje en km: ");
        num = reader.readLine();
        double km = Double.parseDouble(num);

        System.out.print( "\nIngrese el num de personas: ");
        num = reader.readLine();
        int personas = Integer.parseInt(num);





    }
}
