package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOcho {

    public EjercicioOcho() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese la cantidad de alumnos que asistiran al viaje: ");
        String num = reader.readLine();
        double cantidad = Double.parseDouble(num);

        matematicas mat = new matematicas();
        mat.viajeAl(cantidad);
    }

}
