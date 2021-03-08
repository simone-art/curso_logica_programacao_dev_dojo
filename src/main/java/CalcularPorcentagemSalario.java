public class CalcularPorcentagemSalario {

/*
Programa que calcula uma determinada porcentagem de um dado salário
 */
    public static void main(String[]args){
       double salario = 4000;
       double porcentagem = 30;

       double calculoPorcentagem = salario * porcentagem / 100;
       System.out.println("A porcentagem de: " + porcentagem + " % de" + " salário é de: " + calculoPorcentagem);
    }
}
