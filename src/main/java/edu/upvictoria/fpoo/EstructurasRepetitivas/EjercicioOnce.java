package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.IOException;

public class EjercicioOnce {

    public EjercicioOnce() throws IOException {

        int km1 = 70;
        int km2 = 150;

        while (km1 != km2) {
            km1++;
            km2--;

            if (km1 > 200 || km2 < 0) {
                System.out.println("no se van a encontrar.");
                break;
            }
        }

        if (km1 == km2) {
            System.out.println("se van a encontrar km " + km1);
        }

    }

}
