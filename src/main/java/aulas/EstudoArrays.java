package aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};
        System.out.println(numeros.length);
        numeros[3]=1000;
        System.out.println(numeros[3]);
        for (int i=0; i<numeros.length;i++){
            System.out.println("A posição "+i+" com valor de "+numeros[i]);
        }
                                   //inicia do 0, logo termina no 49
        int[] numeros2=new int[50];//[0,1,2,3,4,5,6...,49]
        numeros2[0]=500;
        numeros2[1]=-200;
        //...
        numeros2[49]=1;

        double[] notas=new  double[5];
        String[] nomes={"José Almir","Renato Pereira","Victor Icoma"};
        String[] sobrenomes=new String[10];
        Scanner entrada=new Scanner(System.in);
       // int quantidade= entrada.nextInt();
       // boolean[] valores=new boolean[quantidade];


        //Exemplo
        System.out.println("Digite o total de notas:");
        int totalNotas=entrada.nextInt();
        double[] notasProva=new double[totalNotas];

        for (int i=0;i<totalNotas;i++){
            System.out.println("Digite o valor da nota "+i);
            notasProva[i]=entrada.nextDouble();
        }

        double soma=0.0;
        for (double nota:notasProva){
            soma+=nota;

        }

        double media=soma/notasProva.length;

        //Condição ternária
        String  mensagem=(media<7) ?"Você está reporvado": "Você esta aprovado";
        System.out.println(mensagem);

        //Default values
        int numero; //padrão=0
        double  nota2;//padrão=0.0
        long populacao;//padrão=0
        boolean  teste; //padrão=false
        String nome; //numm=> ausência de objeto na variável

        //Wrapper classes
        Integer numero2=1;
        Double nota3=1.0;
        Long pop2=1L;
        Boolean teste2=false;

    }
}
