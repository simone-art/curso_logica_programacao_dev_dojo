public class CalculoValorPorcentagemSalario2 {

        //Dado um determinado salário, se o salário foi maior que 4.500,
        //imprima 30% do valor. Senão imprima 15

        public static void main(String[] args) {
            double salario = 3500;
            double resultado;
            String porcentagem = "";

            if (salario > 4500){
                resultado = salario * 30 / 100;
                porcentagem = "30%";
            }else {
                resultado = salario * 15 / 100;
                porcentagem = "10%";

            }
            System.out.println("O valor do imposto de " + porcentagem + " do seu salário é: " + resultado);
        }

}

