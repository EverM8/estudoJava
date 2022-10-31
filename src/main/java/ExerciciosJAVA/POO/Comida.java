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
        - getP */

package ExerciciosJAVA.POO;

public class Comida {
    private  String nome;
    private double peso;

    Comida(String nome, double peso){
        this.nome=nome;
        this.peso=peso;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPeso() {
        return this.peso;
    }
}
