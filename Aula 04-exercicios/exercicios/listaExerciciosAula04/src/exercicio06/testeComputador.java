package exercicio06;

public class testeComputador {
        public static void main(String[] args) {
            Computador pc = new Computador("Intel Core i7", 16, 512);

            pc.ligar();
            pc.ligar();
            pc.desligar();
            pc.desligar();
        }
}
