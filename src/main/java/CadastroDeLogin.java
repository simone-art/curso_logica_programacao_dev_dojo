import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        //Para comparar strings, não se usa no Java o == porque não funciona
        //Tem que ser usado o .equals() é assim o código de comparação entre strings vai funcionar
        if(nome.equals("") || nome.equals("admin") || nome.equals("administrador")){
            System.out.println("Usuário inválido");
        }else{
            System.out.println(nome + ", Usuário cadastrado com sucesso");
        }
    }
}
