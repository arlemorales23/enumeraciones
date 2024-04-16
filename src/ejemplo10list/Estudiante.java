package ejemplo10list;

public class Estudiante {
    private Integer id;
    private String nombre;
    private String Email;

    public Estudiante(Integer id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        Email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
