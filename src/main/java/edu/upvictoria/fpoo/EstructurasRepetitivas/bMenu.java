package edu.upvictoria.fpoo.EstructurasRepetitivas;

import edu.upvictoria.fpoo.Arreglos.EjercicioUno;
import edu.upvictoria.fpoo.Arreglos.EjercicioVeintinueve;
import edu.upvictoria.fpoo.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bMenu {

    public void menu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\n// Estructuras selectivas!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "seleccione un ejercicio.\n" );
            System.out.print("[1] Sumar 10 flotantes\n");
            System.out.print("[2] Sumar flotantes (do-while)\n");
            System.out.print("[3] Sumar enteros (for)\n");
            System.out.print("[4] Promedio edades\n");
            System.out.print("[5] Promedio estaturas\n");
            System.out.print("[6] Ahorro anual\n");
            System.out.print("[7] Contar cantidades\n");
            System.out.print("[8] Pares del 1-100\n");
            System.out.print("[9] N numero fibonacci\n");
            System.out.print("[10] Pago x horas trabajadas\n");
            System.out.print("[11] Zacatecas\n");
            System.out.print("[12] Zacatecas\n");
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
            }

        }

        System.out.print("volviendo al menu principal... \n\n");
        Main o = new Main();

    }

}
