package exercicio14;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador(int quantidade) {
        numeroDeJogadores += quantidade;
        System.out.println(quantidade + " jogador(es) adicionado(s) ao time " + nome + ". Total de jogadores: " + numeroDeJogadores);
    }

    public void removerJogador(int quantidade) {
        if (quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println(quantidade + " jogador(es) removido(s) do time " + nome + ". Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Número de jogadores a ser removido é maior que o número atual de jogadores.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }
}
