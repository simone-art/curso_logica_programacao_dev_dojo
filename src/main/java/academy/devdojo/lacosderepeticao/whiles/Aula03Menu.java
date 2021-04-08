package academy.devdojo.lacosderepeticao.whiles;
/*
Como usuário eu gostaría de ter um menú visual que seja navegável através dos números
O menú deve ser exibido da seguinte forma:

1.Calcular imposto
2. Depositar salário
3. Sair

O menú deve ficar disponível enquanto eu não digitar o número 3
Desta forma o sistema ficará em execução evitando tem que ser reiniciado a cada operação
 */


import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        while(opcao !=3){
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opção: ");
            opcao = scanner.nextInt();
        }
        System.out.println("Programa encerrado");

    }
}
