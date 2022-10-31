package ExerciciosJAVA;

import java.util.Scanner;

public class ExercicioOperacaoMatematica {
    public static void main(String[] args) {
        System.out.println("Escolha a operação que você deseja:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");


        Scanner entrada = new Scanner (System.in);
        int operacao= entrada.nextInt();
        System.out.println("Informe o primeiro numero:");
        int n1= entrada.nextInt();
        System.out.println("Informe o segundo numero:");
        int n2= entrada.nextInt();

        switch (operacao){
            case 1:
                System.out.println("O resultado da soma é "+(n1+n2));
                break;

            case 2:
                System.out.println("O resultado da subtração é "+(n1-n2));
                break;

            case 3:
                System.out.println("O resultado da multiplicação é "+(n1+n2));
                break;

            case 4:
                System.out.println("O resultado da divisão é "+(n1/n2));
                break;
        }

    }
}
