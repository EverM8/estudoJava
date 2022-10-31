package aulas.poo;

public class Gato extends Pet{
    //atributos
    private String raca;
    private String comidaFavorita;

    //construtor
    Gato(String nome, int idade, double peso, String raca, String comidaFavorita){
        super(nome, idade, peso);
        this.raca=raca;
        this.comidaFavorita=comidaFavorita;
    }

    //métodos(ações)

    @Override
    public void fazerSom() {
        System.out.println("Miau!");

    }

    @Override
    public void comer(String comida) {
        if(comida.equals(comidaFavorita)){
            this.fazerSom();
            System.out.println("Estou comendo "+comida);
            this.peso+=0.3;
        }else{
            System.out.println("Não como "+comida+"!");
        }
    }

    public void cacarRatos(){
        this.fazerSom();
        System.out.println("Estou caçando um rato");
    }

    public static void main(String[] args) {
        Gato gato1=new Gato("Cat",3,5,"Siamês","Peixe");

        gato1.fazerSom();
        gato1.comer("Frango");
        gato1.comer("Peixe");
        System.out.println(gato1.getPeso());
    }

}
