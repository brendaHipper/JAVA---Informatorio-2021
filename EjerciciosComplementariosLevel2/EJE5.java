/* 5. Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915      */
import java.util.*;

public class EJE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora,valorHs;
        int total;
        int totalTotales = 0;
        List <Integer> Horas = new ArrayList<>();
        List <Integer> ValorPorHs = new ArrayList<>();
        List <Integer> TotalesPorDia = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.print("Ingrese cantidad de horas por dia: ");
            hora = sc.nextInt();
            Horas.add(hora);
            System.out.print("Ingrese valor por hora: ");
            valorHs = sc.nextInt();
            ValorPorHs.add(valorHs);
            total = Horas.get(i) * ValorPorHs.get(i);
            TotalesPorDia.add(total);
        }

        for(int i=0; i<5; i++){
            // Imprimo el vector de Totales por día
            System.out.print(TotalesPorDia.get(i)+" ");
            // Acumulador totalTotales
            totalTotales += TotalesPorDia.get(i);
        }

        System.out.println("\nEl total a abonar es: "+totalTotales);

        sc.close();
    }
}
