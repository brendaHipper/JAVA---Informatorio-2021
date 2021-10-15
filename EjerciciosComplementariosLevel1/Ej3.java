/*3. Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:
Entrada: 5
Salida:
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5       */
import java.util.Scanner;

public class Ej3 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int valorEntrada;
        System.out.print("Ingrese un valor entero numérico: ");
        valorEntrada = sc.nextInt();
        sc.close();
        

        for(int fila = 1; fila <= valorEntrada; fila++){
            for(int columna = 1; columna <= fila; columna++){
                System.out.print(columna+" ");
            }
            System.out.println(""); 
        }
    }
}
