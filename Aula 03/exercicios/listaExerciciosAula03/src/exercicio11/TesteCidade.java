package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");

        cidade.aumentarPopulacao(50000);
        cidade.diminuirPopulacao(20000);
        cidade.diminuirPopulacao(13000000);
    }
}
