package aulas;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //"José" -> J=0, o=1, s=2, é=3
        String nome="Pedro";

        if(nome=="Pedro"){
            System.out.println("São iguais!");
        }

        System.out.println("Digite seu sobrenome:");
        Scanner entrada= new Scanner(System.in);
        String sobrenome= entrada.nextLine();

        if (sobrenome.equals("Pereira")){ // .equals compara o conteúdo das strings
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }

        //sobrenome.equalsIgnoreCase("pereira);// ignora letra maiúscula e minúscula

        //Outros métodos
        String java="Java";
        String ja=java.substring(0,2);//começa do 0 e vai até 2(não incluso)
        String va=java.substring(2); // corta do 2 até o final da string

        System.out.println(ja);
        System.out.println(va);

        String m1="Hello";
        String m2="World!";
        String m3=m1.concat(m2); //.concat =m1+m2

        System.out.println(java.length());//quantos caractéres ela possui
        System.out.println(java.isEmpty());//verifica se está vazia => ""
        System.out.println(java.toUpperCase());//Java em CAIXA ALTA
        System.out.println(java.toLowerCase());//Java em caixa baixa

        //Exemplo
        System.out.println("Digite seu nome");
        String  seuNome=entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")){
            System.out.println("Seu nome é JOSÉ");
        }

        String  data="13/10/2022";
        String[] valores=data.split("/"); //{"13","10","2022"]
        System.out.println(valores[0]);//"13"

        String email="exemplo.string@gmail.com";
        String[] valoresEmail=email.split("@");//["exemplo.string", "g"mail.com"]
        System.out.println(valoresEmail[0]);//"exemplo.string"

        String nome2="José souza";
        String[] valoresNome2=nome2.split(" ");
        System.out.println(valoresNome2[0]); //José

        String teste="Amanhã é sexta-feira";
        String[] teste2=teste.split("");//[A, m, a, n, h, ã,  , é,  , s, e, x, t, a, -, f, e, i, r, a]
        System.out.println(Arrays.toString(teste2));

    }
}
