package exercicio17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(double quantidade) {
        peso += quantidade;
        System.out.println("O animal da espécie " + especie + " foi alimentado com " + quantidade + " kg. Peso atual: " + peso + " kg.");
    }

    public void dormir() {
        System.out.println("O animal da espécie " + especie + " está dormindo.");
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}