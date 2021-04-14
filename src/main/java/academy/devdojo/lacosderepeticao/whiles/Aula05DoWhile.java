package academy.devdojo.lacosderepeticao.whiles;

/*
Do While é um laço de repetição onde a condição vem depois da primeira execução
 */
public class Aula05DoWhile {
    public static void main(String[] args) {

        boolean condicao = false;
        while(condicao){
            System.out.println("Dentro do While");
        }
        do {
            System.out.println("Dentro do Do While");
        } while (condicao);

    }
}
