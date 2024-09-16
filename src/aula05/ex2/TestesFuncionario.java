package aula05.ex2;  // Declara o pacote onde a classe está localizada

public class TestesFuncionario {  // Define a classe TestesFuncionario
    public static void main(String[] args) {
        // Cria cinco objetos Funcionario com diferentes salários e nomes
        Funcionario func1 = new Funcionario(70000, "Roberto");
        Funcionario func2 = new Funcionario(10000, "Ana");
        Funcionario func3 = new Funcionario(80000, "Xuxa");
        Funcionario func4 = new Funcionario(10000, "Joaquim");
        Funcionario func5 = new Funcionario(10000, "Bruno");

        // Cria um vetor de funcionários com os objetos criados
        Funcionario[] funcionarios = {func1, func2, func3, func4, func5};

        // Ordena o vetor de funcionários em ordem decrescente de salário
        OrdenarFuncionario.ordenaSalarioDesc(funcionarios);

        // Itera sobre o vetor de funcionários e imprime cada um
        for (Funcionario f : funcionarios) {
            System.out.println(f);  // Imprime a representação em string de cada funcionário
        }
    }
}
