package aula02.ex1;

//n precisa fazer get e set, so vamos reescrever o metodo com sobrescrita
public class Professor extends Pessoa{

    // Construtor para a classe Professor
    // O construtor é um método especial que é chamado quando um novo objeto é criado.
    // Ele inicializa o objeto com valores fornecidos para os atributos.
    public Professor(String nome, String email){
        setNome(nome);
        setEmail(email);
    }

    // Sobrescreve o método logar da classe Pessoa
    @Override
    public void logar(){
        System.out.println("Professor logado.");
    }
}
