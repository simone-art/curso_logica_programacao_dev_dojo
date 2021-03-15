import java.util.Scanner;

public class CalculoMaiorDeIdade {
    /*
    Receba uma idade como entrada
    Se idade for maior que 18, imprima "adulto"
    Senão, imprima "Não adulto";
     */
    public static void main(String[] args) {
//        int idade = 15;
//        if(idade >= 18){
//            System.out.println("Adulto");
//        }else{
//            System.out.println("Ainda não é adulto");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("Você é Adulto");
        }else{
            System.out.println("Ainda não é adulto");
        }
    }
}
