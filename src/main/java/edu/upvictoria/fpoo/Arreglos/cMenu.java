package edu.upvictoria.fpoo.Arreglos;

import edu.upvictoria.fpoo.EstructurasRepetitivas.EjercicioUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cMenu {

    public void menu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\n// Estructuras selectivas!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "seleccione un ejercicio.\n" );
            System.out.print("[1] Sumar 10 flotantes\n");
            System.out.print("[2] Estructuras repetitivas\n");
            System.out.print("[3] Arreglos\n");
            System.out.println( "\nSALIR [0]" );

            System.out.print("\nIngrese su eleccion: ");
            String input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    do {
                        EjercicioUno obj = new EjercicioUno();
                        obj.flotantes();
                        //opc = pregunta();
                    } while (opc == 0);
                    break;
            }

        }

        reader.close();
        System.out.print("Que le vaya bien. \n");


    }

}
