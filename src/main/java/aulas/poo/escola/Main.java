package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno=new Aluno("Carlos","Carlos@email.com", "0000000",7.5);
        aluno.seApresentar();


        Professor prof=new Professor("João","joao@email.com","001002","TI");
        prof.seApresentar();

        Pessoa p1=new Pessoa("Maria","maria@email.com","011012");
        p1.seApresentar();

        //Aluno é uma Pessoa
        Pessoa p2=new Aluno("Carlos","Carlos@email.com", "0000000",7.5);

        //Professor é uma pessoa
        Pessoa p3=new Professor("João","joao@email.com","001002","TI");
        System.out.println("======================");
        p2.seApresentar();
        p3.seApresentar();

        //Polimorfismo
        System.out.println("======PESSOAS========");
        ArrayList<Pessoa> pessoas=new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa:pessoas){
            //o método seApresentar se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }
    }
}
