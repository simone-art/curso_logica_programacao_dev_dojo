package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/*
Eu como usuário gostaría de imprimir todos os números impares
até o valor digitado pelo usuário
 */
public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor desejado: ");
        int valorFinal = scanner.nextInt();
        int i = 0;
        while(i <= valorFinal){
            if(i % 2 != 0){
                System.out.println("Este número é impar: " + i);
            }
            i++;
        }

    }
}
