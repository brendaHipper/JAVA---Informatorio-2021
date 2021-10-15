/* 2. Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición). */
import java.util.*;

public interface EJE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaro el ArrayList de enteros
        List <Integer> enteros = new ArrayList<>();
        int valor = 0;

        for (int i= 0; i < 5; i++){
            System.out.print("Ingrese un valor entero: ");
            valor = sc.nextInt();
            enteros.add(valor);
        }

        for (Integer iterador : enteros) {
            System.out.print(iterador+" ");
        }

        System.out.println("\nCantidad de elementos en la lista: "+enteros.size());

        // Se agrega elemento al principio y al final de la lista
        System.out.print("Agregue valor al principio de la lista: ");
        valor = sc.nextInt();
        enteros.add(0,valor);
        System.out.print("Agregue un valor al final de la lista: ");
        valor = sc.nextInt();
        enteros.add(enteros.size(),valor);
        
        for (Integer iterador : enteros) {
            System.out.print(iterador+" ");
        }

        System.out.println("\nCantidad de elementos en la lista: "+enteros.size());

        sc.close();
    }
}
