/*
        Crie uma variável que irá a guardar o valor do salário
        Calcule a porcentagem desse salário,
        sendo os valores da porcentagem 30%, 15% e 5%
        A cada vez que você calcular, guarde o resultado em uma variável
        Imprima o resultado e reutilize a variável que guarda o resultado
        para o novo cálculo

 */

public class ReutilizarVariaveis {
    public static void main(String[] args) {

        double salario = 2000;
        int porcentagem = 5;
        double resultado = salario * porcentagem / 100;
        if(porcentagem == 30){
            resultado = salario * porcentagem / 100;
        }else if(porcentagem == 15){
            resultado = salario * 15 / 100;
        }else if(porcentagem == 5){
            resultado = salario * 5 / 100;
        }
        System.out.println("O resultado é: " + resultado);
    }
}
