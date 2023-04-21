import java.util.Locale;

public class Estudiante {

    private int numero;
    private String nombre;
    private char genero;
    private Casa casa;
    private String especie;
    private String status;

    public Estudiante(int unNumero, String unNombre, String unGenero){
        numero = unNumero;
        nombre = unNombre;
        genero = setGenero(unGenero);
    }

    private char setGenero(String unGenero){
        unGenero = unGenero.toUpperCase();
        char gen = unGenero.charAt(0);
        if(gen != 'M' || gen != 'F' ){
            return 'O';
        } else {
            return gen;
        }
    }





}
