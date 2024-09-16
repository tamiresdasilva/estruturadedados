package aula05.ex1;  // Declara o pacote onde a classe está localizada

public class Ordenacao {  // Define a classe Ordenacao

    // Método para ordenar um vetor de inteiros usando Bubble Sort em ordem crescente
    public static void bubbleSort(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'
        // Loop para percorrer todo o vetor (exceto o último elemento, que já estará na posição correta)
        for(int i = 0; i < n-1; i++){
            // Loop para comparar elementos adjacentes e trocar se necessário
            for(int j = 0; j < n-i-1; j++){
                if(vetor[j] > vetor[j+1]){
                    // Troca os elementos se o elemento atual for maior que o próximo
                    int aux = vetor[j];  // Armazena o valor atual em uma variável auxiliar
                    vetor[j] = vetor[j+1];  // Substitui o valor atual pelo próximo valor
                    vetor[j+1] = aux;  // Substitui o próximo valor pelo valor armazenado na variável auxiliar
                }
            }
        }
    }

    // Método para ordenar um vetor de inteiros usando Bubble Sort em ordem decrescente
    public static void bubbleSortDesc(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'
        // Loop para percorrer todo o vetor (exceto o último elemento, que já estará na posição correta)
        for(int i = 0; i < n-1; i++){
            // Loop para comparar elementos adjacentes e trocar se necessário
            for(int j = 0; j < n-i-1; j++){
                if(vetor[j] < vetor[j+1]){
                    // Troca os elementos se o elemento atual for menor que o próximo
                    int aux = vetor[j];  // Armazena o valor atual em uma variável auxiliar
                    vetor[j] = vetor[j+1];  // Substitui o valor atual pelo próximo valor
                    vetor[j+1] = aux;  // Substitui o próximo valor pelo valor armazenado na variável auxiliar
                }
            }
        }
    }

    // Método para ordenar um vetor de inteiros usando Selection Sort em ordem crescente
    public static void selectionSort(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'

        // Loop para percorrer todo o vetor (exceto o último elemento, que já estará na posição correta)
        for(int i = 0; i < n -1; i++){
            int min_idx = i;  // Armazena o índice do menor elemento encontrado
            // Loop para encontrar o menor elemento no restante do vetor
            for (int j = i+1; j < n; j++){
                if (vetor[j] < vetor[min_idx]) {
                    min_idx = j;  // Atualiza o índice do menor elemento
                }
            }
            // Troca o menor elemento encontrado com o elemento na posição i
            int temp = vetor[min_idx];  // Armazena o menor elemento encontrado em uma variável temporária
            vetor[min_idx] = vetor[i];  // Substitui o elemento na posição i pelo menor elemento encontrado
            vetor[i] = temp;  // Substitui o menor elemento encontrado pelo elemento na posição i
        }
    }

    // Método para ordenar um vetor de inteiros usando Selection Sort em ordem decrescente
    public static void selectionSortDesc(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'

        // Loop para percorrer todo o vetor (exceto o último elemento, que já estará na posição correta)
        for(int i = 0; i < n -1; i++){
            int min_idx = i;  // Armazena o índice do maior elemento encontrado
            // Loop para encontrar o maior elemento no restante do vetor
            for (int j = i+1; j < n; j++){
                if (vetor[j] > vetor[min_idx]) {
                    min_idx = j;  // Atualiza o índice do maior elemento
                }
            }
            // Troca o maior elemento encontrado com o elemento na posição i
            int temp = vetor[min_idx];  // Armazena o maior elemento encontrado em uma variável temporária
            vetor[min_idx] = vetor[i];  // Substitui o elemento na posição i pelo maior elemento encontrado
            vetor[i] = temp;  // Substitui o maior elemento encontrado pelo elemento na posição i
        }
    }

    // Método para ordenar um vetor de inteiros usando Insertion Sort em ordem crescente
    public static void insertionSort(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'
        // Loop para percorrer o vetor a partir do segundo elemento
        for (int i = 1; i < n; i++) {
            int key = vetor[i];  // Armazena o elemento a ser inserido na parte ordenada
            int j = i - 1;
            // Move elementos da parte ordenada do vetor que são maiores que o elemento 'key' para a direita
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];  // Move o elemento para a direita
                j = j - 1;  // Decrementa o índice
            }
            vetor[j + 1] = key;  // Insere o elemento 'key' na posição correta
        }
    }

    // Método para ordenar um vetor de inteiros usando Insertion Sort em ordem decrescente
    public static void insertionSortDesc(int[] vetor){
        int n = vetor.length;  // Armazena o tamanho do vetor em 'n'
        // Loop para percorrer o vetor a partir do segundo elemento
        for (int i = 1; i < n; i++) {
            int key = vetor[i];  // Armazena o elemento a ser inserido na parte ordenada
            int j = i - 1;
            // Move elementos da parte ordenada do vetor que são menores que o elemento 'key' para a direita
            while (j >= 0 && vetor[j] < key) {
                vetor[j + 1] = vetor[j];  // Move o elemento para a direita
                j = j - 1;  // Decrementa o índice
            }
            vetor[j + 1] = key;  // Insere o elemento 'key' na posição correta
        }
    }

    // Método para imprimir os elementos do vetor
    public static void imprimirVetor(int[] vetor){
        for(int vet : vetor){  // Percorre cada elemento do vetor
            System.out.print(vet + " ");  // Imprime o elemento seguido de um espaço
        }
        System.out.println();  // Adiciona uma nova linha após a impressão dos elementos
    }

    // Método principal para testar os algoritmos de ordenação
    public static void main(String[] args) {
        int[] vetorBubble = {5, 22, 1, 106, 32, 25, 6};  // Vetor para teste do Bubble Sort
        int[] vetorSelection = {51, 212, 10, 6, 16, 1025, 1};  // Vetor para teste do Selection Sort
        int[] vetorInsertion = {151, 2, 120, 64, 16, 102};  // Vetor para teste do Insertion Sort

        // Ordena o vetor 'vetorSelection' em ordem decrescente usando Selection Sort
        Ordenacao.selectionSortDesc(vetorSelection);
        // Imprime o vetor ordenado
        Ordenacao.imprimirVetor(vetorSelection);
    }
}

