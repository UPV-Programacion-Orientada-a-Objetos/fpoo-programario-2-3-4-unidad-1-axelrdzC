package edu.upvictoria.fpoo.Arreglos;

import edu.upvictoria.fpoo.EstructurasSelectivas.EjercicioSiete;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSeis {

    public EjercicioSeis() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Ingrese la cantidad de alumnos: ");
        input = reader.readLine();
        int al_tam = Integer.parseInt(input)+1;

        System.out.println("Ingrese la cantidad de materias: ");
        input = reader.readLine();
        int mat_tam = Integer.parseInt(input)+1;

        // inicializar
        String[][] c = new String[al_tam][mat_tam];
        c[0][0] = "";

        for (int i = 1; i < mat_tam; i++) {
            System.out.println("Ingrese el nombre de la materia [" + i + "]");
            input = reader.readLine();
            c[0][i] = input;
        }

        for (int i = 1; i < al_tam; i++) {

            System.out.println("Ingrese el nombre del alumno [" + i + "]");
            input = reader.readLine();
            c[i][0] = input;

            for (int j = 1; j < mat_tam; j++) {

                System.out.println("Ingrese su calificacion en " + c[0][j] + ": ");
                input = reader.readLine();
                c[i][j] = input;

            }

        }

        int opc = 1;

        while (opc != 0) {

            System.out.println("\nIngrese la accion que desea realizar:");
            System.out.println("[1] Ver el total de alumnos y sus calificaciones.");
            System.out.println("[2] Mostrar calificaciones y promedio de un alumno determinado.");
            System.out.println("[3] Calcular promedio gral.");
            System.out.println("[4] Ver lista de alumnos no competentes (>70).");
            System.out.println("[0] Salir.");

            input = reader.readLine();
            opc = Integer.parseInt(input);

            switch (opc) {
                case 1:

                    for (int i = 0; i < al_tam; i++) {
                        for (int j = 0; j < mat_tam; j++) {

                            System.out.print(c[i][j] + " ");

                        }
                        System.out.println("");
                    }

                    break;
                case 2:

                    System.out.println("Ingrese el nombre del alumno a buscar: ");
                    input = reader.readLine();
                    buscarAl(input, c, mat_tam);

                    break;
                case 3:

                    System.out.println("Promedio general del grupo: " + generalProm(c, al_tam));

                    break;
                case 4:

                    System.out.println("ALumnos con calificaciones > 70: ");
                    noCompetentes(c);

                    break;
            }

        }


    }

    public void buscarAl(String a, String[][] b, int m) {

        double promedio = 0;

        for (int i = 1; i < b.length; i++) {

             if (b[i][0].equalsIgnoreCase(a)) {

                 System.out.println("\nalumno encontrado. \nResumen de calificaciones de " + a + ":");
                 for (int j = 1; j < b[0].length; j++) {
                     System.out.println(b[0][j] + ": " + b[i][j]);
                     promedio += Double.parseDouble(b[i][j]);
                 }
                 promedio = (promedio/(m-1));
                 System.out.println("promedio general: " + promedio);
                 return;

             }
         }

         System.out.println("Alumno no encontrado.");

    }
    public double generalProm(String[][] c, int alm) {

        double promG = 0;

        for (int i = 1; i < c.length; i++) {

            double promedio = 0;

            for (int j = 1; j < c[0].length; j++) {
                promedio += Double.parseDouble(c[i][j]);
            }
            promedio = (promedio/(c[0].length-1));
            promG += promedio;

        }

        return (promG/(alm-1));

    }
    public double noCompetentes(String[][] c) {

        double promG = 0;

        for (int i = 1; i < c.length; i++) {

            double promedio = 0;

            for (int j = 1; j < c[0].length; j++) {

                promedio += Double.parseDouble(c[i][j]);

            }

            promedio = (promedio/(c[0].length-1));
            if (promedio < 70) {
                System.out.println("Nombre: " + c[i][0] + ", Promedio: " + promedio);
            }
        }

        return 0;

    }
}

