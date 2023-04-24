import modelo.Estudiante;
import proceso.Hogwarts;
import proceso.ProcesadorArchivoCsv;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner miEscanner = new Scanner(System.in);

        System.out.println("Cargador de Datos de Hogwards\n=============================\n\n");

        System.out.print("Ingrese el nombre del archivo de datos: ");
        String nombreArchivo = miEscanner.nextLine();
        if(nombreArchivo == ""){
            System.out.print("\u001B[33mSe toma nombre del archivo por defecto!\u001B[0m\n\n");
            nombreArchivo = "HarryPotter-data.csv";
        }

        System.out.println("\nProcesando archivo...");
        ProcesadorArchivoCsv procArchivo = new ProcesadorArchivoCsv(nombreArchivo);
        ArrayList<Estudiante> lista = procArchivo.procesarArchivoConValidacion();
        System.out.println("Proceso finalizado, " + lista.size() + " estudiantes leídos.");


//        System.out.println("\nLista de Estudiantes:");
//        for (Estudiante e : lista)
//            System.out.println(e);

        Hogwarts hogwarts = new Hogwarts();
        for (Estudiante e : lista) {
            hogwarts.agregarEstudiante(e);
        }

        /** 1. Un listado con cada casa y la cantidad de estudiantes agregados a dicha casa. **/
        /** SOLUCIÓN PROFESOR: **/
//        System.out.println("\nCantidad de Estudiantes por casa: ");
//        for (String casa : new String[]{"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"}) {
//            System.out.println("Casa: " + casa + " ==> " + hogwarts.getCasa(casa).getCantidadEstudiantes() + " estudiantes");
//        }

        /** SOLUCIÓN EQUIPO: **/
        hogwarts.cantidadEstudiantesPorCasa();


        /** 2. Un listado de todos aquellos estudiantes no humanos independientemente de la casa en la que se encuentren.**/
        /** SOLUCIÓN Solución inicial trabajando con la lista de estudiantes. **/
//        System.out.println("\n\n=============================");
//        System.out.println("ESTUDIANTES NO HUMANOS ENCONTRADOS:");
//        for (Estudiante e : lista)
//            if (!e.getEspecie().toUpperCase().trim().equals("HUMAN")) {
//                System.out.println(e);
//            }

        /** Solución delegando en objetos Escuela -> Casa. **/
        hogwarts.printEstudiantesNoHumanos();
        
    }

}
