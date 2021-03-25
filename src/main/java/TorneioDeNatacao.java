import java.util.Scanner;

//Eu como usuário gostaría de ter o nome e a idade de participantes
// de um torneio de natação onde o sistema imprimisse o seguinte:
//Menor que 10 anos <Nome> participará da categoria infantil
//Entre 11 a 15 anos <Nome> participará da categoria juvenil
//Entre 16 a 19 anos <Nome> participará da categoria Pre-Adulto
//Acima de 20 anos <Nome> participará da categoria adulto
//Para que eu possa rápidamente classificar todos os participantes

public class TorneioDeNatacao {

    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Simone";
        nomes[1] = "Pedro";
        nomes[2] = "Juan";
        nomes[3] = "Nelva";

        int[] idades = new int[4];
        idades[0] = 10;
        idades[1] = 15;
        idades[2] = 18;
        idades[3] = 20;

        //System.out.println("Os nomes da lista são: " + nomes[0] + nomes[1] + nomes[2]);
//        System.out.println(nomes[0] + " com " + idades[0] + " anos de idade " + "participará da categoria infantil");
//        System.out.println(nomes[1] + " com " + idades[1] + " anos de idade " + "participará da categoria juvenil");
//        System.out.println(nomes[2] + " com " + idades[2] + " anos de idade " + "participará da categoria pre-adulto");
//        System.out.println(nomes[3] + " com " + idades[3] + " anos de idade " + "participará da categoria adulto");

        if (idades[0] <= 10) {
            System.out.println(nomes[0] + ", participará da categoria infantil");
        } else if (idades[0] >= 11 && idades[0] <= 15) {
            System.out.println(nomes[0] + ", participará da categoria Juvenil");
        } else if (idades[0] >= 16 && idades[0] <= 19) {
            System.out.println(nomes[0] + ", participará da categoria Pre-Adulto");
        } else if (idades[0] >= 20) {
            System.out.println(nomes[0] + ", participará da categoria Adulto");
        }

        if (idades[1] <= 10) {
            System.out.println(nomes[1] + ", participará da categoria infantil");
        } else if (idades[1] >= 11 && idades[1] <= 15) {
            System.out.println(nomes[1] + ", participará da categoria Juvenil");
        } else if (idades[1] >= 16 && idades[1] <= 19) {
            System.out.println(nomes[1] + ", participará da categoria Pre-Adulto");
        } else if (idades[1] >= 20) {
            System.out.println(nomes[1] + ", participará da categoria Adulto");
        }

        if (idades[2] <= 10) {
            System.out.println(nomes[2] + ", participará da categoria infantil");
        } else if (idades[2] >= 11 && idades[2] <= 15) {
            System.out.println(nomes[2] + ", participará da categoria Juvenil");
        } else if (idades[2] >= 16 && idades[2] <= 19) {
            System.out.println(nomes[2] + ", participará da categoria Pre-Adulto");
        } else if (idades[2] >= 20) {
            System.out.println(nomes[2] + ", participará da categoria Adulto");
        }

        if (idades[3] <= 10) {
            System.out.println(nomes[3] + ", participará da categoria infantil");
        } else if (idades[3] >= 11 && idades[3] <= 15) {
            System.out.println(nomes[3] + ", participará da categoria Juvenil");
        } else if (idades[3] >= 16 && idades[3] <= 19) {
            System.out.println(nomes[3] + ", participará da categoria Pre-Adulto");
        } else if (idades[3] >= 20) {
            System.out.println(nomes[3] + ", participará da categoria Juvenil");
        }
    }
}