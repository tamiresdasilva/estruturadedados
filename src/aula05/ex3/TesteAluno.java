package aula05.ex3;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", 7, 9);
        Aluno a2 = new Aluno("Alice", 1, 9);
        Aluno a3 = new Aluno("Fernanda", 9, 9);

        Aluno[] alunos = {a1, a2, a3};

        // Ordenar por nome
        OrdenaAlunos.ordemAlfabetica(alunos);
        System.out.println("Ordenado por nome:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // Ordenar por média
        OrdenaAlunos.ordenaMedia(alunos);
        System.out.println("Ordenado por média:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println();

        // Imprimir aprovados
        System.out.println("Aprovados:");
        OrdenaAlunos.imprimeAprovados(alunos);
        System.out.println();

        // Imprimir reprovados
        System.out.println("Reprovados:");
        OrdenaAlunos.imprimeReprovados(alunos);
    }
}
