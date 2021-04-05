/*
Como secretário de alistamento militar, eu gostaria que meu sistema aceitase os seguintes parâmetros para
que eu possa agilizar o processo de cadastramento:

sexo, sendo válido apenas M e F e idade
Se o sexo for masculino e a idade igual o maior a 18, o sistema deverá imprimir: alistamento obrigatório
Se o sexo for masculino e a idade menor a 18, o sistema deverá imprimir: alistamento não permitido
Se o sexo for femenino  e a idade igual o maior a 18, o sistema deverá preguntar se a pessoa deseja se alistar
Se o sexo for femenino  e a idade menor 18, o sistema deverá imprimir: alistamento não permitido
 */

import java.util.Scanner;

public class CadastroMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu sexo: ");
        String sexo = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner1.nextInt();

        if(sexo.equals("M") && idade < 18){
            System.out.println("Alistamento não permitido");
        }else if(sexo.equals("M") && idade >= 18){
            System.out.println("Alistamento obrigatório");
        }

        if(sexo.equals("F") && idade < 18){
            System.out.println("Alistamento não permitido");
        }else if(sexo.equals("F") && idade >= 18){
            System.out.println("Você deseja se alistar?");
        }
    }
}
