package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List <String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
        "Wonder Woman", "brainiac");
        // se declara al contador como long, porque el método count() retorna un tipo long
        long contador = palabras.stream()
            .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
            .count();    
        System.out.println(contador);
        
        // Me devuelve una lista con las palabras que comiencen en "B" o "b"
        // List <String> palabrasConB = palabras.stream()
        //     .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
        //     .collect(Collectors.toList());  
        // System.out.println(palabrasConB);
    }
}
