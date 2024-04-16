package ejemplo4;

public enum Animal {
    PERRO(9), GATO(3), ZEBRA(2931);
    private int patas;

    Animal(int patas) {
        this.patas = patas;
    }

    public void mostrarAnimal() {

        System.out.println("Universal animal");
    }
}
