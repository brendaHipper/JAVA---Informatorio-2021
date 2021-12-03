package EjerciciosComplementariosLevel3.Ejercicio5;
import java.time.LocalDate;

public class Alumno {

    private String nombre;
    private String apellido;
    private LocalDate fechaDeNac;

    public Alumno(){}

    public Alumno(String nombre, String apellido, LocalDate fechaDeNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNac = fechaDeNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNac() {
        return fechaDeNac;
    }

    public void setFechaDeNac(LocalDate fechaDeNac) {
        this.fechaDeNac = fechaDeNac;
    }

    @Override
    public String toString() {
        return nombre +" "+ apellido;
    }
}
