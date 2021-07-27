
package dominio;


public class Materias {
    private String Nombre;
    private int NRC;
    private int[] CARERRAS_CON_PARECIDA_MALLA = new int[3];
    private int [] ESTUDIANTES=new int[45];
    private int [] PROFESOREES = new int[5];
    public Materias(String Nombre, int NRC) {
        this.Nombre = Nombre;
        this.NRC = NRC;
    }
}
