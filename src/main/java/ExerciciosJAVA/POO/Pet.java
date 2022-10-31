/*2)

        Crie uma classe Bichinho:
        * Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
        * Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
        * Métodos:
        - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
        - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
        - acordar() => altera o boolean estaDormindo p/ false

        Crie uma classe Comida:
        * Atributos: nome, peso;
        * Construtores: Cria a comida com base nos parâmetros nome e peso;
        * Métodos:
        - getNome()
        - getP*/

package ExerciciosJAVA.POO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pet {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;
    private LocalDateTime dataDeCriacao;

    private Pet(String nome, int idade, double peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
        this.bucho=new ArrayList<>();//bucho vazio
        this.estaDormindo=false;
        this.dataDeCriacao=LocalDateTime.now();
    }

    public Comida getUltimaComida(){
        if(this.bucho.size()>0){
            return this.bucho.get(this.bucho.size()-1);
        }else{
            return null;
        }
    }

    /*  - comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
        - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
        - acordar() => altera o boolean estaDormindo p/ false */

    public void comer(Comida comida){
        if(this.estaDormindo ){
            System.out.println("Zzzzzzz");
            }else{//etá acordado
                if (this.bucho.contains(comida)){//ele já comeu
                    System.out.println("Já comi "+comida.getNome()+"!");
                }else{
                    this.bucho.add(comida);
                    this.peso += comida.getPeso();
                    System.out.println("Estou comendo "+comida.getNome()+" e ganhei "+comida.getPeso()+" kilos, agora peso "+this.peso);
                }
            }
        }


    public void dormir(int horas){
           this.estaDormindo=true;
           double porcentagemPeso=this.peso*0.1;
           double novoPeso=horas*porcentagemPeso;
           this.peso-=novoPeso;
        }

        public void acordar(){
        this.estaDormindo=false;
            System.out.println("Acorde e agora peso "+this.peso);
        }

    public static void main(String[] args) {
        Pet pou=new Pet("Pou",5,100);
        Comida batata=new Comida("Batata",15);
        pou.comer(batata);
        pou.comer(batata);
        pou.dormir(2);
        pou.comer(batata);
        pou.acordar();
    }
    }

