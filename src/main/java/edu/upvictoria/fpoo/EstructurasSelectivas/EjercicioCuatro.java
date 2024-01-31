package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.upvictoria.fpoo.Cerebro.matematicas;

public class EjercicioCuatro {

    public EjercicioCuatro() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nIngrese el precio de su traje: " );
        String num = reader.readLine();
        double precio = Double.parseDouble(num);

        matematicas mat = new matematicas();

        System.out.println("El costo total del traje fue de: " + mat.descuento(precio, 0.15, 0.08));

    }

}
