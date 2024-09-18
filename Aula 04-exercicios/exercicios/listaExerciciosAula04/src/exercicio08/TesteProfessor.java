package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", "Matemática", 3500.00);

        professor.darAula();
        professor.corrigirProvas();
    }
}
