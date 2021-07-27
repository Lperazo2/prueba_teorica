
package dominio;

public class Profesor {
    private String Nombre_profesor;
    private String Facultad_que_pertenece;
    
    private int edad;
    private String Especialidad;
    private int [] MATERIAS_IMPARTIDAS=new int[5];

    public Profesor(String Nombre_profesor, String Facultad_que_pertenece, int edad, String Especialidad) {
        this.Nombre_profesor = Nombre_profesor;
        this.Facultad_que_pertenece = Facultad_que_pertenece;
        this.edad = edad;
        this.Especialidad = Especialidad;
    }
        
}
