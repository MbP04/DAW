import java.util.ArrayList;
import java.util.List;

public class test_uni {
    public static void main(String[] args) {
        List<persona> personas = new ArrayList<>();

        // Añadir estudiantes a la lista
        direccion direccion1 = new direccion("Calle Colon", "Valencia", "12345",
                "España");
        estudiante estudiante1 = new estudiante("Marc", direccion1, "Burguera", "12345678A", 1);
        personas.add(estudiante1);
        estudiante estudiante2 = new estudiante("Alvaro", direccion1, "Escartí", "87654321B", 2);
        personas.add(estudiante2);
        profesor profesor1 = new profesor("Gines", "Martines", "98765432C", direccion1, "123");
        personas.add(profesor1);
        profesor profesor2 = new profesor("Vicent", "Tatay", "65432189D", direccion1, "456");
        personas.add(profesor2);

        // Imprimir la lista de personas
        for (persona persona : personas) {
            System.out.println(persona);
        }
    }
}