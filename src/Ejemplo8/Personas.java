package Ejemplo8;

import java.io.Closeable;
import java.io.IOException;

public enum Personas implements Closeable {
    JUAN(175, 18) {
        @Override
        public String arle() {
            return null;
        }

        @Override
        public String programacion() {
            return "estamos programando";
        }
    }, DIEGO(184, 17) {
        @Override
        public String arle() {
            return null;
        }

        @Override
        public String programacion() {
            return null;
        }
    };
    private int altura;
    private int edad;

    Personas(int altura, int edad) {
        this.altura = altura;
        this.edad = edad;
    }

    public abstract String arle();

    public abstract String programacion();

    @Override
    public void close() throws IOException {

    }
}
