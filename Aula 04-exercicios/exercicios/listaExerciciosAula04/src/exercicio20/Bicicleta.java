package exercicio19;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda; // em polegadas

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("A bicicleta " + marca + " " + modelo + " está pedalando.");
    }

    public void frear() {
        System.out.println("A bicicleta " + marca + " " + modelo + " está freando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }
}
