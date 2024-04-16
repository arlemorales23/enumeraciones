package ejemplo5;

class Ejemplo{
    public static void main(String[] args) {
        Direccion miDireccion = Direccion.NORTE;
        System.out.println("La abreviación es "+ miDireccion.getAbreviacion() +
                " de la ciuda de "+miDireccion.getCiudad());
    }
}

