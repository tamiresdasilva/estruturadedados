package aula02.ex1;

public class Turma {
    // Atributos privados para encapsulamento
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int posicaoAtual = 0;

    // Construtor para definir o nome da turma, o professor e o número de vagas
    public Turma(String nome, Professor professor, int numeroVagas) {
        this.nome = nome;
        this.professor = professor;
        alunos = new Aluno[numeroVagas];
    }

    // Getter e Setter para o nome da turma
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    // Getter e Setter para o professor da turma
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual++;
    }

    public void listarAlunos(){
        for(int i = 0; i < posicaoAtual; i++){
            System.out.println("Aluno " + (i+1) + ": " + alunos[i].getNome());
        }
    }
}
