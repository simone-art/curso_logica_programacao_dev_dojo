package academy.devdojo.arrays;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 3.0;
        double nota4 = 5.0;

        double media = (nota1 + nota2 + nota3 +nota4)/3;
        System.out.println(media);
        System.out.println("============================");
        //Declaração de Arrays
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3.0;
        notas[3] = 5.0;
        for(int i = 0; i <4; i++){
            System.out.println(notas[i]);
        }
    }
}
