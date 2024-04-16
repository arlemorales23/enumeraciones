package ejemplo10;

public enum TipoProducto {
    @ProductoMetadata(nombre = "Camiseta", precio = 19.99, categoria = Categoria.ROPA)
    CAMISETA,

    @ProductoMetadata(nombre = "Pantalón", precio = 34.99, categoria = Categoria.ROPA)
    PANTALON,

    @ProductoMetadata(nombre = "Teclado", precio = 49.99, categoria = Categoria.TECNOLOGIA)
    TECLADO,

    @ProductoMetadata(nombre = "Ratón", precio = 24.99, categoria = Categoria.TECNOLOGIA)
    RATON,

    @ProductoMetadata(nombre = "Silla", precio = 79.99, categoria = Categoria.HOGAR)
    SILLA,

    @ProductoMetadata(nombre = "Televisor", precio = 599.99, categoria = Categoria.ELECTRONICA)
    TELEVISOR
}