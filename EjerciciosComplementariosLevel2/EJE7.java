/* 7. Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
Input (Entrada):
fizzBuzzFuncion(1,6) // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/
import java.util.*;

public class EJE7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1,v2;
        System.out.print("Ingrese valor de inicio del intervalo: ");
        v1 = sc.nextInt();
        System.out.print("Ingrese valor de final del intervalo: ");
        v2 = sc.nextInt();
        fizzBuzzFuncion(v1, v2);
        sc.close();
    }

    public static void fizzBuzzFuncion(int a,int b){
        String arrayS[] = new String[b-a+1];
        for (int i=a; i<b; i++){
            if(i%2 == 0){
                arrayS[i] = "Fizz";
            } else if(i%3 == 0){
                arrayS[i] = "Buzz";
            }else if (i%2==0 && i%3==0){
                arrayS[i] = "FizzBuzz";
            }else{
                // castea de entero a String (devuelve "valor")
                arrayS[i] = Integer.toString(i);
            }
        }

        for(int i = 0; i < arrayS.length; i++)
        {
            // Imprimimos los elementos del array en pantalla.
            System.out.println(arrayS[i]);
        }
    }
}
