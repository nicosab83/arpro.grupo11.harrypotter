import modelo.Estudiante;
import org.junit.Test;

public class TestEstudiante {

    @Test
    public void estudianteEsHumano(){
        //int numero, String nombre, char genero, String especie, String blodStatus
        Estudiante estu = new Estudiante(1,"Pepe",'M', "Humano", "RH +");
        System.out.println(estu.getEspecie().equals("Humano"));
    }

    @Test
    public void estudianteEsNoHumano(){
        //int numero, String nombre, char genero, String especie, String blodStatus
        Estudiante estu = new Estudiante(1,"Pepe",'M', "No Humano", "RH +");
        System.out.println(estu.getEspecie().equals("Humano"));
    }

    @Test
    public void estudianteEsHumanoPrint(){
        //int numero, String nombre, char genero, String especie, String blodStatus
        Estudiante estu = new Estudiante(1,"Pepe",'M', "Humano", "RH +");
        if(estu.getEspecie().equals("Humano")){
            System.out.println(estu.getNombre());
        }
    }
    @Test
    public void estudianteEsNoHumanoPrint(){
        //int numero, String nombre, char genero, String especie, String blodStatus
        Estudiante estu = new Estudiante(1,"Pepe",'M', "No Humano", "RH +");
        if(estu.getEspecie().equals("Humano")){
            System.out.println(estu.getNombre());
        }
    }

    @Test
    public void testTrim(){
        String cadena = "       Hola mundo      ";
        String resultado = cadena.trim();

        System.out.println("**"+cadena+"**");
        System.out.println("**"+resultado+"**");
    }



}
