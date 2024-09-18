package exercicio18;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // em MB
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false; // Inicialmente o livro está fechado
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro '" + titulo + "' foi aberto.");
        } else {
            System.out.println("O livro '" + titulo + "' já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro '" + titulo + "' foi fechado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está fechado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
}
