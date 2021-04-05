import java.util.Scanner;

public class RecebendoDadosDoteclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("O nome e a idade digitada são: " + nome + "," + idade);

    }

}
