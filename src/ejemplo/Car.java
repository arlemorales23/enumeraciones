package ejemplo;

public enum Car {
    MAZDA("hdashjsa") {
        @Override
        void mostrar() {

        }
    },
    CHEVROLET("hsakj") {
        @Override
        void mostrar() {

        }
    },
    FIAT("djsd") {
        @Override
        void mostrar() {

        }
    };

    private String descripcion;

    Car(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    abstract  void mostrar();
}
