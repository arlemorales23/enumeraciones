package ejemplo10list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalEstudiante {
    public static void main(String[] args) {
        List<Estudiante>  estudianteList = new ArrayList<>(Arrays.asList(
                new Estudiante(1, "Jose Diaz", "jose@hotmail.com"),
                new Estudiante(2, "Ana Perez", "ana@hotmail.com"),
                new Estudiante(3, "Juana Lopez", "juana@gmail.com")
                ));
        estudianteList.remove(1);

        for (Estudiante estudiante : estudianteList) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Correo: " + estudiante.getEmail());
        }
        
    }
}
