/*
Dado um número inteiro calcular se ele é par ou impar
 */

import java.util.Scanner;

public class CalcularNumeroParOuImpar {
    public static void main(String[] args) {
         int numero1 = 21;
         int numero2 = 2;
         int resultado = numero1 % numero2;
         if(resultado == 0){
             System.out.println("O número " + numero1 + " é par");
         }else{
             System.out.println("O número " + numero1 + " é impar");
         }
    }
}
