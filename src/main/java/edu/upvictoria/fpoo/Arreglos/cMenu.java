package edu.upvictoria.fpoo.Arreglos;

import edu.upvictoria.fpoo.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cMenu {

    public void menu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\n// Arreglos!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "seleccione un ejercicio.\n" );
            System.out.print("[1] Sumar arreglos\n");
            System.out.print("[2] Sumar vectores a y b\n");
            System.out.print("[3] Ordenar alumnos x promedio\n");
            System.out.print("[4] Inventario de productos\n");
            System.out.print("[5] Invertir vector\n");
            System.out.print("[6] Calificaciones de alumnos\n");
            System.out.print("[7] Encontrar 0s (4x4)\n");
            System.out.print("[8] Conductores\n");
            System.out.println( "\nSALIR [0]" );

            System.out.print("\nIngrese su eleccion: ");
            String input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    EjercicioUno a = new EjercicioUno();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 2:
                    EjercicioDos b = new EjercicioDos();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 3:
                    EjercicioTres c = new EjercicioTres();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 4:
                    EjercicioCuatro d = new EjercicioCuatro();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 5:
                    EjercicioCinco e = new EjercicioCinco();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 6:
                    EjercicioSeis f = new EjercicioSeis();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 7:
                    EjercicioSiete g = new EjercicioSiete();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 8:
                    EjercicioOcho h = new EjercicioOcho();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
            }

        }

        System.out.print("volviendo al menu princiapl... \n\n");
        Main o = new Main();


    }

}
