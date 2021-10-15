/* 5. Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).*/
import java.util.Scanner;

public class Ej5 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int nro1,nro2;
        System.out.print("Ingrese primer valor: ");
        nro1 = sc.nextInt();
        System.out.print("Ingrese segundo valor: ");
        nro2 = sc.nextInt();
        sc.close();

        System.out.println("El factorial de es: "+mpss(nro1,nro2));
    } 

    // Funcion mpss = multiplicación por sumas sucesivas
    public static int mpss(int v1,int v2){
        int resultado = 0;
        if (v1 == 0){
            return 0;
        } else {
            // v1 como contador
            if (v1 > 0){
                resultado = v2 + mpss(v1-1,v2);
            }
        }
        return resultado;
    }
}
