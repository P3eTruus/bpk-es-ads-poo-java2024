package exercicio21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha " + tipo + " está agora preparando a comida para " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("A cozinha " + tipo + " está sendo limpa. Cor: " + cor);
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }
}
