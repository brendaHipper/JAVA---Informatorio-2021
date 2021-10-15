/* 3. Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir. 
Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso   */
import java.util.*;

public class EJE3 {
    public static void main(String[] args) {
        // Declaro el ArrayList para cartas
        List <String> BarajaCartas = new ArrayList<>();
        // Agregando valores en orden
        BarajaCartas.add("2");
        BarajaCartas.add("3");
        BarajaCartas.add("4");
        BarajaCartas.add("5");
        BarajaCartas.add("6");
        BarajaCartas.add("7");
        BarajaCartas.add("8");
        BarajaCartas.add("9");
        BarajaCartas.add("10");
        BarajaCartas.add("J");
        BarajaCartas.add("Q");
        BarajaCartas.add("K");
        BarajaCartas.add("A");

        System.out.println("Baraja de cartas Original");
        for (int i = 0; i <BarajaCartas.size() ; i++) {
            System.out.print(BarajaCartas.get(i)+" ");
        }

        System.out.println("\nBaraja de cartas en reverso");
        Collections.reverse(BarajaCartas);
        for (int i = 0; i <BarajaCartas.size() ; i++) {
            System.out.print(BarajaCartas.get(i)+" ");
        }
        
        System.out.println("\nMezcla de cartas");
        Collections.shuffle(BarajaCartas);

        for (int i = 0; i <BarajaCartas.size() ; i++) {
            System.out.print(BarajaCartas.get(i)+" ");
        }

        System.out.println();
    }
}
