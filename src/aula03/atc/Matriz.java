package aula03.atc;

public class Matriz {
    public static void main(String[] args) {

        //Declarar uma matriz e instanciar ao mesmo tempo:
        String[][] matriz = new String[3][3];

        matriz[0][2] = "Elemento teste";
        System.out.println(matriz[0][2]); //Imprime "Elemento Teste"
        //Colocando um valor que não foi atribuido em determinada posição para imprimir
        //System.out.println(matriz[0][3]); //Imprime Exception porque o valor é nulo por padrão

        //Iniciando uma matriz do tipo int de 2 por 2 já com valores:
        int[][] matrizNumeros = {
                {1,2}, //Primeira linha valor 1 e 2
                {3,4} //Segunda linha valor 3 e 4
        };
        System.out.println(matrizNumeros[0][1]); //Imprime 2, porque 0 é a primeira coluna e 1 é a segunda linha
        System.out.println(matrizNumeros[0][0]); //Imprime 1, porque tanto a coluna quanto as linhas são as primeiras
        System.out.println(matrizNumeros[1][0]); //Imprime 3 (segunda coluna e primeira linha)
        System.out.println(matrizNumeros[1][1]); //Imprime 4 (segunda coluna e segunda linha)
    }
}
