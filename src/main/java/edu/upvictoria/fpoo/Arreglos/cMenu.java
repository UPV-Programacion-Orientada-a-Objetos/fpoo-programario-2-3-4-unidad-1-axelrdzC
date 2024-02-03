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
            System.out.print("[9] Venta mayor\n");
            System.out.print("[10] Sumar dos matrices\n");
            System.out.print("[11] Matriz transpuesta\n");
            System.out.print("[12] MxN x PxQ\n");
            System.out.print("[13] Sumar diagonal principal\n");
            System.out.print("[14] Restar dos matrices\n");
            System.out.print("[15] Matriz diagonal\n");
            System.out.print("[16] Alumno mayor\n");
            System.out.print("[17] Modificacion 22\n");
            System.out.print("[18] Formar vector 2\n");
            System.out.print("[19] Operaciones en un vector de 15x12\n");
            System.out.print("[20] Sumar 2 vectores de 100\n");
            System.out.print("[21] Dos vectores con diagonal principal\n");
            System.out.print("[22] Cambiar negativos x 0 (12x19)\n");
            System.out.print("[23] Calificaciones por encima del promedio\n");
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
                case 9:
                    EjercicioNueve i = new EjercicioNueve();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 10:
                    EjercicioDiez j = new EjercicioDiez();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 11:
                    EjercicioOnce k = new EjercicioOnce();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 12:
                    EjercicioDoce l = new EjercicioDoce();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 13:
                    EjercicioTrece m = new EjercicioTrece();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 14:
                    EjercicioCatorce n = new EjercicioCatorce();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 15:
                    EjercicioQuince o = new EjercicioQuince();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 16:
                    EjercicioDieciseis p = new EjercicioDieciseis();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 17:
                    EjercicioDiecisiete q = new EjercicioDiecisiete();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 18:
                    EjercicioDieciocho r = new EjercicioDieciocho();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 19:
                    EjercicioDiecinueve s = new EjercicioDiecinueve();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 20:
                    EjercicioVeinte t = new EjercicioVeinte();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 21:
                    EjercicioVeintiuno u = new EjercicioVeintiuno();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 22:
                    EjercicioVeintidos v = new EjercicioVeintidos();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
                case 23:
                    EjercicioVeintitres w = new EjercicioVeintitres();
                    System.out.println("\nPulse enter para salir. ");
                    reader.readLine();
                    break;
            }

        }

        System.out.print("volviendo al menu princiapl... \n\n");
        Main o = new Main();


    }

}
