
package dominio;

public class Facultad {
    private String nombre_de_la_facultad;
    private String Director;
    private String Universidad;
    private int [] CARERRAS =new int[10];
    private int[] DOCENTES =new int [20];

    public Facultad(String nombre_de_la_facultad, String Director, String Universidad) {
        this.nombre_de_la_facultad = nombre_de_la_facultad;
        this.Director = Director;
        this.Universidad = Universidad;
    }
    
}
