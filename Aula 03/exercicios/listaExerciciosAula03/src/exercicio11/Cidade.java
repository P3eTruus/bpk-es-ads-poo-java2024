package exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int incremento) {
        populacao += incremento;
        System.out.println("A população de " + nome + " aumentou em " + incremento + " habitantes. População atual: " + populacao);
    }

    public void diminuirPopulacao(int decremento) {
        if (decremento <= populacao) {
            populacao -= decremento;
            System.out.println("A população de " + nome + " diminuiu em " + decremento + " habitantes. População atual: " + populacao);
        } else {
            System.out.println("Número de habitantes a ser removido é maior que a população atual.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }
}
