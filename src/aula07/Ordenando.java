package aula07;

import java.util.Random;

public class Ordenando {

    //mergeSort
    //Recebe como parametros o vetor a ser ordenado, inicio e fim
    public static void mergeSort(int[] vetor, int inicio, int fim){
        if (inicio < fim){ //Caso base -> quando forem iguais sai do recurso
            int meio = (inicio + fim)/2; //desconsidera número por vírgula caso seja ímpar
            mergeSort(vetor, inicio, meio); //0 até 5
            mergeSort(vetor, meio + 1, fim); //6 até 10
            merge(vetor, inicio, meio, fim); //intercala unindo tudo
        }
    }

    //merge recebe todo mundo, vetor, inicio, meio fim
    //tem que passar o meio pq ele faz duas copias, de uma metade e de outra
    public static void merge(int[] vetor, int inicio, int meio, int fim){
        //Passo 1: Determinar os tamanhos dos dois subarrays que serão mesclados
        //ex: meio = 5, então 5 - (0+1) = 4
        int n1 = meio - inicio + 1; //4 itera um lado da minha metade
        //ex: fim = 10, meio  5, então 10 - 5 = 5
        int n2 = fim - meio; //5 itera o outro lado da minha metade

        //Passo 2: Criar arrays temporários para armazenar os subarrays
        //Pega 2 para comparar e colocar certinho no original
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        //Passo 3: Copiar os dados para os arrays temporários
        for (int i = 0; i < n1; i++)
            esquerda[i] = vetor[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = vetor[meio + 1 + j];


        //Passo 4: Mesclar os arraus temporários de volta no array original
        int i = 0, j = 0;
        int k = inicio;
        while(i < n1 && j < n2){
            if (esquerda[i] <= direita[j]){
                vetor[k] = esquerda[i];
                i++;
            }else{
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        //Passo 5: Copiar os elementos restantes de esquerda[], se houver
        while (i < n1){
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        //Passo 6: Copiar os elementos restantes da direita[], se houver
        while (j < n2){
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim){
        if (inicio < fim) {
            // Particiona o vetor e retorna o índice do pivô
            int indicePivo = particionar(vetor, inicio, fim);
            //Ordena a sublista à esquerda do pivô
            quickSort(vetor, inicio, indicePivo -1);
            //Ordena a sublista à direita do pivô
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    private  static int particionar(int[] vetor, int inicio, int fim){
        int pivo = vetor[fim]; //Escolhe o último elemento como pivô
        int i = (inicio - 1); // Índice do menor elemento

        for (int j = inicio; j < fim; j++){
            if (vetor[j] <= pivo) { //Se o elemento atual é menor ou igual ao pivô
                i++;
                //Troca vetor[i] e vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        //Troca vetor[i+1] com o pivô (vetor[fim])
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];

        return i + 1; //Retorna o índice do pivô
    }

    public static void imprimeVetor(int[] vetor){
        for(int vet : vetor){
            System.out.println(vet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = new int[1000];

        Random random = new Random(); //Classe que gera números aleatórios

        //Preencher o array com inteiros aleatórios, na AP1 vai ter que criar um método para isso
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100); //Gera números entre 0 e 99
        }
        //imprimeVetor(vetor);
        double tempoInicio = System.nanoTime(); //Pega o tempo inicial em nano segundo
        quickSort(vetor, 0, vetor.length -1); //Ordena o vetor com mergeSort
        double tempoFim = System.nanoTime(); //Pega o tempo final em nano segundo
        double tempoNano = tempoFim - tempoInicio; //Calcula o tempo gasto em nano
        double tempoMili = tempoNano / 1_000_000; //Converte para milisegundos
        double tempoSeg = tempoNano / 1_000_000_000; //Converte para segundos
        System.out.println(tempoSeg);
        //imprimeVetor(vetor);
    }
}
