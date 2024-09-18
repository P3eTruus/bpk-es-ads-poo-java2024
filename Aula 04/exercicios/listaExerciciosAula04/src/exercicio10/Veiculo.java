package exercicio10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(double litros) {
        System.out.println("O veículo de placa " + placa + " foi abastecido com " + litros + " litros.");
    }

    public void lavar() {
        System.out.println("O veículo de placa " + placa + " foi lavado.");
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}
