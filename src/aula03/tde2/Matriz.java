package aula03.tde2;

public class Matriz {
    int [][] elementos;

    public Matriz(int[][] elementos) {
        this.elementos = elementos;
    }

    public int obterMaior(){
        int maior = elementos[0][0];
        for(int i = 0; i < elementos.length; i++){
            for(int j = 0; j < elementos[i].length; j++){
                if(elementos[i][j] > maior){
                    maior = elementos[i][j];
                }
            }
        }
        return maior;
    }

    public int obterMenor(){
        int menor = elementos[0][0];
        for(int i = 0; i < elementos.length; i++){
            for(int j = 0; j < elementos[i].length; j++){
                if(elementos[i][j] < menor){
                    menor = elementos[i][j];
                }
            }
        }
        return menor;
    }

    public int somaTotal(){
        int soma = 0;
        for(int i = 0; i < elementos.length; i++){
            for(int j = 0; j < elementos[i].length; j++){
                soma += elementos[i][j];
            }
        }
        return soma;
    }

    public double media(){
        int numeroElementos = elementos.length * elementos[0].length;
        return (double) somaTotal() / numeroElementos;
    }

    public int[] somaLinhas(){
        int [] somaLinhas = new int[elementos.length];
        for(int i = 0; i < elementos.length; i++){
            for (int j = 0; j < elementos[i].length; j++){
                somaLinhas[i] += elementos[i][j];

            }
        }
        return somaLinhas;
    };

    public int[] somaColunas(){
        int [] somaColunas = new int[elementos.length];
        for(int i = 0; i < elementos.length; i++){
            for (int j = 0; j < elementos[i].length; j++){
                somaColunas[j] += elementos[i][j];

            }
        }
        return somaColunas;
    };

    public int contaOcorrencias(int elemento){
        int ocorrencias = 0;
        for(int i = 0; i < elementos.length; i++){
            for (int j = 0; j < elementos[i].length; j++){
                if (elementos[i][j] == elemento){
                    ocorrencias++;
                }

            }
        }
        return ocorrencias;
    };

    public static void main(String[] args) {
        int[][] inteiros = {
                {10, 20, 30},
                {11, 21, 31},
                {12, 12, 10}
        };
        Matriz m = new Matriz(inteiros);

        //System.out.println(m.obterMaior());
       // System.out.println(m.obterMenor());
        //System.out.println(m.somaTotal());
        //System.out.println(m.media());
        //int [] somaLinhas = m.somaColunas();
        //System.out.println(somaLinhas[0]);
        //System.out.println(somaLinhas[1]);
        //System.out.println(somaLinhas[2]);

        System.out.println(m.contaOcorrencias(100));
    }
}
