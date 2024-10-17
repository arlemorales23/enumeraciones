package ejemplo1;

public enum Direccion {
    NORTE, SUR, ESTE, OESTE
}

class Main implements IEmpleado{
    public static void main(String[] args) {
        Direccion miDireccion = Direccion.NORTE;
        System.out.println(miDireccion);
    }

    @Override
    public void mostrar() {

    }

    @Override
    public String MostrarOtrosDatos() {
        return "";
    }
}

