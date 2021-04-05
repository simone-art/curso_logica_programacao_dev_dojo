/*
Receba um número inteiro do usuário e imprima o día da semana correspondente
Sendo 1 Segunda Feira
 */

public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 3;
        String diaDaSemana;
        switch (dia){
            case 1: diaDaSemana = "Segunda Feira";
            break;
            case 2: diaDaSemana = "Terça Feira";
            break;
            case 3: diaDaSemana = "Quarta Feira";
            break;
            case 4: diaDaSemana = "Quinta Feira";
            break;
            case 5: diaDaSemana = "Sexta Feira";
            break;
            case 6: diaDaSemana = "Sábado";
            break;
            case 7: diaDaSemana = "Domingo";
            break;
            default:diaDaSemana = "Dia inválido";
        }
        System.out.println("O día da semana é: " +diaDaSemana);
    }
}
