package aula01;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Cria um objeto Scanner chamado 'scanner' que lê dados da entrada padrão (teclado).
        Scanner scanner = new Scanner(System.in);
        //'System.in' é um fluxo de entrada que representa o teclado. O Scanner usa esse fluxo para ler dados do usuário.

        double resultado; //Declara uma variável resultado

        System.out.println("Informe o primeiro número: ");

        //Exemplo de declaração variável para capturar a entrada do usuário do tipo String
        //String nome = scanner.nextLine(); # nextLine = usado quando se espera uma String

        //No nosso exercício queremos capturar um número, portanto faremos assim:
        double numero1 = scanner.nextDouble(); //nextDouble = usado quando se espera um double
        System.out.println("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Informe a operação desejada:");
        System.out.println("+  para soma");
        System.out.println("-  para subtração");
        System.out.println("*  para multiplicação");
        System.out.println("/  para divisão");

        String operacao = scanner.next();
        switch (operacao){
            case "+":
                resultado = somar(numero1, numero2);
                System.out.println(resultado);
                break;
            case "-":
                resultado = subtrair(numero1, numero2);
                System.out.println(resultado);
                break;
            case "*":
                resultado = multiplicar(numero1, numero2);
                System.out.println(resultado);
                break;
            case "/":
                if(numero2 == 0){
                    System.out.println("Não é possível dividir por zero.");
                }else{
                    resultado = dividir(numero1, numero2);
                    System.out.println(resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }

    //Métodos
    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }
}
