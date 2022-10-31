package aulas.poo;

import java.time.LocalDate;

public class Cliente {
    //atributos
    public int id; //acessível para todos
    private String nome; // acessível para dentro da classe
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    //construtor
    public Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void crescer(){
        this.altura+=0.2;
    }

    //Getter => possibilitam a leitura dos atributos
    //Customizar a leitura dos valores
    public String getNome(){
        return this.nome;
    }

    public  String getSobrenome(){
        return this.sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome+" "+this.sobrenome;
    }

    //Setter => serve para alterar o valor
    //COMO o valor é alterado
    //Validar o novo valor e ver se "faz sentido"
    public  void setAltura(double altura){
        if(altura>0 && altura<2.51){
            this.altura=altura;
            System.out.println("Altura modificada!");
        }else{
            System.out.println("Altura inválida, Atributo não foi modificado.");
        }

    }

    public void setPeso(double novoPeso){
        this.peso=novoPeso;
    }


}
