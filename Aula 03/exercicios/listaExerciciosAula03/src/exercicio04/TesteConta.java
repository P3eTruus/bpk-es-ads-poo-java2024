package exercicio04;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta("122244", 1450.00);

        conta.depositar(200.00);
        conta.sacar(150.00);
        conta.sacar(600.00);
    }
}