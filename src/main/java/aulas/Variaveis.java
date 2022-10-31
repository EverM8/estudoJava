package aulas;

public class Variaveis {
    //execução do nosso programa JAVA
    public static void main(String[] args){
        System.out.println("Hello, World!"); // equivale ao console.log

        //Variáveis no JAVA
        //fortimente tipado e estaticamente tipado
        int idade=20; //inteiro
        double salario=4599.99; //dupla precisão
        float nota=7.5f; //sufixo para float
        long populacaoTerra=7_900_000_000l;
        boolean tarefaConcluida=false; // (true ou false)
        int i=1, j=0, k=1000; //multiplas variáveis
        String hunter ="Cayde-6"; //sempre aspas duplas

        int teste=10;
        teste=9; //reatribuição de variáveis

        final int teste2=200; //impossível mudar o valor
        //teste2=100;

        //Operadores
        int a=10, b=5;

        int soma=a+b;  //15
        int subtracao=a-b; //5
        int multiplicacao = a*b;  //50
        int divisao=a/b; //2

        System.out.println("O resultado da soma é "+soma+ " e da multiplicação é "+multiplicacao);
        //A DIVISÃO ENTRE DOIS INTEIROS RESULTA EM INTEIRO
        int sete=7, dois=2;
        System.out.println(sete/dois);
        double dois2=2.0;
        System.out.println(sete/dois2);

        // Math
        double x=Math.sqrt(144);
        double y=Math.pow(5,2);
        System.out.println(Math.PI);
        // Casting
        int pi2=(int) Math.PI;
        System.out.println(pi2);

        double resultado3= sete/(double)dois; //  7/2.0=3.5

        //Operadores 2
        int valor=5;
        valor++; //incremento +1
        valor--; //decremento -1
        valor +=10; //valor=valor+10

        //Operadores relacionais
        boolean teste1=5>1; // true
        boolean teste3=5<1; //false
        boolean teste4 =5==5;
        boolean teste5= 5!=1;

        //Operadores lógicos
        boolean teste8=true && false;//E
        boolean teste9=true || false;//OU
        boolean teste10=(5>10)&&(10<5);
        boolean teste11=(10>=0) || (1<5);
        boolean teste12=!teste11; //NOT


    }
}
