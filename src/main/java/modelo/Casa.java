package modelo;

import java.util.ArrayList;

public class Casa {

    private int idCasa;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Casa(int idCasa, String nombre) {
        this.idCasa = idCasa;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public int getCantidadEstudiantes(){
        return estudiantes.size();
    }

    public void agregarEstudiante(Estudiante e){
        if (e != null && e.getNombreCasa().equals(nombre)){
            e.setCasa(this);
            estudiantes.add(e);
        }
        else
            throw new RuntimeException("Nombre de casa inválido. [" + e.getNombreCasa() + "]");
    }

    // TODO: Resuelto punto 2 delegando.
    public void searchEstudiantesNoHumanos(){
        for (Estudiante e : this.estudiantes)
            if (!e.getEspecie().trim().equals("Human")) {
                System.out.println(e);
            }
    }

//    public ArrayList<Estudiante> searchEstudiante(){
//        ArrayList<Estudiante> searchResult = new ArrayList<>();
//        for (Estudiante e : this.estudiantes)
//            if (!e.getEspecie().trim().equals("Human")) {
//                System.out.println(e);
//                searchResult.add(e);
//            }
//        return searchResult;
//    }

}
