package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90", 50);

        empresa.contratar(10);
        empresa.demitir(5);
        empresa.demitir(60);
    }
}