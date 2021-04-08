package academy.devdojo.estruturascondicionais;
/*
Como gerente eu gostaria que meus usuários pudessem
digitar o tipo de conta e o sistema imprima qual é a porcentagem de juros
que aquela conta irá oferecer para o cliente para agilizar o acesso as informações
Os tipos da conta são:

CONTA_POUPANCA: 0.05%
CONTA_CORRENTE: 0.02%
CONTA_INVESTIMENTO: 0.1%
 */


import java.util.Scanner;

public class JurosContas {
    public static void main(String[] args) {
        String conta = "CONTA_CORRENTE";

        switch (conta){
            case "CONTA_POUPANCA":
                System.out.println("CONTA_POUPANCA: 0.05%");
            break;
            case "CONTA_CORRENTE":
                System.out.println("CONTA_CORRENTE: 0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("CONTA_INVESTIMENTO: 0.1%");
                break;
            default:
                System.out.println("CONTA_INEXISTENTE");
        }
    }
}