package aulas.correcao; //dentro do pacote "aulas" está o pacote "correcao"
// e dentro da "correcao" está a classe correcao1

import java.util.Locale;
import java.util.Scanner; //estou trazendo a classe Scanner do pacote java.util

public class correcao1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Escolha uma opção (de 1 a 4) \n 1-Adição \n 2-Subtração \n 3-Multiplicação \n 4-Divisão");
        int opcao= entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        double v1= entrada.nextDouble();

        System.out.println("Digite o segundo valor:");
        double v2= entrada.nextDouble();

        switch (opcao){
            case 1-> {
                double soma=v1+v2;
                System.out.println("O resultado da soma é"+soma);
            }
            case 2-> {
                double subtracao=v1-v2;
                System.out.println("O resultado da subtração é"+subtracao);
            }
            case 3-> {
                double multiplicacao=v1*v2;
                System.out.println("O resultado da multiplicação é"+multiplicacao);
            }
            case 4-> {
                double divisao=v1/v2;
                System.out.println("O resultado da divisão é"+divisao);
            }
            default -> {
                System.out.println("Você digitou uma opção inválida!");
            }
        }

    }
}
