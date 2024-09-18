package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // em minutos
    private boolean emExibicao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.emExibicao = false; // Inicialmente o filme está parado
    }

    public void iniciar() {
        if (!emExibicao) {
            emExibicao = true;
            System.out.println("O filme '" + titulo + "' está agora em exibição.");
        } else {
            System.out.println("O filme '" + titulo + "' já está em exibição.");
        }
    }

    public void parar() {
        if (emExibicao) {
            emExibicao = false;
            System.out.println("O filme '" + titulo + "' foi parado.");
        } else {
            System.out.println("O filme '" + titulo + "' já está parado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }
}
