package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Cerebro.matematicas;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    public EjercicioNueve() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nBienvenido a chismefon, ingrese la siguiente informacion: ");

        System.out.print( "\nDuracion de la llamada (minutos): ");
        String num = reader.readLine();
        double min = Double.parseDouble(num);

        System.out.print( "\nEscriba 1 si la llamada fue en domingo 2 si no: ");
        num = reader.readLine();
        int domingo = Integer.parseInt(num);

        System.out.print( "\nEscriba 1 si fue en horario matutino 2 si fue en vespertino: ");
        num = reader.readLine();
        int horario = Integer.parseInt(num);

        matematicas obj = new matematicas();

        double cost = obj.chismefon(min);
        double imp = obj.imp(domingo, horario);

        System.out.println("Costo de la llamada: $" + cost);
        System.out.println("Impuesto: $" + imp);
        System.out.println("Total a pagar: $" + (cost+imp));

    }

}
