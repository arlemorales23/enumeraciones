package ejemplo7;

import java.io.Closeable;
import java.io.IOException;

public enum Deportes implements Closeable {
    FUTBOL(7) {
        @Override
        public String getDetail() {
            return "como estamos genteee";
        }
    },BALONCESTO(6) {
        @Override
        public String getDetail() {
            return "holii";
        }
    };
    private int numeroJugadores;
    public abstract String getDetail();
    Deportes(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public void close() throws IOException {

    }
}
