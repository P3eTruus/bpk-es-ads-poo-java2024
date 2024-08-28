package exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque. Estoque atual: " + quantidadeEstoque);
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades retiradas do estoque. Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade insuficiente no estoque para realizar a retirada.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
