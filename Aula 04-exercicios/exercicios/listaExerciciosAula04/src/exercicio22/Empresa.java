package exercicio22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(int quantidade) {
        numeroFuncionarios += quantidade;
        System.out.println("Contratados " + quantidade + " funcionário(s). Número total de funcionários: " + numeroFuncionarios);
    }

    public void demitir(int quantidade) {
        if (quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println("Demitidos " + quantidade + " funcionário(s). Número total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Número de funcionários a ser demitido é maior que o número atual de funcionários.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
}
