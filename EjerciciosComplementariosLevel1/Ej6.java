/* 6. Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías). */
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro1,nro2;
        System.out.print("Ingrese la base: ");
        nro1 = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        nro2 = sc.nextInt();
        sc.close();

        System.out.println("El resultado de la potencia: "+ppms(nro1,nro2));
    }

    // Funcion ppms = potencia por multiplicaciones sucesivas
    public static int ppms(int base,int exponente){
        int resultado = 0;
        if (exponente == 0){
            return 1;
        } else {
            // exponente como contador, lo que se va restando en cada multiplicación, manteniéndose la base
            if (exponente > 0){
                resultado = base * ppms(base,exponente-1);
            }
        }
        return resultado;
    }
}
