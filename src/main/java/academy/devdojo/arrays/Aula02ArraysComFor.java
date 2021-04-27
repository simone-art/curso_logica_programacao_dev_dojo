package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        //Laço de repeticão pra preencher os valores digitados pelo usuário
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a sua nota: " +(i+1));
            notas[i] = scanner.nextDouble();
        }

        double mediaNotas = 0;

        //laço pra imprimir os valores
        for (int i = 0; i < notas.length ; i++) {
            mediaNotas = mediaNotas + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        //Cálculo da média
        mediaNotas = mediaNotas/notas.length;
        System.out.println("A media das notas é: " + mediaNotas);
    }
}
