/* 1. Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!”
Entrada: Obi Wan Kenobi
Salida: HOLA Obi Wan Kenobi */

import java.util.Scanner;

public class Ej1{

    public static void main(String[] args){

        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("HOLA "+nombre);

        /* Cierra Scanner y cierra la advertencia => Resource leak: 'in' is never closed */
        /* En el caso de String averiguar porque va al final del programa*/
        sc.close();
    }
}