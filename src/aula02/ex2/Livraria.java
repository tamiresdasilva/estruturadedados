package aula02.ex2;

import java.util.Arrays;

public class Livraria {
    public Livro[] livros;
    private int posicaoAtual;

    public Livraria(int capacidade) {
        this.livros = new Livro[capacidade];
        posicaoAtual = 0;
    }

    public void inserir(Livro livro){
        if(posicaoAtual < livros.length){
            livros[posicaoAtual] = livro;
            posicaoAtual++;
            System.out.println("Livro inserido com sucesso.");
        }else{
            System.out.println("Livraria cheia!");
        }
    }

    public void listarDisponiveis(){
        String str = "";

        for(int i = 0; i < posicaoAtual; i++){
            if(livros[i].getDisponibilidade()){
            str += livros[i].toString() + "\n";
            }
        }
        System.out.println(str);
    }

    @Override
    public String toString() {
        String str = "";

        for(int i = 0; i < posicaoAtual; i++){
            str += livros[i].toString() + "\n";

        }
        return str;
    }
}
