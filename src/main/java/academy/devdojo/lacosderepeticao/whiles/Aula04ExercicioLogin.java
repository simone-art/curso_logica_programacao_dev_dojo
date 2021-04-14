package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        //Ao usar a apalavra final, a variável passa a ser constante e seu valor não poderá ser trocado
        final String login = "Todoroku";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;

        Scanner scanner = new Scanner(System.in);

        while (exibirTelaLogin) {
            System.out.print("Digite seu login: ");
            String loginDigitado = scanner.nextLine();
            System.out.print("Digite seu password: ");
            String passwordDigitado = scanner.nextLine();

            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACCESO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}

