/* 4. Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?  */
import java.util.*;

public class EJE4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List <String> Alumnos = new ArrayList<>();
        
        String nombre = "";

        for(int i=0 ; i < 12; i++){
            System.out.print("Ingrese nombre del estudiante: ");
            nombre = sc.nextLine();
            Alumnos.add(nombre);
        }
        //Imprime todos los alumnos
        // for (String alumno : Alumnos) {
        //     System.out.println(alumno);
        // }
        List <String> Curso1 = Alumnos.subList(0, 4);
        List <String> Curso2 = Alumnos.subList(4, 8);
        List <String> Curso3 = Alumnos.subList(8, Alumnos.size());

        System.out.println("Alumnos Curso 1");
        for (String c1 : Curso1) {
            System.out.println(c1);
        }

        System.out.println("Alumnos Curso 2");
        for (String c2 : Curso2) {
            System.out.println(c2);
        }

        System.out.println("Alumnos Curso 3");
        for (String c3 : Curso3) {
            System.out.println(c3);
        }

        sc.close();
    }   
}
