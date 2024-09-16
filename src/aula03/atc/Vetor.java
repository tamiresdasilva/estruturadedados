package aula03.atc;

public class Vetor {
    public static void main(String[] args) {
        //Declarar vetor: tipo[] + nomeVetor;
        int[] numeros;

        //Inicializar vetor: nomeVetor = new tipo[tamanho];
        numeros = new int[5];

        //Declara o vetor e já inicializa na mesma linha: tipo[] nomeVetor = new tipo[tamanho];
        int[] vetor = new int[20];
        //Inicializa o vetor já com valores: tipo[] nomeVetor = {valor0, valor1, valor2};
        int[] vetor2 = {1, 5, 7};

        System.out.println(vetor2[1]); //Imprime 5
        System.out.println(vetor2.length); //Imprime o TAMANHO da lista que é 3

        //Alterar valor do vetor na 2 posição:
        vetor2[1] =50;
        System.out.println(vetor2[1]); //Imprime o novo valor que é 50

        /* OBSERVAÇÕES
        * System.out.println(numeros); = Imprime [I@6acbcfc0 (hexadecimal que é a referência do objeto)
        * System.out.println(numeros[0]); = Caso não tenha um valor declarado, imprime 0. Um array de inteiros coloca os números como 0 quando não são preenchidos.
        * Já um array de String ou objeto carrega os valores como NULL caso não sejam preenchidos
        * Enquanto Boolean inicializa tudo como falso caso não tenham seus valores inicializados
        * O índice do vetor começa do 0. Portanto se o primeiro número de um vetor é 3, ao inserir a posição 0, irá retornar 3.
        * O tamanho conta normalmente, sem o zero. Caso tenha uma matriz do tipo INT de 5 números, então será tamanho 5.
        * Não tem como acessar uma posição que não existe, se colocar uma posição fora do vetor irá dar erro.
        * */
    }
}
