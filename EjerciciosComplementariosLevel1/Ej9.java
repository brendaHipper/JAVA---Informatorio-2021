/* 9. Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.
Input (Entrada):
Hola Informatorio Java 2020.
a
Output (Salida):
4*/
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        
        String cadena;
        char letra;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        cadena = sc.nextLine();
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);

        for(int i=0; i< cadena.length(); i++){
            if(cadena.charAt(i) == letra){
                contador += 1;
            }
        }

        System.out.println("La letra "+letra+" se repite en la cadena "+contador+" veces");
        sc.close();
    }
}
