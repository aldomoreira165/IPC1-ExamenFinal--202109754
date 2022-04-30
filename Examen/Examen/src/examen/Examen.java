package examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("*Seleccione una opción*");
        System.out.println("*1. Ejercicio 1       *");
        System.out.println("*2. Ejercicio 2       *");
        System.out.println("*3. Ejercicio 3       *");
        System.out.println("***********************");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void ejercicio1() {
        int num1, num2;
        int res1, res2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        res1 = leer.nextInt();
        res2 = leer.nextInt();
        if (res1 > res2) {
            System.out.println("El número mayor es " + res1);
        } else {
            System.out.println("El número mayor es " + res2);
        }
    }

    public static void ejercicio2() {
        Scanner leer = new Scanner(System.in);
        int numero;
        int cantidadAsteriscos;
        int cantidadFilas = 0;
        System.out.println("Ingrese un número impar");
        numero = leer.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                cantidadFilas = cantidadFilas + 1;
            }
        }

        for (int alto = 1; alto <= cantidadFilas; alto++) {
            for (int espacio = 1; espacio <= cantidadFilas-alto; espacio++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (alto*2)-1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
