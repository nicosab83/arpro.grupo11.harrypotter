import java.util.ArrayList;

public class Casa {

    private int id;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Casa(int unId, String unNombre){
        id = unId;
        nombre = unNombre;
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    public int cantidadEstudiantes(){
        return estudiantes.size();
    }



}
