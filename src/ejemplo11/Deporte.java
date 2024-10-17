package ejemplo11;

public enum Deporte implements deporteInferface{
    VOLLEYBALL("Mera chimba",1) {
        @Override
        public void showInfo() {

        }
    },
    FUTBOL("patas",2) {
        @Override
        public void showInfo() {

        }
    },
    PADEL("chimba",3){
        public void showInfo(){

        }
    };

    private int numero;   //Propiedad
    private String descripcionDeporte;  //Propiedades

    Deporte(String descripcionDeporte, int numero) {
        this.descripcionDeporte = descripcionDeporte;
        this.numero = numero;
    }
    public abstract void showInfo();
    public void info2(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcionDeporte() {
        return descripcionDeporte;
    }

    public void setDescripcionDeporte(String descripcionDeporte) {
        this.descripcionDeporte = descripcionDeporte;
    }

    @Override
    public void show() {

    }
}
