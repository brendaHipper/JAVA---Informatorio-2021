/* 2. Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números. 
Salida: 5 + 4 = 9
        5 - 4 = 1
        5 * 4 = 20
        5 / 4 = 1
        5 % 4 = 1*/
import java.util.Scanner;

public class Ej2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        float nro1,nro2;
        System.out.print("Ingrese primer valor: ");
        nro1 = sc.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        nro2 = sc.nextFloat();
        
        /* Cierra Scanner y cierra la advertencia Fuga de recursos.*/
        sc.close();

        System.out.println(nro1+" + "+nro2+" = "+(nro1+nro2));
        System.out.println(nro1+" - "+nro2+" = "+(nro1-nro2));
        System.out.println(nro1+" * "+nro2+" = "+(nro1*nro2));
        System.out.println(nro1+" / "+nro2+" = "+(nro1/nro2));
        System.out.println(nro1+" % "+nro2+" = "+(nro1%nro2));
    }
}
