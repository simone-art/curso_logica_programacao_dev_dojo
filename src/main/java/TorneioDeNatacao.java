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

//        String[] nomes = new String[4];
//        nomes[0] = "Simone";
//        nomes[1] = "Pedro";
//        nomes[2] = "Juan";
//        nomes[3] = "Nelva";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digie a sua idade: ");
        int idades = scanner.nextInt();

       Boolean categoriaInfantil = (idades <= 10) && (idades > 0);
       Boolean categoriaJuvenil = (idades > 10) && (idades <= 15);
       Boolean categoriaPreAdulto = (idades > 16) && (idades <= 19);
       Boolean categoriaAdulto = idades >= 20;

       if(categoriaInfantil){
           System.out.println(nome + ", participará da categoria infantil");
       }else if(categoriaJuvenil){
           System.out.println(nome + ", participará da categoria Juvenil");
       }else if(categoriaPreAdulto){
           System.out.println(nome + ", participará da categoria Pre-Adulto");
       }else if(categoriaAdulto){
           System.out.println(nome + ", participará da categoria Adulto");
       }
    }
}