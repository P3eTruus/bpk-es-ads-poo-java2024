package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Junior", "20231010", "Engenharia");

        double[] notas = {8.5, 7.0, 9.0, 10.0};
        double media = aluno.calcularMedia(notas);

        System.out.println("Média do aluno " + aluno.getNome() + ": " + media);  // Saída: Média do aluno Maria: 8.625
    }
}
