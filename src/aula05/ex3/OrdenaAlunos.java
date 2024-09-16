package aula05.ex3;

public class OrdenaAlunos {
    public static void ordemAlfabetica(Aluno[] alunos){
        int n = alunos.length;

        for(int i = 0; i < n -1; i++){
            int index = i;
            for (int j = i+1; j < n; j++){
                if(alunos[j] != null && alunos[index] != null){
                    if (alunos[j].getNome().compareTo(alunos[index].getNome()) < 0) {
                        index = j;
                    }
                }
            }
            Aluno aux = alunos[index];
            alunos[index] = alunos[i];
            alunos[i] = aux;
        }
    }

    public static void ordenaMedia(Aluno[] alunos){
        int n = alunos.length;

        for(int i = 0; i < n -1; i++){
            int index = i;
            for (int j = i+1; j < n; j++){
                if(alunos[j] != null && alunos[index] != null){
                    if (alunos[j].getMedia() < (alunos[index].getMedia())) {
                        index = j;
                    }
                }
            }
            Aluno aux = alunos[index];
            alunos[index] = alunos[i];
            alunos[i] = aux;
        }
    }

    public static void imprimeAprovados(Aluno[] alunos){
        for(Aluno aluno : alunos){
            if(aluno.getMedia() >= 7){
                System.out.println(aluno);
            }
        }

    }

    public static void imprimeReprovados(Aluno[] alunos){
        for(Aluno aluno : alunos){
            if(aluno.getMedia() < 7){
                System.out.println(aluno);
            }
        }

    }

}
