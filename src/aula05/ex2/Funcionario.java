package aula05.ex2;  // Declara o pacote onde a classe está localizada

public class Funcionario {  // Define a classe Funcionario
    private String nome;  // Declara um atributo privado para armazenar o nome do funcionário
    private double salario;  // Declara um atributo privado para armazenar o salário do funcionário

    // Construtor da classe que inicializa os atributos nome e salario
    public Funcionario(double salario, String nome) {
        this.salario = salario;  // Inicializa o atributo salario
        this.nome = nome;  // Inicializa o atributo nome
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo salario
    public double getSalario() {
        return salario;
    }

    // Setter para o atributo salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Salário: " + salario;
    }
}
