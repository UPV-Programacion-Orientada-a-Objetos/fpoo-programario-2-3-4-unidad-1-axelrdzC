package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSelectivas.*;
import edu.upvictoria.fpoo.EstructurasRepetitivas.*;
import edu.upvictoria.fpoo.Arreglos.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\nBienvenido!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "Ingrese la opcion que desea realizar.\n" );

            System.out.println( "PROGRAMARIOS:" );
            System.out.print("[1] Estructuras Selectivas\n");
            System.out.print("[2] Estructuras Repetitivas\n");
            System.out.print("[3] Arreglos\n");
            System.out.println( "\nSALIR [0]" );

            System.out.print("\nIngrese su eleccion: ");
            String input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    aMenu oba = new aMenu();
                    oba.menu();
                    break;
                case 2:
                    bMenu obb = new bMenu();
                    obb.menu();
                    break;
                case 3:
                    cMenu obc = new cMenu();
                    obc.menu();
                    break;
            }

        }

        reader.close();
        System.out.print("Que le vaya bien. \n");

    }
}