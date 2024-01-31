package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public EjercicioCinco() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese n1: " );
        String num = reader.readLine();
        double n1 = Double.parseDouble(num);

        System.out.print( "\nIngrese n2: " );
        num = reader.readLine();
        double n2 = Double.parseDouble(num);

        System.out.print( "\nIngrese n3: " );
        num = reader.readLine();
        double n3 = Double.parseDouble(num);

        matematicas mat = new matematicas();

        System.out.println( "\nEl numero mayor es: " + mat.mayor3(n1,n2,n3));

    }

}
