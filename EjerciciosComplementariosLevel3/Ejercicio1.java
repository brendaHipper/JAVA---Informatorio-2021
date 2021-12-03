package EjerciciosComplementariosLevel3;
// ACLARACIÓN --> Los Ej de la Guía 3 se resuelvven a través de Streams
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        List <String> palabras = new ArrayList<>();
        palabras.add(null);
        palabras.add("Lupa");
        palabras.add("");
        palabras.add("Trueno");
        palabras.add("Casa");
        palabras.add(null);
        
        List <String> listaResultante = palabras.stream()
            .filter(palabra -> palabra != null)
            .filter(palabra -> palabra != "")
            .collect(Collectors.toList());
        System.out.println(listaResultante);
        
        // ["Lupa", "Trueno","Casa"]
        // .distinct(palabra != ' ');
        // ver métodos como trim() que remueve los espacios en blanco de cada extremo del string
        /* Stream <String> listaResultante = palabras.stream().filter(); la idea seria un foreach aca adentro*/
    }
}
