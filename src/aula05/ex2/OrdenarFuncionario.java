package aula05.ex2;  // Declara o pacote onde a classe está localizada

public class OrdenarFuncionario {  // Define a classe OrdenarFuncionario

    // Método para ordenar o vetor de funcionários em ordem alfabética
    public static void ordemAlfabetica(Funcionario[] funcionarios){
        int n = funcionarios.length;  // Armazena o tamanho do vetor
        // Loop para percorrer o vetor
        for(int i = 0; i < n-1; i++){
            // Loop interno para comparar e trocar elementos
            for(int j = 0; j < n-i-1; j++){
                // Compara os nomes dos funcionários
                if(funcionarios[j].getNome().compareTo(funcionarios[j+1].getNome()) > 0){
                    // Troca os funcionários se necessário
                    Funcionario aux = funcionarios[j];  // Armazena o funcionário na posição j em uma variável auxiliar
                    funcionarios[j] = funcionarios[j+1];  // Move o funcionário da posição j+1 para a posição j
                    funcionarios[j+1] = aux;  // Move o funcionário da posição j para a posição j+1
                }
            }
        }
    }

    // Método para ordenar o vetor de funcionários em ordem crescente de salário
    public static void ordenaSalario(Funcionario[] funcionarios){
        int n = funcionarios.length;  // Armazena o tamanho do vetor
        // Loop para percorrer o vetor
        for(int i = 0; i < n-1; i++){
            // Loop interno para comparar e trocar elementos
            for(int j = 0; j < n-i-1; j++){
                // Compara os salários dos funcionários
                if(funcionarios[j].getSalario() > funcionarios[j + 1].getSalario()){
                    // Troca os funcionários se necessário
                    Funcionario aux = funcionarios[j];  // Armazena o funcionário na posição j em uma variável auxiliar
                    funcionarios[j] = funcionarios[j+1];  // Move o funcionário da posição j+1 para a posição j
                    funcionarios[j+1] = aux;  // Move o funcionário da posição j para a posição j+1
                }
            }
        }
    }

    // Método para ordenar o vetor de funcionários em ordem decrescente de salário
    public static void ordenaSalarioDesc(Funcionario[] funcionarios){
        int n = funcionarios.length;  // Armazena o tamanho do vetor
        // Loop para percorrer o vetor
        for(int i = 0; i < n-1; i++){
            // Loop interno para comparar e trocar elementos
            for(int j = 0; j < n-i-1; j++){
                // Compara os salários dos funcionários
                if(funcionarios[j].getSalario() < funcionarios[j + 1].getSalario()){
                    // Troca os funcionários se necessário
                    Funcionario aux = funcionarios[j];  // Armazena o funcionário na posição j em uma variável auxiliar
                    funcionarios[j] = funcionarios[j+1];  // Move o funcionário da posição j+1 para a posição j
                    funcionarios[j+1] = aux;  // Move o funcionário da posição j para a posição j+1
                }
            }
        }
    }
}

