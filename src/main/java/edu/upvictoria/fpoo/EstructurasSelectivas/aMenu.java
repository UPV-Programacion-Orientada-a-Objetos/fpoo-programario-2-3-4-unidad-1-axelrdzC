package edu.upvictoria.fpoo.EstructurasSelectivas;

import edu.upvictoria.fpoo.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aMenu {

    public void menu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "\n// Estructuras selectivas!" );

        int opc = 1;

        while (opc != 0) {

            System.out.println( "seleccione un ejercicio.\n" );
            System.out.print("[1] Comparar dos numeros\n");
            System.out.print("[2] Positivo o negativo\n");
            System.out.print("[3] Venta de lapices\n");
            System.out.print("[4] Descuento del traje\n");
            System.out.print("[5] Encontrar cantidad mayor\n");
            System.out.print("[6] La langosta ahumada\n");
            System.out.print("[7] La langosta ahumada\n");
            System.out.println( "\nSALIR [0]" );

            System.out.print("\nIngrese su eleccion: ");
            String input = reader.readLine();
            System.out.println("\nUsted selecciono la opcion: " + input);
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:
                    EjercicioUno obj = new EjercicioUno();
                    break;
                case 2:
                    EjercicioDos obj2 = new EjercicioDos();
                    break;
                case 3:
                    EjercicioTres obj3 = new EjercicioTres();
                    break;
                case 4:
                    EjercicioCuatro obj4 = new EjercicioCuatro();
                    break;
                case 5:
                    EjercicioCinco obj5 = new EjercicioCinco();
                    break;
                case 6:
                    EjercicioSeis obj6 = new EjercicioSeis();
                    break;
                case 7:
                    EjercicioSiete obj7 = new EjercicioSiete();
                    break;
            }

        }

        System.out.print("volviendo al menu princiapl... \n\n");
        Main o = new Main();
    }

}
