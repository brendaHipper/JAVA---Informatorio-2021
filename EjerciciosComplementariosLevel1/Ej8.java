/* 8. Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
Ej Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield 
Output (Salida):
Springfield - Calle Falsa 1234 - 48 - Homero Simpson  */
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        String nombre,direccion,ciudad,edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = sc.nextLine();
        System.out.print("Ingrese domicilio: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese ciudad: ");
        ciudad = sc.nextLine();

        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);

        sc.close();
    }
}
