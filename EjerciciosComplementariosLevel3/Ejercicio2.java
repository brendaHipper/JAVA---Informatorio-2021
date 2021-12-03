package EjerciciosComplementariosLevel3;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> valores = List.of(1, 2, 3, 4, 5);
		List<Integer> cuadrados = valores.stream()
            .map(n -> n*n)
            .collect(Collectors.toList());
		System.out.println(cuadrados);
    }
}
