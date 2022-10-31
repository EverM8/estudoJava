package ExerciciosJAVA;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        System.out.println("Informe o numero de posições que deseja no vetor:");
        Scanner entrada = new Scanner (System.in);
        int totalVetor=entrada.nextInt();

        int[]vetor= new int[totalVetor];
        double soma=0.0;
        for (int i=0;i<totalVetor;i++) {
            System.out.println("Informe o valor " + (i + 1) + " do vetor");
            vetor[i] = entrada.nextInt();
            soma+=vetor[i];
        }
        System.out.println("A soma dos valores é "+soma);
        System.out.println("A média dos valores é "+(soma/vetor.length));
    }
}
