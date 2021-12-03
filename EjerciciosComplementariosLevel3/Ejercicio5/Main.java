package EjerciciosComplementariosLevel3.Ejercicio5;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List <Alumno> alumnos = List.of(
                new Alumno("Isabel", "Allende", LocalDate.of(1942, 8, 2)),
                new Alumno("Martín", "Caparrós", LocalDate.of(1957, 5, 29)),
                new Alumno("Mario", "Vargas Llosa", LocalDate.of(1936, 3, 28)),
                new Alumno("Eduardo", "Sacheri", LocalDate.of(1967, 12, 13)),
                new Alumno("Julia", "Moret", LocalDate.of(1978, 4, 11)));
        Map<String, Integer> edades = alumnos.stream()
            .collect(Collectors
            .toMap(alum-> (alum.toString()),
            alum -> obtenerEdad(alum.getFechaDeNac())));
        System.out.println(edades);
    }

    public static Integer obtenerEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    } 
}
