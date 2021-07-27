
package dominio;

public class Estudiantes {
    private int cedula;
    private String nombre;
    private String Carrera;
    private int[] NRCs=new int [5];
    private String UNiversidad;

    public Estudiantes(int cedula, String nombre, String Carrera, String UNiversidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Carrera = Carrera;
        this.UNiversidad = UNiversidad;
    }
    
}
