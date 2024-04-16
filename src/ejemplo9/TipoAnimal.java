package ejemplo9;

public enum TipoAnimal implements Animal {
    PERRO {
        @Override
        public void hacerSonido() {
            System.out.println("Guau guau");
        }
    },
    GATO {
        @Override
        public void hacerSonido() {
            System.out.println("Miau miau");
        }
    },
    VACA {
        @Override
        public void hacerSonido() {
            System.out.println("Muuu muuu");
        }
    };
}

