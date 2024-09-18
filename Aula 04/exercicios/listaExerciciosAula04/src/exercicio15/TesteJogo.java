package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Legend of Zelda", "Aventura", 59.99);

        jogo.iniciar();
        jogo.iniciar();
        jogo.pausar();
        jogo.pausar();
    }
}
