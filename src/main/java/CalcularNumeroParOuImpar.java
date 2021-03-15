/*
Dado um número inteiro calcular se ele é par ou impar
 */

import java.util.Scanner;

public class CalcularNumeroParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();
         int numero2 = 2;
         int resultado = numero1 % numero2;
         if(resultado == 0){
             System.out.println("O número  é par");
         }else{
             System.out.println("O número  é impar");
         }
    }
}
