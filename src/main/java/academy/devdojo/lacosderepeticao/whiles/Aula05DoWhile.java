package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/*
Do While é um laço de repetição onde a condição vem depois da primeira execução
 */
public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Player 1: Digite um número do 1 até 10");
            int num1 = scanner.nextInt();
            System.out.println("Player 2: Digite um número do 1 até 10");
            int num2 = scanner.nextInt();
            System.out.println("Acertou " + (num1 == num2));
            System.out.println("===========================================");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = scanner.nextInt();

        } while (desejaContinuar == 1);
    }
}