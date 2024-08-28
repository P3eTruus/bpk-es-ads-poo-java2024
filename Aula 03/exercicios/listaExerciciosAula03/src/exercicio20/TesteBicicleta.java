package exercicio19;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Speed", 26);

        bicicleta.pedalar();
        bicicleta.frear();
    }
}