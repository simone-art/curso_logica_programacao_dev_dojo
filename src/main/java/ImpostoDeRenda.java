public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 4000;
        if (salario <= 1903.98) {
            System.out.println("Você está ixento de pagar o imposto sobre a renda");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5 " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3750.50) {
            System.out.println("15  " + (salario * 0.15));
        } else if (salario >= 3750.51 && salario <= 4600.50) {
        System.out.println("22.5 " + (salario * 0.225));
    }

    }
}