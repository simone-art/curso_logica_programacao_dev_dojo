package academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

/*
Construir tabuada com número digitado pelo usuário
 */
public class Aula02Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para mostrar a Tabuada: ");
        int numeroTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = (i * numeroTabuada);
            System.out.println(i + " x " + numeroTabuada + " = " + resultado);
        }
    }
}
