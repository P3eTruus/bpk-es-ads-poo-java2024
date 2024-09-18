package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Time A", "Carlos Silva", 11);

        time.adicionarJogador(2);
        time.removerJogador(4);
        time.removerJogador(10);
    }
}
