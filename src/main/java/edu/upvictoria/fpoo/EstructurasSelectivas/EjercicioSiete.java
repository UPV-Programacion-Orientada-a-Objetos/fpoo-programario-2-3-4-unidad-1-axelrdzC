package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {

    public EjercicioSiete() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese el precio incial por el kilo se uva: ");
        String num = reader.readLine();
        double kilo = Double.parseDouble(num);

        System.out.print( "\nIngrese el tipo de uva: [a] o [b]: ");
        num = reader.readLine();
        String tipo = num;

        System.out.print( "\nIngrese el tamaño de uva: [1] o [2]: ");
        num = reader.readLine();
        double tam = Double.parseDouble(num);

        matematicas mat = new matematicas();
        double total = mat.uvas(kilo, tipo, tam);

        System.out.println( "\nEl precio final es de: " + total);


    }

}
