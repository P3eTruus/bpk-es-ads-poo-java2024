package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja Central", "Rua das Flores, 123", "(11) 1234-5678");

        loja.abrir();
        loja.abrir();
        loja.fechar();
        loja.fechar();
    }
}
