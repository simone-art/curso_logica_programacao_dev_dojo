import java.util.Scanner;

//Eu como usuário gostaría de ter o nome e a idade de participantes
// de um torneio de natação onde o sistema imprimisse o seguinte:
//Menor que 10 anos <Nome> participará da categoria infantil
//Entre 11 a 15 anos <Nome> participará da categoria juvenil
//Entre 16 a 19 anos <Nome> participará da categoria Pre-Adulto
//Acima de 20 anos <Nome> participará da categoria adulto
//Para que eu possa rápidamente classificar todos os participantes

public class TorneioDeNatacao {

    public static void main(String[] args) {

        String nomes = "Mariana";
        int idades = 19;

          if( idades <= 10){
              System.out.println(nomes + ", você pertence a categoría infantil");
          }else if(idades > 10 && idades <= 15){
              System.out.println( nomes + ", você pertence a categoría juvenil");
          }else if(idades > 16 && idades <= 19){
              System.out.println(nomes + " , você pertence a categoría Pre-Adulto");
          }else if(idades > 20){
              System.out.println(nomes+ ", você pertence a categoría adulto");
          }
    }
}
