package ejemplo9;

public class Main {
    public static void main(String[] args) {
        TipoAnimal miAnimal = TipoAnimal.PERRO;
        miAnimal.hacerSonido(); // Imprime "Guau guau"

        Animal otroAnimal = TipoAnimal.GATO;
        otroAnimal.hacerSonido(); // Imprime "Miau miau"
    }
}


