/* 6. Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.    */
import java.util.*;


public class EJE6 {
    public static void main(String[] args) {

        HashSet <Empleado> empleados = new HashSet<Empleado>();
        Empleado e1 = new Empleado("Lucia Alvarado","37896458", 2, 20);
        empleados.add(e1);
        Empleado e2 = new Empleado("Patricio Funes","37542639", 3, 150);
        empleados.add(e2);
        Empleado e3 = new Empleado("Camila Gonzalez","31652628", 5, 80);
        empleados.add(e3);

        HashMap<String, Integer> sueldos = new HashMap<>();

        for (Empleado i : empleados) {

            sueldos.put(i.getDni(), i.CalcularSueldo());
        }
        System.out.println(sueldos);
    }      
}

class Empleado {
    private String nombreYapellido;
    private String dni;
    private int horasT;
    private int valorPorHs;
    
    public Empleado(){}

    public Empleado(String nombreYapellido, String dni, int horasT, int valorPorHs) {
        this.nombreYapellido = nombreYapellido;
        this.dni = dni;
        this.horasT = horasT;
        this.valorPorHs = valorPorHs;
    }

    public double CalcularSueldo(){
        double total = this.horasT * this.valorPorHs;
        return total;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }
    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }
    public int getValorPorHs() {
        return valorPorHs;
    }
    public void setValorPorHs(int valorPorHs) {
        this.valorPorHs = valorPorHs;
    }
    
} 

