package aula03.tde1;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int posicaoAtual;

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        posicaoAtual = 0;
    }

    public void inserir(String elemento){
        if(posicaoAtual < this.elementos.length){
            elementos[posicaoAtual] = elemento;
            posicaoAtual++;
        }else{
            System.out.println("Vetor cheio.");
        }
    }

    //Inserir em posição específica
    public void inserir(String elemento, int indice) {
        if (indice > -1 && indice < posicaoAtual) {
            posicaoAtual++;
            for (int i = posicaoAtual; i > indice; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[indice] = elemento;
        } else {
            System.out.println("índice inválido!");
        }
    }

    public void alterar(int indice, String elemento){
        if(indice > -1 && indice < posicaoAtual){
            elementos[indice] = elemento;
        }else{
            System.out.println("Indice inválido");
        }
    }

    public String obter(int indice){
        if(indice > -1 && indice < posicaoAtual){
            return elementos[indice];
        }else{
            System.out.println("Indice inválido");
            return "";
        }
    }

    public void excluir(int indice){
        //this.elementos[indice] = null;
        for(int i = indice; i < posicaoAtual; i++){
            elementos[i] = elementos[i +1];
        }
        posicaoAtual--;
    }

    public void excluir(String elemento){
        for(int i = 0; i < posicaoAtual; i++){
            if(elementos[i].compareTo(elemento) == 0){
                excluir(i);
            }
        }
    }

    public boolean contem(String elemento){
        boolean existe = false;
        for(int i = 0; i < posicaoAtual; i++){
            if(elementos[i].compareTo(elemento) == 0){
                existe = true;
            }
        }
        return  existe;
    }

    public boolean estaVazio(){
        if (posicaoAtual == 0){
            return true;
        }else{
            return false;
        }
    }

    public void limpar(){
        for(int i = 0; i < posicaoAtual; i++){
            elementos[i] =  null;
        }
        posicaoAtual = 0;
    }

    public void aumentarCapacidade(){
        String[] novoVetor;
        novoVetor = new String[this.elementos.length * 2];
        for(int i = 0; i < posicaoAtual; i++){
            novoVetor[i] = this.elementos[i];
        }
        this.elementos = novoVetor;
    }

    @Override
    public String toString() {
        String str;
        str = "[";
        for(int i = 0; i < posicaoAtual; i++){

            str += elementos[i];
            if(i < posicaoAtual - 1){
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
