package ExerciciosJAVA;

import java.util.Scanner;

public class IgualdadeV1V2 {
    public static void main(String[] args) {
        System.out.println("Digite o numero de posições que deseja nos vetores:");
        Scanner entrada = new Scanner (System.in);
        int totalVetor=entrada.nextInt();

        int[] v1=new int [totalVetor];
        int[] v2=new int[totalVetor];

        for(int i=0;i<totalVetor;i++){
            System.out.println("Informe o "+(i+1)+" do vetor 1:");
            v1[i]=entrada.nextInt();
        }
        for(int i=0;i<totalVetor;i++){
            System.out.println("Informe o "+(i+1)+" do vetor 2:");
            v2[i]=entrada.nextInt();
        }
        for(int i=0;i<totalVetor;i++){
            if (v1[i]==v2[i]){
            System.out.println("Valores da posição "+(i)+"nos vetores são iguais");
          }
        }

    }
}
