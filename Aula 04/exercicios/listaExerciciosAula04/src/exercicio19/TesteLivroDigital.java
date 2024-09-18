package exercicio18;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Java para Iniciantes", "Ana Silva", 1.5);

        livro.abrir();
        livro.abrir();
        livro.fechar();
        livro.fechar();
    }
}
