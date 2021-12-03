package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        List<Integer> enteros = List.of(0,1, 5, 2, 4, 4, 4, 5, 5);
        List<Integer> factorial = enteros.stream()
            .map(n -> calcularFactorial(n))
            .distinct()
            .collect(Collectors.toList());
		System.out.println(factorial);
    }

    public static int calcularFactorial(Integer nro){
        int factorial = 0;

        if (nro == 0 || nro == 1){
            return 1;
        } else {
            factorial = nro * calcularFactorial(nro-1);
        }
        return factorial;
    }
}
