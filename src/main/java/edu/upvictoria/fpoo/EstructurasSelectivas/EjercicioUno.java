package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.upvictoria.fpoo.Cerebro.*;
public class EjercicioUno {

    public EjercicioUno() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese los numeros a comparar.\n" );
        System.out.print( "primer valor: " );
        String num = reader.readLine();
        double a = Double.parseDouble(num);
        System.out.print( "segundo valor: " );
        num = reader.readLine();
        double b = Double.parseDouble(num);

        matematicas obj = new matematicas();
        obj.mayorComp(a,b);
        System.out.println("");


    }

}
