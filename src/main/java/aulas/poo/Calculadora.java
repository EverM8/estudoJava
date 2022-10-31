package aulas.poo;

public class Calculadora {

    //atributo estático
    public static final double PI=3.1415;
    //final = impede a alteração do valor de PI

    //Método estático(static)
    //Não pertence ao objeto, mas sim a classe
    public static double soma(double a, double b){
        return a+b;
    }

    public static double subtracao(double a, double b){
        return a-b;
    }

    public static double multiplicacao(double a, double b){
        return a*b;
    }

    public static double divisao(double a, double b){
        return a/b;
    }

    //main=auto-executável
    public static void main(String[] args){
       double resultadoSoma=Calculadora.soma(1,2);
        double resultadoSub=Calculadora.subtracao(10,2);
        double resultadoMult=Calculadora.multiplicacao(10,2);
        double resultadoDiv=Calculadora.divisao(0.01,20);
        System.out.println(Calculadora.PI);



    }
}
