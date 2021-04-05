/*
Receba um número inteiro do usuário e imprima o día da semana correspondente
 */

public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 7;
        String diaDaSemana;
        switch (dia){
            case 1: diaDaSemana = "Lunes";
            break;
            case 2: diaDaSemana = "Martes";
            break;
            case 3: diaDaSemana = "Miércoles";
            break;
            case 4: diaDaSemana = "Jueves";
            break;
            case 5: diaDaSemana = "Viernes";
            break;
            case 6: diaDaSemana = "Sábado";
            break;
            case 7: diaDaSemana = "Domingo";
            break;
            default:diaDaSemana = "Dia inválido";
        }
        System.out.println("Dia de la semana es: " +diaDaSemana);
    }
}
