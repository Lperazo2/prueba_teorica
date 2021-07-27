
package dominio;

public class Universidad {
    private String nombre;
    private String RECTOR;
    private int [] FACULTADES =new int[20];
    private int [] CERRERAS =new int[50];
    private int [] PROFESORES = new int[200];
    private int[] ALUMNOS= new int[5000];
    private int[] MATERIAS =new int [125];

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
}
