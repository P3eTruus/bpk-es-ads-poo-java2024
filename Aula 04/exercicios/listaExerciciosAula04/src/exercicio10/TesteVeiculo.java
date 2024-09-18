package exercicio10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");

        veiculo.abastecer(50);
        veiculo.lavar();
    }
}
