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
            case 3:
                ejercicio3();
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
        System.out.println("Ingrese un número impar: ");
        numero = leer.nextInt();
        while (numero % 2 == 0) {
            System.out.println("¡No puede ingresar un número par!");
            System.out.println("Ingrese un número impar: ");
            numero = leer.nextInt();
        }
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                cantidadFilas = cantidadFilas + 1;
            }
        }
        System.out.println("Piramide generada: ");
        for (int alto = 1; alto <= cantidadFilas; alto++) {
            for (int espacio = 1; espacio <= cantidadFilas - alto; espacio++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (alto * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void ejercicio3() {
        Scanner leer = new Scanner(System.in);
        int vacas_a_la_venta;
        int peso_maximo_camion_total;
        int[] listaPesos = new int[100];
        int[] produccionVaca = new int[100];

        System.out.println("Ingrese el número de vacas disponibles para la venta: ");
        vacas_a_la_venta = leer.nextInt();
        System.out.println("Ingrese el peso límite del camión (kg): ");
        peso_maximo_camion_total = leer.nextInt();
        for (int i = 0; i < vacas_a_la_venta; i++) {
            System.out.println("Ingrese el peso en kilogramos de la vaca " + (i+1));
            listaPesos[i] = leer.nextInt();
            System.out.println("Ingrese la producción de leche por día en litros de la vaca " + (i+1));
            produccionVaca[i] = leer.nextInt();
        }

        for (int i = 0; i < cantidad; i++) {
            
        }

    }

}
