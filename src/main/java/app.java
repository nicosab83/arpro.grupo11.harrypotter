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
        /** 1.1 - Solución by profesor. **/
        //        System.out.println("\nCantidad de Estudiantes por casa: ");
        //        for (String casa : new String[]{"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"}) {
        //            System.out.println("Casa: " + casa + " ==> " + hogwarts.getCasa(casa).getCantidadEstudiantes() + " estudiantes");
        //        }

        /** 1.2 - Solución by Grupo 11. **/
        hogwarts.cantidadEstudiantesPorCasa();


        /** 2. Un listado de todos aquellos estudiantes no humanos independientemente de la casa en la que se encuentren.**/
        /** 2.1 - Solución inicial trabajando con la lista de estudiantes. **/
        //        System.out.println("\n\n=============================");
        //        System.out.println("ESTUDIANTES NO HUMANOS ENCONTRADOS:");
        //        for (Estudiante e : lista)
        //            if (!e.getEspecie().toUpperCase().trim().equals("HUMAN")) {
        //                System.out.println(e);
        //            }

        /** 2.2 - Solución delegando en objetos Escuela -> Casa. **/
        hogwarts.printEstudiantesNoHumanos();


        /** LISTAR TODOS LOS ESTUDIANTES DE HOGWARTS DESDE LAS CASAS. **/
        hogwarts.getEstudiantes();

    }

/*
    private void menuDeOpciones(){

        int opcion = -1;
        while(opcion != 0){
            System.out.println("\n\nMENU DE OPCIONES: \n----------------------------------");
            System.out.println("1. Lista de casas con cantidad de estudiantes.");
            System.out.println("2. Lista de estudiantes de Hogwarts no humanos");
            System.out.println("3. Lista de todos los estudiantes de Hogwarts");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una de las opciones: ");
            opcion = miEscanner.nextInt();

            switch(opcion){
                case 1:
                    hogwarts.cantidadEstudiantesPorCasa();
                    break;
                case 2:
                    hogwarts.printEstudiantesNoHumanos();
                    break;
                case 3:
                    hogwarts.getEstudiantes();
                    break;
                case 0:
                    System.out.println("Adios....!");
                    break;
                default:
                    System.err.println("Opción invalida!.");
            }
        }
*/

}
