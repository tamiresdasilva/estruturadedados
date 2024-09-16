package aula02.ex1;

public class Pessoa {

    // Atributos privados para encapsulamento
    private String nome;
    private String email;

    // Getter para o nome
    // O método getNome() permite acessar o valor do atributo nome de fora da classe
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    // O método setNome(String nome) permite modificar o valor do atributo nome de fora da classe
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para simular o login de um usuário
    public void logar(){
        System.out.println("Usuário logado!");
    }
}
