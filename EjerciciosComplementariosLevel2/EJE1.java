/* 1. Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking 
Input (Entrada):
Bariloche
Córdoba
Resistencia
Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia   */
import java.util.*;

public class EJE1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Declaro el ArrayList de ciudades
        List <String> Ciudades = new ArrayList<>();
        String respuesta = "si";
        String ciudad;
        
        while(respuesta.equals("si")){
            System.out.print("Ingrese su ciudad favorita: ");
                ciudad = sc.nextLine();
                Ciudades.add(ciudad);
                System.out.print("Desea ingresar otra ciudad? (si/no): ");
                respuesta = sc.nextLine();
            if (respuesta == "no".toUpperCase()){
                respuesta = "";
                System.out.println("Adios");
            }
        }

        for (String c : Ciudades) {
            System.out.println("#"+(Ciudades.indexOf(c)+1)+" - "+c);
        }

        sc.close();
    }
}
