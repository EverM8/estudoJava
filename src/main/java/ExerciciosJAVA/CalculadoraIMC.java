package ExerciciosJAVA;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Qual seu nome ?");
        String nome=entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade=entrada.nextInt();

        System.out.println("Qual sua altura (m)?");
        double altura= entrada.nextDouble();//deve ser digitado com virgúla(padrão BR)

        System.out.println("Qual seu peso (kg)?");
        double peso= entrada.nextDouble();

        // calculo IMC=PESO/ALTURA^2
        double imc=peso/Math.pow(altura, 2);

        System.out.println(nome+" seu IMC é "+imc);
        System.out.printf("%s seu IMC é %.2f\n",nome, imc);
        System.out.printf(nome+" seu IMC é %.2f\n", imc);


        if(imc<17){
            System.out.println("Muito abaixo do peso");
        }else if(imc >= 17 && imc <= 18.49){
            System.out.println("Abaixo do peso");
        }else if(imc>=18.5 && imc<=24.99){
            System.out.println("Peso normal");
        }else if(imc>=25 && imc<=29.99){
            System.out.println("Acima do peso");
        }else if(imc>=30 && imc<=34.99){
            System.out.println("Obesidade I");
        }else if(imc>=35 && imc<=39.99){
            System.out.println("Obesidade II (severa)");
        }else if(imc>40){
            System.out.println("Obesidade III (mórbida)");
        }

        //Switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta= entrada.nextInt();

        switch(dieta){
            case 1:
                System.out.println("Você escolheu a dieta da água");
                break; // impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta");
                break; // impedir de testar as condições abaixo
            case 3:
                System.out.println("Você escolheu a dieta da batata");
                break; // impedir de testar as condições abaixo
            default:
                System.out.println("Esta dieta não existe, escolha entre as 3 dietas informadas");

    }

    System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos= entrada.nextInt();

        for(int i=0;i<totalAlimentos;i++){
            System.out.println("Informe o alimento:");
            String alimento= entrada.next();
            System.out.printf("Você gosta de %s",alimento);
        }

        int i=0;
        while (i<totalAlimentos){
            System.out.println(i);
            i++;
        }

        System.out.println(i);

    }
}
