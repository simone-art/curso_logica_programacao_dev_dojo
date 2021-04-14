package academy.devdojo.lacosderepeticao.fors;

public class Aula02Exercicio03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("====================");
            for (int j = 0; j <=10 ; j++) {
                int resultado = (i * j);
                System.out.println(i + " x " + j + " = " + resultado);

            }
        }
    }
}
