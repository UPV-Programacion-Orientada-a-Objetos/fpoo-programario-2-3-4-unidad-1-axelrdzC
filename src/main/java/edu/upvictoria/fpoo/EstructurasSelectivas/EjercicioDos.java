package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {

    public EjercicioDos() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese un numero: " );
        String num = reader.readLine();
        double a = Double.parseDouble(num);

        matematicas obj = new matematicas();
        obj.posneg(a);
        System.out.println("");


    }

}
