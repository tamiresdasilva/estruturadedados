package aula02.ex1;

public class Aluno extends Pessoa{

    // Sobrescreve o método logar da classe Pessoa
    @Override
    public void logar() {
        System.out.println("Aluno logado.");
    }
}
