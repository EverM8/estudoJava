package aulas.correcao;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //entrada dos dados
        Scanner entrada=new Scanner(System.in);

        System.out.println("Informe o tamanho máximo dos vetores:");
        int tamanho= entrada.nextInt();

        int[] v1=new int[tamanho];//sempre o tamanho especificado pelo usuário
        int[] v2=new int[tamanho];

        System.out.println("Informe o valores do vetor 1:");
        for (int i=0; i<tamanho;i++ ){
            v1[i]=entrada.nextInt();
        }

        System.out.println("Informe o valores do vetor 2:");
        for (int i=0; i<tamanho;i++ ){
            v2[i]=entrada.nextInt();
        }

        //Processamento de dados
        int matches=0; //quantas vezes são iguais

        for (int i=0; i<tamanho;i++){
            if (v1[i]==v2[i]){
                matches++;
            }
        }

        //Saída
        System.out.println("Foram "+matches+" encontro(s)");
    }
}
