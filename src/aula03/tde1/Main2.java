package aula03.tde1;

public class Main2 {

    public static void main(String[] args) {
        Vetor frutas = new Vetor(10);
        frutas.inserir("Maçã");
        frutas.inserir("Abacaxi");
        frutas.inserir("Kiwi");
        frutas.inserir("Abacate");
        //System.out.println(frutas.toString());

        //Inserir fruta na posição 2
        frutas.inserir("Laranja", 2);
        //System.out.println(frutas.obter(2));
        frutas.excluir("Maçã");
        System.out.println(frutas);

        System.out.println(frutas.contem("abc"));
        //System.out.println(frutas.getPosicaoAtual());

        frutas.limpar();
        System.out.println(frutas);
    }
}
