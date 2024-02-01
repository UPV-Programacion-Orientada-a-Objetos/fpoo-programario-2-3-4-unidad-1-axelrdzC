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

    // ejercicio 1 - 6
    public double langosta(double a) {
        double platillo = 0;
        if (a <= 200) {
            platillo = 95;
        } else if (a > 200 & a <= 300) {
            platillo = 85;
        } else { platillo = 75; }

        return platillo;
    }

    // ejercicio 1 - 7
    public double uvas(double kilo, String tipo, double tam) {

        double total = 0;

        if (tipo.equals("a") && tam == 1) {
            total = kilo+20;
        } else if (tipo.equals("a") && tam == 2) {
            total = kilo+30;
        } else if (tipo.equals("b") && tam == 1) {
            total = kilo-30;
        } else if (tipo.equals("b") && tam == 2) {
            total = kilo-50;
        } else {System.out.println("Ingreso valores incorrectos.");}

        return total;

    }

    // ejercicio 1 - 8
    public double viajeAl(double a) {
        double costo = 0;
        if (a > 100) {
            costo = 65*a;
            System.out.println( "\nEl costo del viaje es de: " + costo + ", cada alumno pagara $65");
        } else if (a >= 50 & a <= 99) {
            costo = 70*a;
            System.out.println( "\nEl costo del viaje es de: " + costo + ", cada alumno pagara $70");
        } else if (a >= 30 & a <= 49) {
            costo = 95*a;
            System.out.println( "\nEl costo del viaje es de: " + costo + ", cada alumno pagara $95");
        }else {
            costo = 4000;
            System.out.println( "\nEl costo del viaje es de: " + costo + ", cada alumno pagara $" + costo/a);
        }

        return costo;
    }

    // ejercicio 1 - 9
    public double chismefon(double min) {

        double costo = 0;

        if (min <= 5) {
            costo = min * 1.00;
        } else if (min <= 8) {
            costo = 5 * 1.00 + (min - 5) * 0.80;
        } else if (min <= 10) {
            costo = 5 * 1.00 + 3 * 0.80 + (min - 8) * 0.70;
        } else {
            costo = 5 * 1.00 + 3 * 0.80 + 2 * 0.70 + (min - 10) * 0.50;
        }

        return costo;

    }
    public double imp(int dia, int horario) {
        double impuesto = 0;
        if (dia == 1) {
            impuesto = 0.03;
        } else if (dia == 2) {
            if (horario == 1) {
                impuesto = 0.15;
            } else if (horario == 2) {
                impuesto = 0.10;
            }
        } else { System.out.println("Valor incorrectos"); }

        return impuesto;
    }


}
