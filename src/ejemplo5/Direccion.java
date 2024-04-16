package ejemplo5;
enum Direccion {
    NORTE("N", "Armenia", 12), SUR("S", "Armenia", 3),
    ESTE("E", "Pereira", 4), OESTE("O", "Cali", 4),
    MANIZALES("N", "Manizales", 4);
    private String abreviacion;
    private String  Ciudad;
    private int numeroH;

    Direccion(String abreviacion, String ciudad, int numeroH) {
        this.abreviacion = abreviacion;
        Ciudad = ciudad;
        this.numeroH = numeroH;
    }

    public String getAbreviacion() {
        return abreviacion;
    }
    public String getCiudad() {
        return Ciudad;
    }
}
