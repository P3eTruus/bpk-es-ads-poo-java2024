package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", "Christopher Nolan", 148);

        filme.iniciar();
        filme.iniciar();
        filme.parar();
        filme.parar();
    }
}
