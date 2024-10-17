package ejemplo10;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        TipoProducto producto = TipoProducto.CAMISETA;
        ProductoMetadata metadata = producto.getClass().getField(producto.name()).getAnnotation(ProductoMetadata.class);

        System.out.println("Nombre: " + metadata.nombre());
        System.out.println("Precio: " + metadata.precio());
        System.out.println("Categoría: " + metadata.categoria());
    }
}
