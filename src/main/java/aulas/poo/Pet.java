package aulas.poo;

//super classe
public class Pet {
    private String nome;
    private int idade;
    protected double peso;
    //nas subclasses o atributo/método private não é acessível
    //protected => permite acesso direto nas subclasses


    //construtor
    public Pet(String nome, int idade, double peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
    }

    public void fazerSom(){
        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Estou comendo "+comida);
    }

    public void dormir(){
        System.out.println("zzzzzzzz...");
    }

    public void brincar(){
        System.out.println("Estou brincando...");
    }

    //double peso=pet.getPeso();
    public double getPeso(){ //possibilidade de alterar o peso
        return this.peso;
    }

    //pet.peso=231231;
    //pet.setPeso(232);
    public void setPeso(double novoPeso){
        this.peso=novoPeso;
    }
}
