/* 7. Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().
Entrada: informatorio
Salida: INFORMATORIO
*/
// La idea tener una lista con el alfabeto en mayúscula
// recorrer esta lista con un for e ir reemplazando caracter a caracter
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        String enMinuscula;
        String enMayuscula = "";
        char c = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra en minúscula: ");
        enMinuscula = sc.nextLine();

        for(int i=0; i< enMinuscula.length(); i++){
            c = enMinuscula.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - (int) 'a' + (int) 'A');
                enMayuscula=enMayuscula+c;
            }else{
                enMayuscula=enMayuscula+" ";
            }

        }
        System.out.println(enMayuscula);
        sc.close();
    }
}
