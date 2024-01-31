package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    public EjercicioTres() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nHola, cuantos lapices desea comprar?: " );
        String num = reader.readLine();
        double num_lapices = Double.parseDouble(num);

        matematicas mat = new matematicas();
        double total;

        if (num_lapices >= 1000) {
            total = mat.multiplicar(num_lapices, 3.65);
        } else {
            total = mat.multiplicar(num_lapices, 4.83);
        }

        System.out.println( "\nEl precio a pagar es de: $" + total);


    }

}
