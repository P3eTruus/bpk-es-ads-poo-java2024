package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 5, 200.0);

        animal.alimentar(10.0);
        animal.dormir();
    }
}
