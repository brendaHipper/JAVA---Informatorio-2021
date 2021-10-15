/* 4. Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
Input (Entrada): 5
Output (Salida): El factorial de 5 es: 120 */
import java.util.Scanner;

public class Ej4 {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un valor entero numérico: ");
        numero = sc.nextInt();
        sc.close();

        System.out.println("El factorial de "+numero+" es: "+CalcularFactorial(numero));
    }

    public static int CalcularFactorial(int nro){
        int factorial = 0;

        if (nro == 0 || nro == 1){
            return 1;
        } else {
            factorial = nro * CalcularFactorial(nro-1);
        }
        return factorial;
    }
}
