package aulas.poo;

import java.util.ArrayList;

public class Pessoa { //abstrair => simplificar
        // Propriedades/atributos de uma Pessoa
        String nome;
        String sobrenome;
        int idade;
        double altura;
        double peso;

        ArrayList<Pessoa> conhecidos=new ArrayList<>() ;

        Pessoa() {//construtor de classe
                //this=>representa o objeto
                this.nome="José";
                this.sobrenome="Carlos";
                this.idade=29;
                this.peso=55.0;
                this.altura=1.65;
        }

        Pessoa(String nome,String sobrenome,int idade, double altura, double peso){
                this.nome=nome;
                this.sobrenome=sobrenome;
                this.idade=idade;
                this.peso=peso;
                this.altura=altura;
        }

        Pessoa(String nome,String sobrenome){
                this.nome=nome;
                this.sobrenome=sobrenome;
                this.idade=0;
                this.peso=0.5;
                this.altura=2.0;
        }

        //Ações de uma Pessoa
        //<tipo_retirbi> nomeDoMetodo(PARAMETROS) { }
        void dizOla() {//Método que não retorna nada
            System.out.println("Olá, tudo bem? Meu nome é "+this.nome);
        }

        void mostrarIMC(){
                //double imc=this.peso/(Math.pow(this.altura,2));
                double imc=this.calculaImc();
                System.out.println("O meu IMC é "+imc);
        }

        double calculaImc(){//DEVE retornar um valor
                double imc=this.peso/(Math.pow(this.altura,2));
                return imc;
        }

        void  comer(String comida){
                System.out.println("Estou comendo "+comida);
                this.peso+=1.5;
        }

        void  cumprimentar(Pessoa pessoa){
                this.dizOla();
                pessoa.dizOla();

                if (!this.conhecePessoa(pessoa)){
                        this.addPessoaNova(pessoa);
                        pessoa.addPessoaNova(this); //this é o objeto que chama cumprimentar()
                }
        }

        void addPessoaNova(Pessoa pessoa){//faz o objeto "conhecer"
                System.out.println(this.nome+" conheceu "+pessoa.nome+"!!!");
                this.conhecidos.add(pessoa);
        }
        boolean conhecePessoa(Pessoa pessoa){
                //se true = pessoa (this) conhece a outra pessoa
                //se false = não conhece
                return this.conhecidos.contains(pessoa);
        }


    }

