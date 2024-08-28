package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.99, 100);

        produto.aumentarEstoque(50);
        produto.diminuirEstoque(30);
        produto.diminuirEstoque(200);
    }
}
