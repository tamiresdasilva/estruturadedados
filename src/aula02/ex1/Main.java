package aula02.ex1;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova instância de Pessoa
        Pessoa pessoa1 = new Pessoa();
        // Define o nome e o email da pessoa
        pessoa1.setNome("Nicolas Tesla");
        pessoa1.setEmail("tesla@gmail.com");

        // Imprime o nome e o email da pessoa
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());

        // Chama o método logar da classe Pessoa
        pessoa1.logar();

        // Cria uma nova instância de Professor com nome e email
        Professor prof1 = new Professor("Albert","albert@gmail.com" );
        System.out.println("O professor é " + prof1.getNome()); // Imprime o nome do professor

        // Cria uma nova instância de Turma com nome, professor e número de vagas
        Turma estruturaDados =
                new Turma("Estrutura de Dados",
                        prof1,
                        30);


        // Instancia dois alunos e define seus nomes
        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        Aluno a2 = new Aluno();
        a2.setNome("Patrícia");
        // Adiciona os alunos à turma
        estruturaDados.inserirAluno(a1);
        estruturaDados.inserirAluno(a2);
        // Lista os alunos da turma
        estruturaDados.listarAlunos();

    }
}
