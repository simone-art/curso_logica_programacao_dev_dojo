package academy.devdojo.lacosderepeticao;

public class Aula01Introducao {
    public static void main(String[] args) {
        //Laço de repeticão: : enquanto a instrução é verdadeira o laço continua a operação
        //Quando a condição for fals o While para de executá-la
        //O while sempre precisa do contador++ porque senão ele entra no loop infinito
        int contador = 0;
        while(contador <=10){
            System.out.println("Contador: " + contador);
            contador++;
        }

    }
}
