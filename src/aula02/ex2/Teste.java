package aula02.ex2;

public class Teste {
    public static void main(String[] args) {
        Livro l1 = new Livro("Jorge", "Estrutura de Dados", 232);
        Livro l2 = new Livro("Jorge", "Estrutura de Dados", 232);
        Livro l3 = new Livro("Jorge", "Estrutura de Dados", 232);
        Livro l4 = new Livro("Jorge", "Estrutura de Dados", 232);
        Livro l5 = new Livro("Jorge", "Estrutura de Dados", 232);

        Livraria livraria = new Livraria(5);
        l1.reservar();
        l5.reservar();

        livraria.inserir(l1);
        livraria.inserir(l2);
        livraria.inserir(l3);
        livraria.inserir(l4);
        livraria.inserir(l5);

        livraria.listarDisponiveis();

        //System.out.println(livraria);
    }
}
