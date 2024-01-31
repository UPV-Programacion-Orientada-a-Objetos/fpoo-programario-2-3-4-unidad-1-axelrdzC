package edu.upvictoria.fpoo.Cerebro;

public class matematicas {

    // ejercicio 1 - 1
    public double mayorComp(double a, double b) {
        if (a < b) { System.out.println( b + " es mayor que " + a ); }
        else { System.out.println( a + " es mayor que " + b ); }
        return 0;
    }

    public double mayorCom(double a, double b) {
        if (a < b) { return b; }
        else { return a; }
    }

    // ejercicio 1 - 2
    public double posneg(double a) {
        if (a < 0) { System.out.println( a + " es un numero negativo " + a ); }
        else { System.out.println( a + " es un numero positivo" ); }
        return 0;
    }

    // ejercicio 1 - 3
    public double multiplicar(double a, double b) {
        return a*b;
    }

    // ejercicio 1 - 4
    public double descuento(double a, double b, double c) {
        double total = 0.0;
        if (a > 2500 ) { total = a-(a*b); }
        else { total = a-(a*c); }
        return total;
    }

    // ejercicio 1 - 5
    public double mayor3(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else { return c; }
    }

    // ejercicio 1 - 8
    public double langosta(double a) {
        double platillo = 0;
        if (a <= 200) {
            platillo = 95;
        } else if (a > 200 & a <= 300) {
            platillo = 85;
        } else { platillo = 75; }

        return platillo;
    }


}
