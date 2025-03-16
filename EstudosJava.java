import java.util.Scanner;

public class EstudosJava {
    /*metodo principal*/
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nBem vindo ao programa de estudos de java!\n");
        System.out.println("Digite seu nome: ");
        String nome = scanner1.nextLine();
        System.out.println("Olá," + nome + "! Vamos começar");
        
        /*Exemplo de loop e condicional*/
        System.out.print("Quantos números você deseja inserir?");
        int quantidade = scanner1.nextInt();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = scanner1.nextInt();
        }
        System.out.println("Você digitou os seguintes números:");
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
        System.out.println();

        /*EXEMPLO DE MÉTODO */
        int soma = calcularSoma(numeros);
        System.out.println("A soma dos números é: " + soma);
        
        /*EXEMPLO DE CONDICIONAL */
        if (soma > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma é menor ou igual a 100.");
        }
    }

    //*METODO PARA CALCULAR SOMA DE UM ARRAY DE NÚMEROS*/
    public static int calcularSoma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}