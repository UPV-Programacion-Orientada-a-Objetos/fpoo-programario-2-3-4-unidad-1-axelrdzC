package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public EjercicioSeis() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nBienvenido a la 'Langosta ahumada': ");
        System.out.print( "\nIndique la cantidad de personas: ");
        String num = reader.readLine();
        double personas = Double.parseDouble(num);

        matematicas mat = new matematicas();
        double total = mat.langosta(personas)*personas;

        System.out.println("El precio x platillo es de " + total/personas + ", el total a pagar es de = " + total);

    }

}
